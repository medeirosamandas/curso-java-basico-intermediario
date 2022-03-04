package com.amanda.cursojava.aula52.labs;

public class Contato {
	
	private static int contador = 0;
	
	private String nome;
	private String telefone;
	private int id;
	
	
	
	public Contato(String nome, String telefone) {
		contador++;
		this.nome = nome;
		this.telefone = telefone;
		this.id = contador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		
		return "Contato [nome: " + nome + ", telefone: " + telefone + ", id: " + id + "]";}
	

	

}
