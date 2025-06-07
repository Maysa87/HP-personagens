package com.example.HP.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HP.entity.HPEntity;

@Repository
public interface HPRepository extends JpaRepository<HPEntity, String> {
	List<HPEntity> findByNameContainingIgnoreCaseOrBornDateGreaterThanEqualOrHouseContainingIgnoreCase(String name,
			LocalDate bornDate, String house);
}
