
package org.vaccine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vaccine.dto.CityDto;
import org.vaccine.service.CityService;

@RestController
@RequestMapping("api/cities")
public class CityController {
	@Autowired
	CityService cityService;
	
	@GetMapping( produces = "application/json")
    public List<CityDto> getAllCities() {
        return cityService.getAllCities();
    }

}
