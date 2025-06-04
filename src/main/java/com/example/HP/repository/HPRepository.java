package com.example.HP.repository;

import com.example.HP.entity.HPEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface HPRepository {
    List<HPEntity> findAllByActiveTrue();
}



