package pl.sci.scitestproject.gallery.infrastructure.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;
import pl.sci.scitestproject.gallery.domain.AddImageUseCase;
import pl.sci.scitestproject.gallery.domain.GetImageListUseCase;
import pl.sci.scitestproject.gallery.domain.model.AddImage;
import pl.sci.scitestproject.gallery.domain.model.AddedImage;
import pl.sci.scitestproject.gallery.infrastructure.adapter.rest.api.ImageApi;
import pl.sci.scitestproject.gallery.infrastructure.adapter.rest.dto.AddedImageDTO;

@RestController
@RequiredArgsConstructor
public class ImageResource implements ImageApi {

    private final AddImageUseCase addImageUseCase;
    private final GetImageListUseCase getImageListUseCase;

    @Override
    public AddedImageDTO addedImage(AddImage addImage) {
        var addedImage = addImageUseCase.addImage(addImage);

        return AddedImageDTO.builder()
            .imageName(addedImage.getImageName())
            .build();
    }

    @Override
    public Page<AddedImage> getImagesList(Pageable pageable) {
        return getImageListUseCase.getImagesList(pageable);
    }
}
