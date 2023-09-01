package com.generation.nostrauto.view.helper;

import com.generation.nostrauto.model.entity.Automobile;

public class AutomobileView
{
	public String render(Automobile a)
	{
		return "{id:'" + a.getId() + "', prezzo:'" + a.getPrezzo() + "', casaProduttrice:'"
				+ a.getCasaProduttrice() + "', modello:'" + a.getModello()
				+ "', dataAquisto:'" + a.getCasaProduttrice() + "', usata:'" + a.isUsata()
				+ "', cliente:'" + a.getCliente() + "', monta:'" + a.getMonta() + "'}";
	}
}
