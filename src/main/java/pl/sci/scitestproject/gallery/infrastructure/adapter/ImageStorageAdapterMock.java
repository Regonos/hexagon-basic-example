package pl.sci.scitestproject.gallery.infrastructure.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.sci.scitestproject.gallery.domain.model.AddImage;
import pl.sci.scitestproject.gallery.domain.model.AddedImage;
import pl.sci.scitestproject.gallery.domain.port.ImageStoragePort;
import pl.sci.scitestproject.gallery.infrastructure.adapter.rest.repository.ImageRepository;

@Service
@Profile("mock")
@RequiredArgsConstructor
public class ImageStorageAdapterMock implements ImageStoragePort {

    private final ImageRepository imageRepository;

    @Override
    public AddedImage storeImage(AddImage addImage) {
        return AddedImage.builder()
            .imageName("mock")
            .build();
    }

    @Override
    public Page<AddedImage> getImagesList(Pageable pageable) {
        return Page.empty();
    }
}
