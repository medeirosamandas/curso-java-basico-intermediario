package com.amanda.cursojava.aula33.labs;

// Reescreva este exercic�o utilizando o que foi aprendido nas �ltimas aulas,
// encapsulamento, modificadores de acesso, palavra chave this, construtores, etc
/*Escreva uma classe para representar uma l�mpada. Desenvolva m�todos para ligar e desligar a l�mpada*/

public class Exercicio01 {

	public static void main(String[] args) {

        Lampada lampada = new Lampada();
        
        lampada.ligar();
        
        lampada.mostrarEstado();
        
        lampada.desligar();
        
        lampada.mostrarEstado();
        
        lampada.mudarEstado();
        
        lampada.mostrarEstado();
	}

}
