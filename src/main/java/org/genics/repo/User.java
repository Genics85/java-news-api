package org.genics.repo;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;
import org.genics.utils.UserType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@ToString
@Table
@Entity
public class User extends PanacheEntityBase implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotBlank
    String firstName;
    @NotBlank
    String lastName;
    @NotNull
    UserType userType=UserType.USER;
    @NotNull
    Integer age;
    @CreationTimestamp
    LocalDateTime created = LocalDateTime.now();
    @UpdateTimestamp
    LocalDateTime updated;
}
