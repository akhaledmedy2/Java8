package org.vaccine.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.vaccine.dto.VaccineBranchDto;
import org.vaccine.entity.AvailableVaccine;
	
@Mapper
public interface VaccineBranchMapper {
	  @Mappings({
	    @Mapping(target="availability", source="vaccineBranch.availability"),
	    @Mapping(target="branch.name", source="vaccineBranch.branch.name"),
	    @Mapping(target="branch.address", source="vaccineBranch.branch.address"),
	    @Mapping(target="branch.telephone", source="vaccineBranch.branch.telephone"),
	    @Mapping(target="branch.serial_no", source="vaccineBranch.branch.serial_no"),
	    @Mapping(target="branch.city", source="vaccineBranch.branch.city.name")
	  })
    VaccineBranchDto vaccineBranchEntityToVaccineBranchDto(AvailableVaccine vaccineBranch);
    
}
   
