package org.identity.generator;

import org.hibernate.annotations.IdGeneratorType;
import org.identity.entity.generators.PhoneUuidGenerator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@IdGeneratorType(PhoneUuidGenerator.class)
@Retention(RetentionPolicy.RUNTIME) @Target({ElementType.METHOD, ElementType.FIELD})
public @interface PhoneUuidGeneratorType {

    String name();
}
