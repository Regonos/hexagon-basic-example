package pl.sci.scitestproject.gallery.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class AddedImage {

    private final UUID id;
    private final String imageName;
}
