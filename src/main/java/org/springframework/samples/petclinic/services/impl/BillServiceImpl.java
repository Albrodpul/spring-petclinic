package org.springframework.samples.petclinic.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Bill;
import org.springframework.samples.petclinic.repository.BillRepository;
import org.springframework.samples.petclinic.services.BillService;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillRepository billRepository;
	
	@Override
	public List<Bill> findAll() {
		// TODO Auto-generated method stub
		return this.billRepository.findAll();
	}

	@Override
	public Bill findById(Integer id) {
		// TODO Auto-generated method stub
		return this.billRepository.findById(id);
	}

	@Override
	public Bill save(Bill b) {
		// TODO Auto-generated method stub
		return this.billRepository.save(b);
	}

	@Override
	public void delete(Bill b) {
		// TODO Auto-generated method stub
		this.billRepository.delete(b);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		this.billRepository.deleteAll();
	}

	@Override
	public List<Bill> findByVisitNotNull() {
		// TODO Auto-generated method stub
		return this.billRepository.findByVisitNotNull();
	}

	@Override
	public List<Bill> findByVisitNull() {
		// TODO Auto-generated method stub
		return this.billRepository.findByVisitNull();
	}
	
	

}
