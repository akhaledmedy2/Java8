package org.vaccine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.vaccine.dto.ScheduleAvailabilityDto;
import org.vaccine.service.ScheduleService;

@RestController
@RequestMapping("api/time/{branchId}/available")
public class ScheduleController {


		@Autowired
		ScheduleService scheduleService;
		
		@GetMapping( produces = "application/json")
	    public List<ScheduleAvailabilityDto> getAvailableTimeByBranchId(@PathVariable(value = "branchId") String branchSerialNo,
	    		@RequestParam(defaultValue = "0") int page,
	            @RequestParam(defaultValue = "3") int size ) {
	        return scheduleService.getAvailableTimeByBranchId(branchSerialNo,page,size);
	    }

}
