package org.identity.repository;

import org.identity.entity.PersonEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, String> {

    @Override
    Page<PersonEntity> findAll(Pageable pageable);

    @Override
    PersonEntity saveAndFlush(PersonEntity person);
}
