package org.vaccine.repository;

import org.springframework.stereotype.Repository;
import org.vaccine.entity.Branch;

@Repository
public interface BranchRepository extends CoreRepository<Branch, Integer> {

}