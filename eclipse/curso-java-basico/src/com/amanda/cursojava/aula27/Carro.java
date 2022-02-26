package com.amanda.cursojava.aula27;

public class Carro {

	// uma classe carro com 5 atributos
	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + " km.");
	}
	
	double obterAutonomia() {
		return capacidadeCombustivel * consumoCombustivel;
	}
	
	double calculaCombustivel(double km){
		return km/consumoCombustivel;
	}
}
