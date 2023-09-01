package com.generation.nostrauto.view.helper;

import com.generation.nostrauto.model.entity.Servizio;

public class ServizioView
{
	public String render(Servizio s)
	{
		return "{id:'" + s.getId() + "', prezzo:'" + s.getPrezzo() + "', tipologia:'"
				+ s.getId() + "', dataOra:'" + s.getDataOra() + "', cliente:'"
				+ s.getCliente() + "'}";
	}
}
