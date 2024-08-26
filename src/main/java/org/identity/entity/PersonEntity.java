package org.identity.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.identity.generator.PersonUuidGeneratorType;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name = "person")
public class PersonEntity extends BaseEntity {

  @Id
  @PersonUuidGeneratorType(name = "PersonUuidGeneratorType")
  private String personUuid;
  private String firstName;

  private String lastName;
  private String password;

  @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
  List<EmailEntity> emails;
  @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
  List<PhoneEntity> phones;

}
