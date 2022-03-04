package com.amanda.cursojava.aula34.labs;

public class Contador {
	
	private static int contador;

	public Contador() {
		contador += 1;
	}
	
	 public static void incrementar(){
	        contador++;
	    }
	    
	    public static void zerar(){
	        contador = 0;
	    }
	    
	    public static int obterValor(){
	        return contador;
	    }
	
	

}
