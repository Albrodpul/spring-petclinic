package org.springframework.samples.petclinic.controller;

import java.util.LinkedList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.Bill;
import org.springframework.samples.petclinic.services.BillService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

	@Autowired
	private BillService billService;

	@GetMapping
	public List<Bill> findAll(@RequestParam(value = "filter", required = false) String filter) {
		System.out.println("Get bills! " + filter);
		List<Bill> res = new LinkedList<Bill>();
		if (filter != null) {
			if (filter.compareTo("pagadas") == 0 && filter.compareTo("no_pagadas") != 0) {
				res = this.billService.findByVisitNotNull();
			} else if (filter.compareTo("no_pagadas") == 0 && filter.compareTo("pagadas") != 0) {
				res = this.billService.findByVisitNull();
			}
		} else {
			res = this.billService.findAll();
		}
		return res;
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Bill> findById(@PathVariable("id") Integer id) {
		System.out.println("Get bill: " + id);
		if (id == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		} else {
			Bill b = this.billService.findById(id);
			if (b == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(b);
			} else {
				return ResponseEntity.status(HttpStatus.OK).body(b);
			}

		}
	}

	@PostMapping
	public ResponseEntity<HttpStatus> saveBill(@Valid @RequestBody Bill b) {
		System.out.println("POST");
		if (b == null) {
			System.out.println("Bill null");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} else {
			System.out.println(b.toString());
			if (b.getId() != null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
			} else {
				this.billService.save(b);
				return ResponseEntity.status(HttpStatus.CREATED).body(null);
			}
		}

	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<HttpStatus> updateBill(@PathVariable("id") Integer id, @Valid @RequestBody Bill b) {
		Bill fromDB = this.billService.findById(id);
		if (b == null) {
			System.out.println("Bill null");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} else {
			System.out.println(b.toString());
			if (b.getId() != null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
			} else {
				b.setId(fromDB.getId());
				this.billService.save(b);
				return ResponseEntity.status(HttpStatus.OK).body(null);
			}
		}
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<HttpStatus> deleteBill(@PathVariable("id") Integer id) {
		System.out.println("Delete de bill con id: " + id);
		Bill b = this.billService.findById(id);
		if (b == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		} else {
			this.billService.delete(b);
			return ResponseEntity.status(HttpStatus.OK).body(HttpStatus.OK);
		}
	}

	@DeleteMapping
	public ResponseEntity<HttpStatus> deleteAll() {
		System.out.println("Delete all");
		this.billService.deleteAll();
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}

}
