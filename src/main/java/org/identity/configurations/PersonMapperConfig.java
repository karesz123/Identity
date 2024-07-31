package org.identity.configurations;

import org.identity.dto.PersonDto;
import org.identity.entity.PersonEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonMapperConfig {

    private static class PropertyToPersonDto extends PropertyMap<PersonEntity, PersonDto> {

        @Override
        protected void configure() {
            skip(destination.getPassword());
            skip(destination.getEmails());
            skip(destination.getPhones());
        }
    }

    private static class PropertyToPersonEntity extends PropertyMap<PersonDto, PersonEntity> {

        @Override
        protected void configure() {
            skip(destination.getPassword());
        }
    }

    @Bean
    public ModelMapper personEntityToPersonDtoMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new PropertyToPersonDto());
        return modelMapper;
    }

    @Bean
    public ModelMapper personDtoToPersonEntityMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new PropertyToPersonDto());
        return modelMapper;
    }
}
