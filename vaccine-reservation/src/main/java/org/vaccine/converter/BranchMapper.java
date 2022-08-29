package org.vaccine.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.vaccine.dto.BranchDto;
import org.vaccine.entity.Branch;

@Mapper
public interface BranchMapper {

	  @Mappings({
	    @Mapping(target="id", source="branch.id"),
	    @Mapping(target="name", source="branch.name"),
	    @Mapping(target="address", source="branch.address"),
	    @Mapping(target="telephone", source="branch.telephone"),
	    @Mapping(target="city", source="branch.city.name")
	  })
    BranchDto branchEntityToBranchDto(Branch branch);
    
	  @Mappings({
	    @Mapping(target="id", source="branchDto.id"),
	    @Mapping(target="name", source="branchDto.name"),
	    @Mapping(target="address", source="branchDto.address"),
	    @Mapping(target="telephone", source="branchDto.telephone"),
	    @Mapping(target="city.name", source="branchDto.name")
	  })
    Branch BranchDtoToBranchEntity(BranchDto branchDto);
}
   
