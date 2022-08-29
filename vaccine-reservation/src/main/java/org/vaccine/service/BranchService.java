package org.vaccine.service;
import java.util.ArrayList;
import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.vaccine.converter.BranchMapper;
import org.vaccine.dto.BranchDto;
import org.vaccine.entity.Branch;
import org.vaccine.repository.BranchRepository;

@Service
public class BranchService implements Iservice {
	
	@Autowired
	BranchRepository branchRepository;
	
	BranchMapper branchMapper=Mappers.getMapper(BranchMapper.class);
	
	@Transactional
	public List<BranchDto> getAllBranches()
	{
		List<BranchDto> branchList=new ArrayList<BranchDto>();
		List<Branch> branchEntities= branchRepository.findAll();
		branchEntities.forEach(branch -> branchList.add(branchMapper.branchEntityToBranchDto(branch)));
        return branchList;
	}

}
