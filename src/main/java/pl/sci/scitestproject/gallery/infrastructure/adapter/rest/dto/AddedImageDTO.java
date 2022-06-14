package pl.sci.scitestproject.gallery.infrastructure.adapter.rest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddedImageDTO {

    private final String imageName;
}
