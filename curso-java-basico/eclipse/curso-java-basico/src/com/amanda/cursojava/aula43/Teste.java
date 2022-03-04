package com.amanda.cursojava.aula43;

public class Teste {
	
	public static void main(String[] args) {
	
		
		Aluno aluno = new Aluno();
		aluno.setCurso("SI");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		// referencia na memória
		//System.out.println(aluno);
		
		
		
		System.out.println(aluno.toString());
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("SI");
		double[] notas2 = {10, 9, 8, 7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno2.toString());
		
		System.out.println(aluno.equals(aluno2));


	}
	
	

}
