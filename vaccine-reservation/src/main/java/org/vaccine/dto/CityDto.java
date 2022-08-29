package org.vaccine.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class CityDto {
	@JsonIgnore
	private Integer id;
	private String name;
}
