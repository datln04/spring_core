package com.datpt.ecomerce_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datpt.ecomerce_demo.model.Option;

@Repository
public interface OptionRepository extends JpaRepository<Option, Integer>{

}
