package com.devsuperior.aula.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.aula.dto.PersonDepartmentDto;
import com.devsuperior.aula.dto.PersonDto;
import com.devsuperior.aula.services.PersonService;

@RestController
@RequestMapping(value = "/people")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	//@PostMapping
	public ResponseEntity<PersonDepartmentDto> insert(@RequestBody PersonDepartmentDto dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PostMapping
	public ResponseEntity<PersonDto> insert(@RequestBody PersonDto dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

}
