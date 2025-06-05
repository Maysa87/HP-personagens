package com.example.HP.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.HP.dto.HPDto;
import com.example.HP.entity.HPEntity;
import com.example.HP.mapper.HPMapper;
import com.example.HP.repository.HPRepository;

@Service
public class HPService {
	private final HPRepository hpRepository;
	private final HPMapper hpMapper;

	public HPService(HPRepository hpRepository, HPMapper hpMapper) {
		this.hpRepository = hpRepository;
		this.hpMapper = hpMapper;
	}

	@Transactional
	public List<HPDto> getHP() {
		return hpMapper.entitiesToDtos(hpRepository.findAll());
	}

	@Transactional
	public HPDto save(HPDto hpDto) {
		HPEntity newHP = hpMapper.dtoToEntity(hpDto);
		return hpMapper.entityToDto(hpRepository.save(newHP));
	}

	@Transactional
	public HPDto update(HPDto hpDto) {
		HPEntity personagem = hpRepository.findById(hpDto.getId())
				.orElseThrow(() -> new RuntimeException("Personagem not found"));
		personagem.setName(hpDto.getName());
		personagem.setAge(hpDto.getAge());
		return hpMapper.entityToDto(hpRepository.save(personagem));
	}

	@Transactional
	public void delete(String id) {
		hpRepository.deleteById(id);
	}
}
