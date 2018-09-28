package org.springframework.samples.petclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.services.OwnerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/owners")
public class OwnerController {

	@Autowired
	private OwnerService ownerService;

	@CrossOrigin
	@GetMapping
	public List<Owner> findAll() {
		System.out.println("Get owners!");
		return this.ownerService.findAll();
	}


}
