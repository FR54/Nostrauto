package com.generation.nostrauto.helper;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.nostrauto.model.repository.*;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@SpringBootApplication
public class GenericHelper
{
	Scanner scanner;
	ClienteRepository ClRepo;
	AutomobileRepository AuRepo;
	AccessorioRepository AcRepo;
	ServizioRepository SeRepo;
	
}
