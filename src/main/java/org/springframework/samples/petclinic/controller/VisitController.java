package org.springframework.samples.petclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.services.VisitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visits")
public class VisitController {

	@Autowired
	private VisitService visitService;

	@GetMapping
	public List<Visit> findAll() {
		System.out.println("Get visits!");
		return this.visitService.findAll();
	}

}
