package pl.sci.scitestproject.gallery.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.sci.scitestproject.gallery.domain.model.AddedImage;

public interface GetImageListUseCase {

    Page<AddedImage> getImagesList(Pageable pageable);
}
