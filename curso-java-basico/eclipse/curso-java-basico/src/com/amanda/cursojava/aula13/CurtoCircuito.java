package com.amanda.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {

		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;
		
		// com o curto circuito, assim que ele ver que a primeira vari�vel � falsa, j� � designando falso � vari�vel resultado
		// a mesma coisa com o OU curto circuito que quando j� v� que a primeira vari�vel comparada � true, j� designa true � vari�vel resultado
		// melhora a qualidade do c�digo, tempo de processamento, mas s� � vis�vel no debugador
		
		System.out.println(resultado1);
		System.out.println(resultado1);
	}

}
