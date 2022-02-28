package com.amanda.cursojava.aula33.labs;

// Reescreva este exercicío utilizando o que foi aprendido nas últimas aulas,
// encapsulamento, modificadores de acesso, palavra chave this, construtores, etc
/*Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar e desligar a lâmpada*/

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
