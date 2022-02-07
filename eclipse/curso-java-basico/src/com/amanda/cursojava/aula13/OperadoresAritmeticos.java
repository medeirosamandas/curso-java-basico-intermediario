package com.amanda.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int result = 1 + 2;
		
		System.out.println(result);
		// 3
		
		result = result - 1;
		System.out.println(result);
		// 2 
		
		result = result * 2;
		System.out.println(result);
		// 4 
		
		result = result / 2;
		System.out.println(result);
		// 2 
		
		result = result + 8;
		System.out.println(result);
		// 10 
		
		result = result % 7;
		System.out.println(result);
		// 3
		
		// Obs: Outra utilização do operador + é a concatenação de Strings
		

		result = result + 1;
		System.out.println(result);
		//4
		
		result++;
		System.out.println(result);
		//5
		

		System.out.println(result++);
		// primeiro printa o número e depois adiciona 1 à ele.
		System.out.println(result);


		System.out.println(++result);
		// primeiro adiciona 1 à ele e depois printa o número
		System.out.println(result);

	}

}
