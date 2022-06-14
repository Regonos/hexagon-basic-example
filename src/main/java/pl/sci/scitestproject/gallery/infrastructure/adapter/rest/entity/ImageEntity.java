package pl.sci.scitestproject.gallery.infrastructure.adapter.rest.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@Entity
@FieldNameConstants
@Table(name = "image")
public class ImageEntity {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(nullable = false)
    private String name;
}
