package org.vaccine.dto;

import java.util.Date;

import lombok.Data;

@Data
public class FilterCriteria {
	
	String branchId;
	Date dateFrom;
	Date dateTo;

}
