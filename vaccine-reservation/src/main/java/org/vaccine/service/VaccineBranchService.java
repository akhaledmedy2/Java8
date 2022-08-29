package org.vaccine.service;
import java.util.ArrayList;
import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.vaccine.converter.VaccineMapper;
import org.vaccine.dto.VaccineDto;
import org.vaccine.entity.Vaccine;
import org.vaccine.repository.VaccineRepository;

@Service
public class VaccineBranchService implements Iservice {
	
	@Autowired
	VaccineRepository vaccineRepository;
	
	VaccineMapper vaccineMapper=Mappers.getMapper(VaccineMapper.class);
	
	@Transactional(readOnly =true)
	public List<VaccineDto> getAllAvailableVaccines()
	{
		List<VaccineDto> vaccineList=new ArrayList<VaccineDto>();
		List<Vaccine> vaccineEntities= vaccineRepository.findAll();
		vaccineEntities.forEach(vaccine -> vaccineList.add(vaccineMapper.vaccineEntityToVaccineDto(vaccine)));
        return vaccineList;
	}

}
