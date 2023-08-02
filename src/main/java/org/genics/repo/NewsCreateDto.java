package org.genics.repo;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class NewsCreateDto implements Serializable {
    @NotBlank
    String body;
    @NotBlank
    String title;
}
