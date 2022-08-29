package org.vaccine.dto;

import org.vaccine.enums.VaccineStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class VaccineDto {
	@JsonIgnore
	private Integer id;
	private String serial_no;
	private VaccineStatus status;
	private BranchDto branch;	
}
