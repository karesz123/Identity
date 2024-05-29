package org.identity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.identity.annotation.EmailUuidGeneratorType;

@Entity
public class EmailEntity {

    @Id
    @EmailUuidGeneratorType(name = "EmailUuidGeneratorType")
    private String email_uuid;

}
