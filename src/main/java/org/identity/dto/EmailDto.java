package org.identity.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmailDto {

    @NotBlank
    @Email(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message = "Invalid email address")
    private String email;
    private PersonDto person;
    private Boolean preferred;
    private LocalDateTime createdTs;
    private LocalDateTime modifiedTs;
}
