package com.amanda.cursojava.aula31;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

// private = deixa o metodo ou atributo disponivel apenas dentro da propria classe
	// public = deixa disponivel o metodo ou atributo em todos os pacotes
	// default = deixa disponivel o metodo ou atributo apenas nas classes do mesmo pacote
	

	void exibirAutonomia() {
	    System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km){
				
		return this.divideKMPorConsumoCombustivel(km);
	}

}
