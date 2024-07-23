package org.identity.entity;

import jakarta.persistence.*;
import org.identity.annotation.PhoneUuidGeneratorType;

@Entity
public class PhoneEntity extends BaseEntity{

    @Id
    @PhoneUuidGeneratorType(name = "PhoneUuidGeneratorType")
    private String phone_uuid;

    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_uuid")
    private PersonEntity person;

    private Boolean preferred;
}
