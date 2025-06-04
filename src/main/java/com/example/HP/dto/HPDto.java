package com.example.HP.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HPDto {
    private String id;
    private String name;
    private LocalDate age;
    private String house;
    private String email;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getAge() {
        return age;
    }
    public void setAge(LocalDate age) {
        this.age = age;
    }

    public String getHouse() {
        return house;
    }
    public void setAge(String house) {
        this.house = house;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
