package org.identity.service;

import org.identity.dto.PersonDto;
import org.identity.entity.PersonEntity;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface PersonMapper extends Converter<PersonEntity, PersonDto> {
}
