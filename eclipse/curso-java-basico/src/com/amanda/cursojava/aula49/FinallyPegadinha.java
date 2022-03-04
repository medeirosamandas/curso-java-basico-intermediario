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
				System.out.println("Posição do array inválida");
				System.exit(0);

			} finally {
				System.out.println("Linha impressa sempre após o try e catch");
			}
			
			// a linha 				System.exit(0);
			// faz com que o o finally não seja executado
			// o programa é "desligado" após a execução da primeira linha do catch
		}
	}

}
