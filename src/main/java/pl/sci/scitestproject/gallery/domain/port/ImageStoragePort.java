package pl.sci.scitestproject.gallery.domain.port;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.sci.scitestproject.gallery.domain.model.AddImage;
import pl.sci.scitestproject.gallery.domain.model.AddedImage;

public interface ImageStoragePort {

    AddedImage storeImage(AddImage addImage);

    Page<AddedImage> getImagesList(Pageable pageable);
}
