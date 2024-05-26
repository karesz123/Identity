package org.identity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PhoneEntity {

    @Id
    @GeneratedValue(generator = "")
    private String phone_uuid;

}
