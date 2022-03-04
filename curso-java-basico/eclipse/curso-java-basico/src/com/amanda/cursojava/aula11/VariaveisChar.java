package com.amanda.cursojava.aula11;

public class VariaveisChar {

	public static void main(String[] args) {


		//char o = 'o';
		//char i = 'i';
		char o = 111;
		char i = 105;
		
		// se não houver as aspas na frente, este output será a soma dos dois caracteres no sistema ASCII
		// 216
		// System.out.println(o + i);
		
		char interrogacao = 0X00E1;
		System.out.println(""+o+i + interrogacao);
	}

}
