package org.springframework.samples.petclinic.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.repository.VisitRepository;
import org.springframework.samples.petclinic.services.VisitService;
import org.springframework.stereotype.Service;

@Service
public class VisitServiceImpl implements VisitService {

	@Autowired
	private VisitRepository visitRepository;
	
	@Override
	public List<Visit> findByPetId(Integer petId) {
		// TODO Auto-generated method stub
		return this.visitRepository.findByPetId(petId);
	}

	public Visit save(Visit v) {
		// TODO Auto-generated method stub
		return this.visitRepository.save(v);
	}

	@Override
	public List<Visit> findAll() {
		// TODO Auto-generated method stub
		return this.visitRepository.findAll();
	}

	@Override
	public List<Visit> findTop4ByOrderByDateDesc() {
		// TODO Auto-generated method stub
		return this.visitRepository.findTop4ByOrderByDateDesc();
	}

}
