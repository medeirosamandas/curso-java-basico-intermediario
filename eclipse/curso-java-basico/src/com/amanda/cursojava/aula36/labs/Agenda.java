package com.amanda.cursojava.aula36.labs;

public class Agenda {

	private Contato[] contatos;
	private String nomeDaAgenda;
	
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	public String getNomeDaAgenda() {
		return nomeDaAgenda;
	}
	public void setNomeDaAgenda(String nomeDaAgenda) {
		this.nomeDaAgenda = nomeDaAgenda;
	}

	public String obterInfo() {
		String info = "Nome = " + nomeDaAgenda + "\n";
		
		  if (contatos != null){
	            for (Contato c : contatos){
	                info += c.obterInfo() + "\n";
	            }
	        }
	        
	        return info;
	}
}
