package org.vaccine.strategy;

import org.vaccine.dto.FilterCriteria;

public interface  VaccineStrategy<T> {
	 void geVaccinationData(FilterCriteria FilterCriteria);
	 StrategyName getStrategyName();
	 
	 
	 public enum StrategyName {
		  StrategyA,
		  StrategyB,
		  StrategyC
		}
}
