package org.identity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.identity.annotation.PhoneUuidGeneratorType;

@Entity
public class PhoneEntity {

    @Id
    @PhoneUuidGeneratorType(name = "PhoneUuidGeneratorType")
    private String phone_uuid;

}
