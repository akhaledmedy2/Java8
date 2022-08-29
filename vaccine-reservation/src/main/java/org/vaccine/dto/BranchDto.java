package org.vaccine.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class BranchDto {
	@JsonIgnore
	private Integer id;
	private String name;
	private String serial_no;
	private String address;
	private String telephone;
	private String city;	
}
