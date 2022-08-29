package org.vaccine.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class VaccineBranchDto {
	@JsonIgnore
	private Integer id;
	private Integer availability;
	private BranchDto branch;	
}
