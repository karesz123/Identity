package org.identity.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class PersonEntity {


  @GeneratedValue(generator = "")
  private String uuid;


}
