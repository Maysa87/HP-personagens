package com.example.HP.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HP.dto.HPDto;
import com.example.HP.service.HPService;

@RestController
@RequestMapping("/personagens")
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
