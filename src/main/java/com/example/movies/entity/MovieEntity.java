package com.example.movies.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name="movie")
@Entity(name="movie")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Builder
public class MovieEntity {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String name;
    private String type;
    private Long duration;
    private Long releaseYear;
}
