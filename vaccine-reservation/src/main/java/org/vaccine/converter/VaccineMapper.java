package org.vaccine.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.vaccine.dto.VaccineDto;
import org.vaccine.entity.Vaccine;


@Mapper
public interface VaccineMapper {
	  @Mappings({
	    @Mapping(target="serial_no", source="vaccine.serial_no"),
	    @Mapping(target="branch.name", source="vaccine.branch.name"),
	    @Mapping(target="branch.address", source="vaccine.branch.address"),
	    @Mapping(target="branch.telephone", source="vaccine.branch.telephone"),
	    @Mapping(target="branch.serial_no", source="vaccine.branch.serial_no"),
	    @Mapping(target="branch.city", source="vaccine.branch.city.name")
	  })
    VaccineDto vaccineEntityToVaccineDto(Vaccine vaccine);
    
	  @Mappings({
		  @Mapping(target="serial_no", source="vaccineDto.serial_no"),
		  @Mapping(target="branch.name", source="vaccineDto.branch.name"),
		  @Mapping(target="branch.telephone", source="vaccineDto.branch.telephone"),
		  @Mapping(target="branch.address", source="vaccineDto.branch.address"),
		  @Mapping(target="branch.serial_no", source="vaccineDto.branch.serial_no"),
		  @Mapping(target="branch.city.name", source="vaccineDto.branch.city")
	  })
    Vaccine vaccineDtoToVaccineEntity(VaccineDto vaccineDto);
}
   
