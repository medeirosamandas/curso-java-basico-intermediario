package com.amanda.cursojava.aula34.labs;

public class ConversaoDeUnidadesDeVolume {

	static double litroEmCentimetrosCubicos(double litro) {
		return litro * 1000;
	}
	
	static double metroCubicoEmLitros(double metroCubico) {
		return metroCubico * 1000;
	}
	static double metroCubicoEmPesCubicos(double metroCubico) {
		return metroCubico * 35.32;
	}
	static double galaoEmPolegadasCubicas(double galao) {
		return galao * 231;
	}
	static double galaoEmLitros(double galao) {
		return galao * 3785;
	}
}
