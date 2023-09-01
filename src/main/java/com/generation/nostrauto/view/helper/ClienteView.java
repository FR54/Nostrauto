package com.generation.nostrauto.view.helper;

import com.generation.nostrauto.model.entity.Cliente;

public class ClienteView
{
	public String render(Cliente c)
	{
			return "{id:'" + c.getId() + "', nome:'" + c.getNome() + "', Cognome:'" + c.getCognome()
					+ "', serviziAcquistati:'" + c.getServiziAcquistati()
					+ "', automobile:'" + c.getAutomobile() + "'}";
		
	}
}
