package org.identity.repositories;

import org.identity.entities.EmailContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<String, EmailContactEntity> {
}
