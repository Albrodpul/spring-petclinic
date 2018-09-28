package org.springframework.samples.petclinic.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.services.PetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pets")
public class PetController {

	@Autowired
	private PetService petService;

	@GetMapping
	public List<Pet> findAll() {
		System.out.println("Get pets!");
		List<Pet> res = new LinkedList<Pet>();
		for (Pet pet : this.petService.findAll()) {
			System.out.println(pet);
			Pet p = new Pet();
			p.setId(pet.getId());
			p.setName(pet.getName());
			p.setType(pet.getType());
			p.setBirthDate(pet.getBirthDate());
			res.add(p);
		}
		return res;
	}

}
