package com.example.HP.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name="HP")
@Entity(name="HP")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Builder
public class HPEntity {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private LocalDate age;
    private String house;
    private String email;
}

