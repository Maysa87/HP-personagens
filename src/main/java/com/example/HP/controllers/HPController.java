package com.example.HP.controllers;

import com.example.HP.dto.HPDto;
import com.example.HP.service.HPService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class HPController {

    private final HPService hpService;
    public HPController(HPService hpService){
        this.hpService = hpService;
    }
    @GetMapping
    public ResponseEntity<List<HPDto>> getAllHP(){
        return ResponseEntity.ok(hpService.getHP());
    }

    @PostMapping
    public ResponseEntity<HPDto> registerPessoa(@RequestBody @Valid HPDto data){
        return ResponseEntity.ok(hpService.save(data));
    }

    @PutMapping
    public ResponseEntity<HPDto>  updatePessoa(@RequestBody @Valid HPDto data){
        return ResponseEntity.ok(hpService.update(data));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletePessoa(@RequestParam String id){
        hpService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
