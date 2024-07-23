package org.identity.mappers;

import org.identity.dto.PersonDto;
import org.identity.entity.PersonEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonDto personToPersonDto(PersonEntity personEntity);
}
