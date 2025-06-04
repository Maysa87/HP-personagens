package com.example.HP.service;

import com.example.HP.repository.HPRepository;
import org.springframework.stereotype.Service;

@Service
public class HPService {
    private final HPRepository hpRepository;

    public HPService(HPRepository hpRepository) {
        this.hpRepository = hpRepository;
    }
}
