package com.amanda.cursojava.aula47;

public class Exception {

	public static void main(String[] args) {

		
		
		
		try {
			int[] vetor = new int[4];
			System.out.println("Antes da exception");
			vetor[4] = 1;
			System.out.println("Esta linha n�o ser� impressa");

		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Erro ao acessar �ndice do vetor que n�o existe");
		}
		
		System.out.println("Este texto ser� impresso ap�s a exception");

	}

}
