package com.example.HP.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
