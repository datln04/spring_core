package com.datpt.ecomerce_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datpt.ecomerce_demo.model.OptionGroup;

@Repository
public interface OptionGroupRepository extends JpaRepository<OptionGroup, Integer>{

}
