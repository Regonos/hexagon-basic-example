package pl.sci.scitestproject.gallery.infrastructure.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sci.scitestproject.gallery.domain.model.AddImage;
import pl.sci.scitestproject.gallery.domain.port.ImageCachePort;

import java.util.Map;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ImageCacheAdapter implements ImageCachePort {

    private final Map<UUID, AddImage> cacheMap;

    @Override
    public void storeImage(UUID id, AddImage addImage) {
        cacheMap.put(id, addImage);
    }

    @Override
    public AddImage get(UUID id) {
        return cacheMap.get(id);
    }
}
