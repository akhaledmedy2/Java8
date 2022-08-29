package org.vaccine.dto;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ScheduleAvailabilityDto {

	private String serial_no;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy hh:mm")
	private Date vaccDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
	private Date createdDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
	private Date expiryDate;
	public ScheduleAvailabilityDto(String serial_no, Date vaccDate, Date createdDate, Date expiryDate) {
		super();
		this.serial_no = serial_no;
		this.vaccDate = vaccDate;
		this.createdDate = createdDate;
		this.expiryDate = expiryDate;
	}
}
