package org.vaccine.dto;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class VaccineAvailabilityDto {

	private String vaccineSerialNo;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
	private Date createdDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
	private Date expiryDate;

	public VaccineAvailabilityDto(String vaccineSerialNo, Date createdDate, Date expiryDate) {
		super();
		this.vaccineSerialNo = vaccineSerialNo;
		this.createdDate = createdDate;
		this.expiryDate = expiryDate;
	}
}
