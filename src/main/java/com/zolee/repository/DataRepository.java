package com.zolee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zolee.domain.Data;

public interface DataRepository extends CrudRepository<Data, Long> {

	List<Data> findAll();
	
	List<Data> findByName(String name);
	
	List<Data> findByAge(int age);
	
}
