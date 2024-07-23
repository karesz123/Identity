package org.identity.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PhoneDto {

    private String phone;
    private PersonDto person;
    private Boolean preferred;
    private LocalDateTime createdTs;
    private LocalDateTime modifiedTs;
}
