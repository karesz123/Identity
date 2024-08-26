package org.identity.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.identity.generator.PhoneUuidGeneratorType;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name = "phone")
public class PhoneEntity extends BaseEntity{

    @Id
    @PhoneUuidGeneratorType(name = "PhoneUuidGeneratorType")
    private String phoneUuid;

    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_uuid")
    private PersonEntity person;

    private Boolean preferred;
}
