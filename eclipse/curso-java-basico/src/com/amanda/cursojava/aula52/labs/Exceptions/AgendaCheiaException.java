package com.amanda.cursojava.aula52.labs.Exceptions;

import com.amanda.cursojava.aula52.labs.Contato;

public class AgendaCheiaException extends Exception{
	
	private Contato contato;
	
	@Override
	public String getMessage() {
		
		return "Imposs�vel adicionar novo contato, agenda cheia\n";
	}
	


}
