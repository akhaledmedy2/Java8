package org.vaccine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vaccine.dto.VaccineAvailabilityDto;
import org.vaccine.service.VaccineService;

@RestController
@RequestMapping("api/vaccines/{branchId}/available")
public class VaccineController {


		@Autowired
		VaccineService vaccineService;
		
		@GetMapping( produces = "application/json")
	    public List<VaccineAvailabilityDto> getAllAvailableVaccines(@PathVariable(value = "branchId") String branchId ) {
	        return vaccineService.findAllVaccinesByBranchId(branchId);
	    }

}
