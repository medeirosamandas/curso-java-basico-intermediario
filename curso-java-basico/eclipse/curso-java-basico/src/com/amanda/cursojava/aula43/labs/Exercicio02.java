package com.amanda.cursojava.aula43.labs;

/*Imposto de Renda
 * A Receita Federal possui um cadastro dos contribuintes. Cada contribuinte possui nome.
 * Escreva um programa para calcular o imposto a ser pago para 5 contribuintes.
 * Os contribuintes podem ser:
 * PessoaJuridica
 * O imposto corresponde a 10% da renda bruta da empresa
 * PessoaFisica
 * Renda Bruta			Aliquota		Parcela a deduzir
 * 0 a 1400				0%				R$ 0
 * 1400,01 a 2100		10%				R$ 100
 * 2100,01 a 2800		15%				R$ 270
 * 2800,01 a 3600		25%				R$ 500
 * 3600,01 ou mais		30%				R$ 700
 * 
 * Escreva um programa para calcular e imprimir na tela o imposto a ser pago de 6 contribuintes,
 * sendo 3 PJ e 3 PF
 * */

public class Exercicio02 {
	public static void main(String[] args) {
		
		PessoaFisica pf1 = new PessoaFisica();
		PessoaFisica pf2 = new PessoaFisica();
		PessoaFisica pf3 = new PessoaFisica();
		PessoaJuridica pj1 = new PessoaJuridica();
		PessoaJuridica pj2 = new PessoaJuridica();
		PessoaJuridica pj3 = new PessoaJuridica();
		
		pf1.setNome("Maria");
		pf2.setNome("João");
		pf3.setNome("José");
		pj1.setNome("Júlio");
		pj2.setNome("Daniel");
		pj3.setNome("Alberto");
		
		pf1.setRenda(1300);
		pf2.setRenda(1600);
		pf3.setRenda(30000);
		pj1.setRenda(30000);
		pj2.setRenda(1600);
		pj3.setRenda(1303320);
		
		System.out.println(pf1.toString());
		System.out.println(pf2.toString());
		System.out.println(pf3.toString());
		System.out.println(pj1.toString());
		System.out.println(pj2.toString());
		System.out.println(pj3.toString());
		
	}
}
