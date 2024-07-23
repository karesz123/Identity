package org.identity.mappers;

import org.identity.dto.EmailDto;
import org.identity.entity.EmailEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmailMapper {

    EmailDto emailToEmailDto(EmailEntity emailEntity);
}
