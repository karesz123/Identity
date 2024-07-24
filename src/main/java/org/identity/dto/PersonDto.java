package org.identity.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class PersonDto {

    private String firstName;
    private String lastName;
    private String password;
    private List<EmailDto> emails;
    private List<PhoneDto> phones;
    private LocalDateTime createdTs;
    private LocalDateTime modifiedTs;
}
