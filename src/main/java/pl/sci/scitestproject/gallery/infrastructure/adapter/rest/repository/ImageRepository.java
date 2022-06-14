package pl.sci.scitestproject.gallery.infrastructure.adapter.rest.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.sci.scitestproject.gallery.infrastructure.adapter.rest.entity.ImageEntity;

import java.util.UUID;

public interface ImageRepository extends PagingAndSortingRepository<ImageEntity, UUID> {
}
