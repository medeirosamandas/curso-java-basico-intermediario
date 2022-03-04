package com.amanda.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {

		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;
		
		// com o curto circuito, assim que ele ver que a primeira variável é falsa, já é designando falso à variável resultado
		// a mesma coisa com o OU curto circuito que quando já vê que a primeira variável comparada é true, já designa true à variável resultado
		// melhora a qualidade do código, tempo de processamento, mas só é visível no debugador
		
		System.out.println(resultado1);
		System.out.println(resultado1);
	}

}
