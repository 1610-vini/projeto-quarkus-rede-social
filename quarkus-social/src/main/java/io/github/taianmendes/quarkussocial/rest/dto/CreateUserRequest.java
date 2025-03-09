package io.github.taianmendes.quarkussocial.rest.dto;

import jakarta.validation.constraints.NotNull;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateUserRequest {

    @NotBlank(message = "Name is Required")
    private String name;
    @NotNull(message = "Age is Required")
    private Integer age;


}
