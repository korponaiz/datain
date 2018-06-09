package com.zolee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zolee.domain.Data;
import com.zolee.repository.DataRepository;

@Service
public class DataService {

	private DataRepository dataRepository;

	@Autowired
	public void setDataRepository(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}
	
	public List<Data> findAll(){
		return dataRepository.findAll();
	}

	public void save(Data data) {
		dataRepository.save(data);
	}
	
	public void delete(long id) {
		dataRepository.deleteById(id);
	}
}
