package com.amanda.cursojava.aula29;

public class Carro2 {
	

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro2(String marca, String modelo, int numPassageiros,
			double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	// ao utilizar o hibernate ? necess?rio um construtor vazio (?	)
	public Carro2() {
		
	}

}
