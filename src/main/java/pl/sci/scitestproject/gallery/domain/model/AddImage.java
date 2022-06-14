package pl.sci.scitestproject.gallery.domain.model;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@Jacksonized
public class AddImage {

    @NotBlank
    private final String imageName;
}
