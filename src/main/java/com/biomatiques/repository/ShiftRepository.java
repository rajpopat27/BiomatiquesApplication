package com.biomatiques.repository;

import org.springframework.data.repository.CrudRepository;


import com.biomatiques.model.Shift;

public interface ShiftRepository extends CrudRepository<Shift,Long> {
	
	
}