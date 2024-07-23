package org.identity.repository;

import org.identity.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, String> {

    @Override
    List<PersonEntity> findAll();
}
