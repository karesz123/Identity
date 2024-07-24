package org.identity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
public class EmailDto {

    private String email;
    private PersonDto person;
    private Boolean preferred;
    private LocalDateTime createdTs;
    private LocalDateTime modifiedTs;
}
