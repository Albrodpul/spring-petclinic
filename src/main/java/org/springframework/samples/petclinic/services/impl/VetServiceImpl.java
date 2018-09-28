package org.springframework.samples.petclinic.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.repository.VetRepository;
import org.springframework.samples.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceImpl implements VetService {

	@Autowired
	private VetRepository vetRepository;
	
	@Override
	public Vet save(Vet v) {
		// TODO Auto-generated method stub
		return this.vetRepository.save(v);
	}

	@Override
	public Vet findById(Integer id) {
		// TODO Auto-generated method stub
		return this.vetRepository.findById(id);
	}

	@Override
	public List<Vet> findAll() {
		// TODO Auto-generated method stub
		return this.vetRepository.findAll();
	}

	@Override
	public List<Vet> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return this.vetRepository.findByLastName(lastName);
	}

	@Override
	public List<Vet> findByFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return this.vetRepository.findByFirstNameAndLastName(firstName, lastName);
	}

	@Override
	public List<Vet> findByFirstNameOrLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return this.vetRepository.findByFirstNameOrLastName(firstName, lastName);
	}

	@Override
	public List<Vet> findBySpecialityName(String name) {
		// TODO Auto-generated method stub
		return this.vetRepository.findBySpecialityName(name);
	}
	
	

}
