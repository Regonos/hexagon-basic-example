package pl.sci.scitestproject.gallery.infrastructure.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.sci.scitestproject.gallery.domain.model.AddImage;
import pl.sci.scitestproject.gallery.domain.model.AddedImage;
import pl.sci.scitestproject.gallery.domain.port.ImageStoragePort;
import pl.sci.scitestproject.gallery.infrastructure.adapter.rest.entity.ImageEntity;
import pl.sci.scitestproject.gallery.infrastructure.adapter.rest.repository.ImageRepository;

import java.util.UUID;

@Service
@Profile("!mock")
@RequiredArgsConstructor
public class ImageStorageAdapter implements ImageStoragePort {

    private final ImageRepository imageRepository;

    @Override
    public AddedImage storeImage(AddImage addImage) {
        ImageEntity imageEntity = new ImageEntity();

        imageEntity.setId(UUID.randomUUID());
        imageEntity.setName(addImage.getImageName());

        ImageEntity savedEntity = imageRepository.save(imageEntity);

        return AddedImage.builder()
            .id(savedEntity.getId())
            .imageName(savedEntity.getName())
            .build();
    }

    @Override
    public Page<AddedImage> getImagesList(Pageable pageable) {

        Page<ImageEntity> imagesPage = imageRepository.findAll(pageable);

        return imagesPage.map(image ->
            AddedImage.builder()
                .id(image.getId())
                .imageName(image.getName())
                .build());
    }
}
