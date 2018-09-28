package org.springframework.samples.petclinic.services;

import java.util.List;

import org.springframework.samples.petclinic.model.Bill;

public interface BillService {

	List<Bill> findAll();
	
	Bill findById(Integer id);
	
	Bill save(Bill b);
	
	void delete(Bill b);
	
	void deleteAll();
	
	List<Bill> findByVisitNotNull();
	
	List<Bill> findByVisitNull();
}
