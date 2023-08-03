package org.genics.repo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserCreateDto {
    @NotBlank
    String firstName;
    @NotBlank
    String lastName;
    @NotNull
    Integer age;
}
