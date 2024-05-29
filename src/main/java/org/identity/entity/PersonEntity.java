package org.identity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.identity.annotation.PersonUuidGeneratorType;

@Entity
public class PersonEntity {

  @Id
  @PersonUuidGeneratorType(name = "PersonUuidGeneratorType")
  private String person_uuid;

}
