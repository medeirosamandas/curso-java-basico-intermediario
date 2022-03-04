package com.amanda.cursojava.aula35.labs;

public class Somatorio {
	
	
	
	public static int somatorio(int numero) {
		if (numero == 1) {
			return 1;
		}
		
		return numero + somatorio(numero -1);
	}

}
