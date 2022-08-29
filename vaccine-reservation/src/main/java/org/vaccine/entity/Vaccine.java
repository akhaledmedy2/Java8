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
import org.vaccine.dto.VaccineAvailabilityDto;
import org.vaccine.enums.VaccineStatus;

import lombok.Data;

@NamedNativeQuery(
	    name = "Vaccine.getVaccineAvailability",
	    query = "select vaccine.serial_no vaccineSerialNo,"
	    		+ " vaccine.createdDate createdDate,vaccine.expiryDate expiryDate"
	    		+ " from vaccine,branch "
	    		+ "  where branch.id=vaccine.branch_id "
	    		+ "	and status=:status and branch.serial_no=:branchSerialNo",
	    resultSetMapping = "getVaccineAvailabilityResult"
	)
@SqlResultSetMappings({
		@SqlResultSetMapping(name = "getVaccineAvailabilityResult", classes = {
				@ConstructorResult(targetClass = VaccineAvailabilityDto.class, columns = {
						@ColumnResult(name = "vaccineSerialNo", type = String.class),
						@ColumnResult(name = "createdDate", type = Date.class),
						@ColumnResult(name = "expiryDate", type = Date.class)
					
				}) }) })

@Entity(name="vaccine")
@Data
public class Vaccine {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private String serial_no;
  
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "branch_id")
  private Branch branch;
  
  private VaccineStatus status;
  
  private Date createdDate;
  
  private Date expiryDate;
  
}

