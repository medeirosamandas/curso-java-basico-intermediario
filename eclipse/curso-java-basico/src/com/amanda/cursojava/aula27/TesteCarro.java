package com.amanda.cursojava.aula27;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numeroPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		van.exibirAutonomia();
		System.out.println(van.obterAutonomia());
		System.out.println(van.calculaCombustivel(10));
		
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numeroPassageiros = 4;
		fusca.capacidadeCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		

	}

}
