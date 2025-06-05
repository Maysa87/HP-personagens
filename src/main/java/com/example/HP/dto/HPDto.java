package com.example.HP.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HPDto {
    private String id;
    private String name;
    private LocalDate age;
    private String house;
}
