package org.identity.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.identity.generators.EmailUuidGeneratorType;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name = "email")
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
