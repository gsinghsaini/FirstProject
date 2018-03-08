package com.gsinghsaini.firstproject.service.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MyRepository extends CrudRepository<Employee, Integer> {

    Optional<Employee> findByName(String name);

}
