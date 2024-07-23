package org.identity.dto;


import com.googlecode.jmapper.annotations.JMap;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class PersonDto {

    @JMap
    private String fistName;
    @JMap
    private String lastName;
    @JMap
    private String password;
    @JMap
    private List<EmailDto> emails;
    @JMap
    private List<PhoneDto> phones;
    @JMap
    private LocalDateTime createdTs;
    @JMap
    private LocalDateTime modifiedTs;
}
