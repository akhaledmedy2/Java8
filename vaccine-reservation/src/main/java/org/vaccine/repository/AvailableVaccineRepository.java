package org.vaccine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.vaccine.entity.Vaccine;

@Repository
public interface AvailableVaccineRepository extends CoreRepository<Vaccine, Integer> {

	@Query(value="select vaccine.serial_no,vaccine.status,branch.name,branch.telephone,branch.address from vaccine,branch\r\n"
			+" where branch.id=vaccine.branch_id "
			+ " and status=0 and branch.serial_no=:branchserial_no" ,nativeQuery = true)
	List<Vaccine>findAllVaccinesByBranchId(@Param("branchserial_no") String branchserial_no);
}