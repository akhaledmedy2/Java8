package org.vaccine.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.vaccine.dto.ScheduleAvailabilityDto;
import org.vaccine.entity.ScheduleVaccine;

@Repository
public interface ScheduleRepository extends CoreRepository<ScheduleVaccine, Integer> {

	@Query(nativeQuery = true)
	Page<ScheduleAvailabilityDto> getAvailableTime(String branchSerialNo,Pageable pageable );
}