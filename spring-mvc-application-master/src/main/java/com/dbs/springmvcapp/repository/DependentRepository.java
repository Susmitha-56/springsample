package com.dbs.springmvcapp.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.springmvcapp.model.Dependent;
import com.dbs.springmvcapp.model.Employee;

@Repository
public interface DependentRepository extends JpaRepository<Dependent ,Integer>  {

	Optional<Employee> findByName(String name);
	List<Dependent> findAll();
}
