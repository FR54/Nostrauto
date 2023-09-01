package com.generation.nostrauto.view.helper;
import com.generation.nostrauto.model.entity.Accessorio;
public class AccessorioView
{
	public String render(Accessorio a)
	{
		return "{getId():'" + a.getId() + "', getPrezzo():'" + a.getPrezzo()
				+ "', getNome():'" + a.getNome() + "', getMontatoSu():'"
				+ a.getMontatoSu() + "'}";
	}
}
