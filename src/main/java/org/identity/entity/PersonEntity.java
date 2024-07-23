package org.identity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.identity.annotation.PersonUuidGeneratorType;

import java.util.List;

@Entity
public class PersonEntity extends BaseEntity {

  @Id
  @PersonUuidGeneratorType(name = "PersonUuidGeneratorType")
  private String person_uuid;

  private String fistName;
  private String lastName;
  private String password;

  @OneToMany(mappedBy = "person", fetch = FetchType.EAGER)
  List<EmailEntity> emails;
  @OneToMany(mappedBy = "person", fetch = FetchType.EAGER)
  List<PhoneEntity> phones;

}
