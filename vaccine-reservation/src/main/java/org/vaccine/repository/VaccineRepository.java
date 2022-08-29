package org.vaccine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.vaccine.dto.VaccineAvailabilityDto;
import org.vaccine.entity.Vaccine;
import org.vaccine.enums.VaccineStatus;

@Repository
public interface VaccineRepository extends CoreRepository<Vaccine, Integer> {

	@Query(nativeQuery = true)
	List<VaccineAvailabilityDto> getVaccineAvailability(@Param("branchSerialNo") String branchserial_no,@Param("status") VaccineStatus vaccineStatus);
}