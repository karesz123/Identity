package org.identity.generators;

import org.hibernate.annotations.IdGeneratorType;
import org.identity.entity.generators.EmailUuidGenerator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@IdGeneratorType(EmailUuidGenerator.class)
@Retention(RetentionPolicy.RUNTIME) @Target({ElementType.METHOD, ElementType.FIELD})
public @interface EmailUuidGeneratorType {

    String name();

}
