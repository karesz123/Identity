package org.identity.generator;

import org.hibernate.annotations.IdGeneratorType;
import org.identity.entity.generators.PersonUuidGenerator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@IdGeneratorType(PersonUuidGenerator.class)
@Retention(RetentionPolicy.RUNTIME) @Target({ElementType.METHOD, ElementType.FIELD})
public @interface PersonUuidGeneratorType {

    String name();
}
