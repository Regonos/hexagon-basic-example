package pl.sci.scitestproject.gallery.domain.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.sci.scitestproject.gallery.domain.AddImageUseCase;
import pl.sci.scitestproject.gallery.domain.GetImageListUseCase;
import pl.sci.scitestproject.gallery.domain.model.AddImage;
import pl.sci.scitestproject.gallery.domain.model.AddedImage;
import pl.sci.scitestproject.gallery.domain.port.ImageCachePort;
import pl.sci.scitestproject.gallery.domain.port.ImageStoragePort;

@Slf4j
@Service
@RequiredArgsConstructor
public class ImageService implements AddImageUseCase, GetImageListUseCase {

    private final ImageStoragePort imageStoragePort;
    private final ImageCachePort imageCachePort;

    @Override
    public AddedImage addImage(AddImage addImage) {

        log.info("Adding image with name: {}", addImage.getImageName());

        var addedImage = imageStoragePort.storeImage(addImage);

        imageCachePort.storeImage(addedImage.getId(), addImage);

        return addedImage;
    }

    @Override
    public Page<AddedImage> getImagesList(Pageable pageable) {
        return imageStoragePort.getImagesList(pageable);
    }
}
