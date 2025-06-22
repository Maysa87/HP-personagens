package com.example.hp.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class HPDto {
	private Long id;
	private String name;
	private LocalDate bornDate;
	private String house;
	private String base64Img;
	private String varinha;
	private String patrono;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBornDate() {
		return bornDate;
	}

	public void setBornDate(LocalDate bornDate) {
		this.bornDate = bornDate;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getBase64Img() {
		return base64Img;
	}

	public void setBase64Img(String base64Img) {
		this.base64Img = base64Img;
	}

	public String getVarinha() {
		return varinha;
	}

	public void setVarinha(String varinha) {
		this.varinha = varinha;
	}

	public String getPatrono() {
		return patrono;
	}

	public void setPatrono(String patrono) {
		this.patrono = patrono;
	}

}
