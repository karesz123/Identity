package org.identity.repository;

import org.identity.entity.PersonEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, String> {

    PersonEntity findByPersonUuid(String uuid);

    @Override
    Page<PersonEntity> findAll(Pageable pageable);

    @Override
    PersonEntity saveAndFlush(PersonEntity person);
}
