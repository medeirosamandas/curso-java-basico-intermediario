package com.amanda.cursojava.aula52;

public class UsandoMinhaException {
	public static void main(String[] args) {
		int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
		int[] denom = {2, 0, 4, 8, 0, 2, 3};
		
		for(int i = 0; i < numeros.length; i++) {

			try {
				if(numeros[i] % 2 != 0) {
					//lan�ar minha exception
					// jeito de utilizar quando n�o tem a Classe criada
					//throw new Exception("N�mero �mpar, divis�o n�o exata");
					// jeito da divis�o utilizando a classe
					
					throw new DivisaoNaoExata(numeros[i], denom[i]);
					

				}
				System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i]/ denom[i]));
			} catch(ArithmeticException e) {
				System.out.println("Erro, tentativa de divis�o por 0");
			} catch(ArrayIndexOutOfBoundsException e1){
				System.out.println("Erro ao tentar acessar �ndice do array");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
