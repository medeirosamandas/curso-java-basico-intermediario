package com.amanda.cursojava.aula49;

public class FinallyPegadinha {
	
	public static void main(String[] args) {
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++) {

			try {
				System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i]/ denom[i]));
			} catch(ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0);
			} catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Posi��o do array inv�lida");
				System.exit(0);

			} finally {
				System.out.println("Linha impressa sempre ap�s o try e catch");
			}
			
			// a linha 				System.exit(0);
			// faz com que o o finally n�o seja executado
			// o programa � "desligado" ap�s a execu��o da primeira linha do catch
		}
	}

}
