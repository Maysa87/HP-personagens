package com.example.hp.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hp.entity.HPEntity;

@Repository
public interface HPRepository extends JpaRepository<HPEntity, Long> {
	List<HPEntity> findByNameContainingIgnoreCaseOrBornDateGreaterThanEqualOrHouseContainingIgnoreCase(String name,
			LocalDate bornDate, String house);
}
