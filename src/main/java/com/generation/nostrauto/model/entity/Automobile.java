package com.generation.nostrauto.model.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class Automobile
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	Integer prezzo;
	String casaProduttrice, modello;
	LocalDate dataAquisto;
	boolean usata;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable
    (
        name = "composto",
        joinColumns = @JoinColumn(name = "id_automobile"),
        inverseJoinColumns = @JoinColumn(name = "id_accessorio")
    )
	List<Accessorio> monta;
}
