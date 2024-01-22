package org.identity.repositories;

import org.identity.entities.ContactsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<String, ContactsEntity> {
}
