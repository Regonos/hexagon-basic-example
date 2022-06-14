package pl.sci.scitestproject.gallery.infrastructure.adapter.rest.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sci.scitestproject.gallery.domain.model.AddImage;
import pl.sci.scitestproject.gallery.domain.model.AddedImage;
import pl.sci.scitestproject.gallery.infrastructure.adapter.rest.dto.AddedImageDTO;

import javax.validation.Valid;

@RequestMapping(path = "/image", produces = MediaType.APPLICATION_JSON_VALUE)
public interface ImageApi {

    @PostMapping
    AddedImageDTO addedImage(@Valid @RequestBody AddImage addImage);

    @GetMapping
    Page<AddedImage> getImagesList(Pageable pageable);
}
