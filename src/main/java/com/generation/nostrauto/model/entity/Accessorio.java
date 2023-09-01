package com.generation.nostrauto.model.entity;

import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Accessorio
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	Integer prezzo;
	String nome;
	@ManyToMany(mappedBy = "montatoSu", fetch = FetchType.EAGER)
	List<Automobile> montatoSu;
	
}
