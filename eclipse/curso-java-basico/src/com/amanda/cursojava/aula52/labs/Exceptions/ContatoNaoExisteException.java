package com.amanda.cursojava.aula52.labs.Exceptions;

public class ContatoNaoExisteException extends Exception{
	
	private String nomeContato;
	
    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

	
	@Override
	public String getMessage() {
		String s = "";
		s += "Contato com nome '" + nomeContato + "' não existe!";
		return s;
	}

}
