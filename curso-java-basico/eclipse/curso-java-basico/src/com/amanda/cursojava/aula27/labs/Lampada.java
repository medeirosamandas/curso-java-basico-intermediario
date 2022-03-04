package com.amanda.cursojava.aula27.labs;

public class Lampada {
	
   	String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    boolean isLight = false;
    
    void interruptor() {
    	if(isLight) {
    		isLight = false;
    		System.out.println("Luz apagada!");
    	}else {
    		isLight = true;
    		System.out.println("Luz acesa");
    	}
    }

}
