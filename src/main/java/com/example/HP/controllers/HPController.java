package com.example.hp.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.hp.dto.HPDto;
import com.example.hp.service.HPService;

@RestController
@RequestMapping("/personagens")

@CrossOrigin("*")
public class HPController {

	private final HPService hpService;

	public HPController(HPService hpService) {
		this.hpService = hpService;
	}

	@GetMapping
	public ResponseEntity<List<HPDto>> getAllHP() {
		return ResponseEntity.ok(hpService.getHP());
	}

	@GetMapping("/filtro")
	public ResponseEntity<List<HPDto>> filtro(@RequestParam(required = false) String name,
			@RequestParam(required = false) String house, @RequestParam(required = false) LocalDate bornDate) {
		return ResponseEntity.ok(hpService.filtro(name, house, bornDate));
	}
}
