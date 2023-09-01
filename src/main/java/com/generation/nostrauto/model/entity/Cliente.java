package com.generation.nostrauto.model.entity;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Setter
@Getter
@SpringBootApplication
public class Cliente
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String nome, Cognome;
	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	List<Servizio> serviziAcquistati;
	List<Automobile> automobile;
}
