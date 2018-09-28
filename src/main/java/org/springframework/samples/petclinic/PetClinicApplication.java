/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.Specialty;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.repository.SpecialityRepository;
import org.springframework.samples.petclinic.services.BillService;
import org.springframework.samples.petclinic.services.OwnerService;
import org.springframework.samples.petclinic.services.PetService;
import org.springframework.samples.petclinic.services.VetService;
import org.springframework.samples.petclinic.services.VisitService;

/**
 * PetClinic Spring Boot Application.
 * 
 * @author Dave Syer
 *
 */
@EnableJpaRepositories("org.springframework.samples.petclinic.repository")
@EntityScan("org.springframework.samples.petclinic.model")
@SpringBootApplication
public class PetClinicApplication {

	private static final Logger log = LoggerFactory.getLogger(PetClinicApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(PetClinicApplication.class, args);
	}

	@Bean
	public CommandLineRunner demoVetRepository(VetService vetService, SpecialityRepository specialityRepository,
			OwnerService ownerService, PetService petService, VisitService visitService, BillService billService) {
		return (args) -> {
			log.info("*****************************************************");
			log.info("BOOTCAMP - Spring y Spring Data - vetRepository");
			log.info("*****************************************************");
		
//			Vet vet = new Vet();
//			vet.setFirstName("Alberto");
//			vet.setLastName("Rodríguez");
//			
//			vet = vetService.save(vet);
//			
//			System.out.println("\nTaller. Ejercicio 1\n==============================\n");
//			System.out.println(vetService.findById(vet.getId()).toString());
//			
//			System.out.println("\nTaller. Ejercicio 2\n==============================\n");
//			Specialty s = specialityRepository.findOne(1);
//			vet.addSpecialty(s);
//			vet = vetService.save(vet);
//			System.out.println(vetService.findById(vet.getId()).toString());
//			
//			System.out.println("\nTaller. Ejercicio 3\n==============================\n");
//			for(Vet v:vetService.findAll()) {
//				System.out.println(v.getId() + ".- "+v.toString());
//			}
//			
//			System.out.println("\nTaller. Ejercicio 4\n==============================\n");
//			for(Vet v:vetService.findByLastName("Douglas")) {
//				System.out.println(v.getId() + ".- "+v.toString());
//			}	
//
//			System.out.println("\nTaller. Ejercicio 5\n==============================\n");
//			for(Vet v:vetService.findByFirstNameAndLastName("Rafael", "Ortega")) {
//				System.out.println(v.getId() + ".- "+v.toString());
//			}						
//			
//			System.out.println("\nTaller. Ejercicio 6\n==============================\n");
//			for(Vet v:vetService.findByFirstNameOrLastName("Rafael", "Cano")) {
//				System.out.println(v.getId() + ".- "+v.toString());
//			}		
//			
//			System.out.println("\nTaller. Ejercicio 7\n==============================\n");
//			for(Vet v:vetService.findBySpecialityName("radiology")) {
//				System.out.println(v.getId() + ".- "+v.toString());
//			}			
//			
//			System.out.println("\nTaller. Ejercicio 8\n==============================\n");
//			for(Owner o:ownerService.findByFirstNameContainingOrLastNameContaining(ownerService.findById(1).getFirstName(), "Evo")) {
//				System.out.println(o.getId() + ".- "+o.toString());
//			}	
//			
//			System.out.println("\nTaller. Ejercicio 9\n==============================\n");
//			for(Owner o:ownerService.findByOrderByLastName()) {
//				System.out.println(o.getId() + ".- "+o.toString());
//			}	
//			
//			System.out.println("\nReto. Ejercicio 1\n==============================\n");
//			for(Pet p:petService.findByGreaterThan2010Ordered()) {
//				System.out.println(p.getId() + ".- "+p.toString());
//			}	
//			
//			System.out.println("\nReto. Ejercicio 2\n==============================\n");
//			Visit v1=new Visit();
//			v1.setDate(new Date());
//			v1.setDescription("descripcion1");
//			v1.setPetId(petService.findById(1).getId());
//			
//			Visit v2=new Visit();
//			v2.setDate(new Date());
//			v2.setDescription("descripcion2");
//			v2.setPetId(petService.findById(2).getId());
//			
//			Visit v3=new Visit();
//			v3.setDate(new Date());
//			v3.setDescription("descripcion3");
//			v3.setPetId(petService.findById(3).getId());			
//			
//			visitService.save(v1);
//			visitService.save(v2);
//			visitService.save(v3);
//			
//			for(Visit v:visitService.findAll()) {
//				System.out.println(v.getId() + ".- "+v.toString());
//			}			
//			
//			System.out.println("\nReto. Ejercicio 3\n==============================\n");
//			for(Visit v:visitService.findByPetId(petService.findById(2).getId())) {
//				System.out.println(v.getId() + ".- "+v.toString());
//			}	
//			
//			System.out.println("\nReto. Ejercicio 4\n==============================\n");
//			for(Visit v:visitService.findTop4ByOrderByDateDesc()) {
//				System.out.println(v.getId() + ".- "+v.toString());
//			}				
			
			
			
		};
	}

}
