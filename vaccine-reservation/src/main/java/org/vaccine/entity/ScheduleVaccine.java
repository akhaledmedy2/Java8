package org.vaccine.entity;

import java.util.Date;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;

import org.hibernate.annotations.NamedNativeQuery;
import org.vaccine.dto.ScheduleAvailabilityDto;
import org.vaccine.enums.VaccineStatus;

import lombok.Data;

@NamedNativeQuery(
	    name = "ScheduleVaccine.getAvailableTime",
	    query = "SELECT vaccine.serial_no,scheduledvaccine.vaccDate,vaccine.createdDate ,vaccine.expiryDate "
	    		+ " FROM scheduledvaccine,vaccine,branch  "
	    		+ " where scheduledvaccine.vaccine_id=vaccine.id "
	    		+ " and vaccine.branch_id=branch.id "
	    		+ " and branch.serial_no=?1 ",
	    resultSetMapping = "getAvailableTimeResult"
	)
@NamedNativeQuery(
	    name = "ScheduleVaccine.getAvailableTime.count",
	    query = "SELECT count(serial_no)  "
	    		+ " FROM scheduledvaccine,vaccine,branch  "
	    		+ " where scheduledvaccine.vaccine_id=vaccine.id "
	    		+ " and vaccine.branch_id=branch.id "
	    		+ " and branch.serial_no=?1 "
	)
@SqlResultSetMappings({
		@SqlResultSetMapping(name = "getAvailableTimeResult", classes = {
				@ConstructorResult(targetClass = ScheduleAvailabilityDto.class, columns = {
						@ColumnResult(name = "serial_no", type = String.class),
						@ColumnResult(name = "vaccDate", type = Date.class),
						@ColumnResult(name = "createdDate", type = Date.class),
						@ColumnResult(name = "expiryDate", type = Date.class)					
				}) }) })

@Entity(name="scheduledvaccine")
@Data
public class ScheduleVaccine {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "vaccine_id")
  private Vaccine vaccine;
  
  private VaccineStatus status;
  
  private Date vaccDate;
    
}

