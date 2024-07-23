package org.identity.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmailDto {

    private String email;
    private PersonDto person;
    private Boolean preferred;
    private LocalDateTime createdTs;
    private LocalDateTime modifiedTs;
}
