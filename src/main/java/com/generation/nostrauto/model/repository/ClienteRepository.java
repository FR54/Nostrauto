package com.generation.nostrauto.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.nostrauto.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>
{

}
