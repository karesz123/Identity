package org.identity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EmailEntity {

    @Id
    @GeneratedValue(generator = "")
    private String email_uuid;

}