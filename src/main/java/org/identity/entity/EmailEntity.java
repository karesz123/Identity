package org.identity.entity;

import jakarta.persistence.*;
import org.identity.annotation.EmailUuidGeneratorType;

@Entity
public class EmailEntity extends BaseEntity{

    @Id
    @EmailUuidGeneratorType(name = "EmailUuidGeneratorType")
    private String email_uuid;

    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_uuid")
    private PersonEntity person;

    private Boolean preferred;
}
