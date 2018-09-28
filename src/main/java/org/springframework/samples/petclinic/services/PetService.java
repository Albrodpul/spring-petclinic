package org.springframework.samples.petclinic.services;

import java.sql.Date;
import java.util.List;

import org.springframework.samples.petclinic.model.Pet;

public interface PetService {
	
	List<Pet> findByGreaterThan2010Ordered();
	
	List<Pet> findByBirthDateBetweenOrderByBirthDateAsc(Date date1, Date date2);
	
	Pet findById(Integer id);
	
	Pet save(Pet p);

	List<Pet> findAll();
    
}
