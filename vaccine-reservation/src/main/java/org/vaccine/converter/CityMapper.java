package org.vaccine.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import org.vaccine.dto.CityDto;
import org.vaccine.entity.City;

@Mapper
public interface CityMapper {

	  @Mappings({
	    @Mapping(target="id", source="city.id"),
	    @Mapping(target="name", source="city.name")
	  })
    CityDto cityEntityToCityDto(City city);
    

	  @Mappings({
	    @Mapping(target="id", source="cityDto.id"),
	    @Mapping(target="name", source="cityDto.name")
	  })
    City cityDtoTocityEntity(CityDto cityDto);
}
   
