package pl.sci.scitestproject.gallery.domain;

import pl.sci.scitestproject.gallery.domain.model.AddImage;
import pl.sci.scitestproject.gallery.domain.model.AddedImage;

public interface AddImageUseCase {

    AddedImage addImage(AddImage addImage);
}
