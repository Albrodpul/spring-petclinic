package org.springframework.samples.petclinic.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.samples.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;
	
	@Override
	public Owner findById(Integer id) {
		// TODO Auto-generated method stub
		return this.ownerRepository.findById(id);
	}

	@Override
	public List<Owner> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return this.ownerRepository.findByFirstNameContainingOrLastNameContaining(firstName, lastName);
	}

	@Override
	public List<Owner> findByOrderByLastName() {
		// TODO Auto-generated method stub
		return this.ownerRepository.findByOrderByLastName();
	}

	@Override
	public List<Owner> findAll() {
		List<Owner> lista = this.ownerRepository.findAll();
		
		return this.ownerRepository.findAll();
	}

}
