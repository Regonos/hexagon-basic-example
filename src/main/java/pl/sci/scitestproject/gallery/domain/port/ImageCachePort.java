package pl.sci.scitestproject.gallery.domain.port;

import pl.sci.scitestproject.gallery.domain.model.AddImage;

import java.util.UUID;

public interface ImageCachePort {

    void storeImage(UUID id, AddImage addImage);

    AddImage get(UUID id);
}
