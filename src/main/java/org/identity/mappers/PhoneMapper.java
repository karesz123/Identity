package org.identity.mappers;

import org.identity.dto.PhoneDto;
import org.identity.entity.PhoneEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhoneMapper {

    PhoneDto phoneToPhoneDto(PhoneEntity phoneEntity);
}
