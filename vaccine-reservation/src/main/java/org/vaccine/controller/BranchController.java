package org.vaccine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vaccine.dto.BranchDto;
import org.vaccine.service.BranchService;

@RestController
@RequestMapping("api/branches")
public class BranchController {


		@Autowired
		BranchService branchService;
		
		@GetMapping( produces = "application/json")
	    public List<BranchDto> getAllBranches() {
	        return branchService.getAllBranches();
	    }

}
