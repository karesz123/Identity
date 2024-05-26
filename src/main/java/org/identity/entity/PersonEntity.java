package org.identity.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PersonEntity {

  @Id
  @GeneratedValue(generator = "")
  private String person_uuid;


}
