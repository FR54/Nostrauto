package com.generation.nostrauto.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.nostrauto.model.entity.Automobile;

public interface AutomobileRepository extends JpaRepository<Automobile,Integer>
{
	Automobile findAutomobileByCasaProduttrice(String casaProduttrice);
}
