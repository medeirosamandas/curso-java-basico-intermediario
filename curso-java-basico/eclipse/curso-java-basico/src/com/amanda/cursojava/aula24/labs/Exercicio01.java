package com.amanda.cursojava.aula24.labs;

// Escreva uma classe para representar uma l?mpada que est? ? venda em um supermercado

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		   	Lampada lampada = new Lampada();
		    lampada.modelo = "A60";
		    lampada.tensao = "Bivolt";
		    lampada.garantiaMeses = 36;
		    lampada.potencia = 7;
		    lampada.cor = "Amarela";
		    lampada.tipoLuz = "Amarela";
		    lampada.tipoAbajur = true;
		    
		    lampada.tipos = new String[5];
		    lampada.tipos[0] = "Abajur";
		    lampada.tipos[1] = "Lampe?es";
		
	}

}
