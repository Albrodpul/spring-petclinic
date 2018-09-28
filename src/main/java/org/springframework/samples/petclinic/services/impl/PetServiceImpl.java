package org.springframework.samples.petclinic.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.samples.petclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private PetRepository petRepository;

	@Override
	public List<Pet> findByGreaterThan2010Ordered() {
		Date date1 = null;
		Date date2 = null;
		try {
			date1 = new SimpleDateFormat("yyyy/MM/dd").parse("2010/01/01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			date2 = new SimpleDateFormat("yyyy/MM/dd").parse("2010/12/31");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return this.petRepository.findByBirthDateBetweenOrderByBirthDateAsc(date1, date2);
	}

	@Override
	public List<Pet> findByBirthDateBetweenOrderByBirthDateAsc(java.sql.Date date1, java.sql.Date date2) {
		// TODO Auto-generated method stub
		return this.petRepository.findByBirthDateBetweenOrderByBirthDateAsc(date1, date2);
	}

	@Override
	public Pet findById(Integer id) {
		// TODO Auto-generated method stub
		return this.petRepository.findById(id);
	}

	@Override
	public Pet save(Pet p) {
		// TODO Auto-generated method stub
		return this.petRepository.save(p);
	}

	@Override
	public List<Pet> findAll() {
		// TODO Auto-generated method stub
		return this.petRepository.findAll();
	}

}
