package org.springframework.samples.petclinic.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Vet;

public interface VetService {

	Vet save(Vet v);
	
	Vet findById(Integer id);
	
	List<Vet> findAll();
	
	List<Vet> findByLastName(String lastName);
	
	List<Vet> findByFirstNameAndLastName(String firstName, String lastName);
	
	List<Vet> findByFirstNameOrLastName(String firstName, String lastName);
	
	@Query("select v from Vet v join fetch v.specialties s where s.name=:name")
	List<Vet> findBySpecialityName(@Param("name") String name);	
}
