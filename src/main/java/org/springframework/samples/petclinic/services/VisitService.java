package org.springframework.samples.petclinic.services;

import java.util.Date;
import java.util.List;

import org.springframework.samples.petclinic.model.Visit;

public interface VisitService {
	
	List<Visit> findByPetId(Integer petId);
	
	Visit save(Visit v);

	List<Visit> findAll();
	
	List<Visit> findTop4ByOrderByDateDesc();
    
}
