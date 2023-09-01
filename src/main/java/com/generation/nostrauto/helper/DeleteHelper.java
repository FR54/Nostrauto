package com.generation.nostrauto.helper;

import java.util.Scanner;

import com.generation.nostrauto.model.repository.AccessorioRepository;
import com.generation.nostrauto.model.repository.AutomobileRepository;
import com.generation.nostrauto.model.repository.ClienteRepository;
import com.generation.nostrauto.model.repository.ServizioRepository;

public class DeleteHelper extends GenericHelper
{

	public DeleteHelper(
			Scanner scanner, ClienteRepository ClRepo,
			AutomobileRepository AuRepo, AccessorioRepository AcRepo,
			ServizioRepository SeRepo
	)
	{
		super(scanner, ClRepo, AuRepo, AcRepo, SeRepo);
	}
	
	public void deleteById()
	{
		
	}

}
