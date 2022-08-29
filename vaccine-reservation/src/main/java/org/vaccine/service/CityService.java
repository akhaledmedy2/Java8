package org.vaccine.service;
import java.util.ArrayList;
import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaccine.converter.CityMapper;
import org.vaccine.dto.CityDto;
import org.vaccine.entity.City;
import org.vaccine.repository.CityRepository;

@Service
public class CityService implements Iservice {
	
	@Autowired
	CityRepository cityRepository;
	CityMapper cityMapper=Mappers.getMapper(CityMapper.class);
	
	public List<CityDto> getAllCities()
	{
		List<CityDto> citiesList=new ArrayList<CityDto>();
		List<City> citiesEntities=cityRepository.findAll();
		citiesEntities.forEach(city -> citiesList.add(cityMapper.cityEntityToCityDto(city)));
        return citiesList;
	}

}
