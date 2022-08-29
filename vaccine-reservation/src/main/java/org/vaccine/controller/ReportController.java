package org.vaccine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vaccine.service.ScheduleService;

@RestController
@RequestMapping("api/time/{branchId}/available")
public class ReportController {


		@Autowired
		ScheduleService scheduleService;
		
//		@GetMapping( produces = "application/json")
//	    public List<ScheduleAvailabilityDto> getAvailableTimeByBranchId(@PathVariable(value = "branchId") String branchSerialNo ) {
//	        return scheduleService.getAvailableTimeByBranchId(branchSerialNo);
//	    }

}
