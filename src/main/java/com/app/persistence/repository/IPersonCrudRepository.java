package com.app.persistence.repository;

import com.app.persistence.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonCrudRepository extends CrudRepository<PersonEntity,Long> {
}
