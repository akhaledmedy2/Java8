package org.vaccine.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
	public interface CoreRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, Number> {

	    List<T> findAll();
	}



