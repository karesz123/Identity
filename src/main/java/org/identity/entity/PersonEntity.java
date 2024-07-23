package org.identity.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.identity.annotation.PersonUuidGeneratorType;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name = "person")
public class PersonEntity extends BaseEntity {

  @Id
  @PersonUuidGeneratorType(name = "PersonUuidGeneratorType")
  private String person_uuid;

  private String firstName;
  private String lastName;
  private String password;

  @OneToMany(mappedBy = "person", fetch = FetchType.EAGER)
  List<EmailEntity> emails;
  @OneToMany(mappedBy = "person", fetch = FetchType.EAGER)
  List<PhoneEntity> phones;

}
