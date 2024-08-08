package org.identity.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.identity.validator.PersonsContacts;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@PersonsContacts
public class PersonDto {

    private String firstName;
    private String lastName;
    private String password;
    private List<EmailDto> emails;
    private List<PhoneDto> phones;
    private LocalDateTime createdTs;
    private LocalDateTime modifiedTs;
}
