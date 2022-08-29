package org.vaccine.repository;

import org.springframework.stereotype.Repository;
import org.vaccine.entity.City;

@Repository
public interface CityRepository extends CoreRepository<City, Integer> {

}