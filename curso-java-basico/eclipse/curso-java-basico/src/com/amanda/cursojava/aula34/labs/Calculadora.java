package com.amanda.cursojava.aula34.labs;

public class Calculadora {
	
	static int somar(int num1, int num2) {
		return num1 + num2;
	}
	static double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	static int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	static double subtrair(double num1, double num2) {
		return num1 - num2;
	}
	static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	static int dividir(int num1, int num2) {
		return num1 / num2;
	}
	static double dividir(double num1, double num2) {
		return num1 / num2;
	}
	
	static double potencia(double num1, int num2) {
		return Math.pow(num1, num2);
	}
	
	 public static int fatorial(int num){
	      
	        if (num == 0){
	            return 1;
	        }
	        
	        int total = 1;
	        for (int i=num; i>1; i--){
	            total *= i;
	        }
	        
	        return total;
	    }

}
