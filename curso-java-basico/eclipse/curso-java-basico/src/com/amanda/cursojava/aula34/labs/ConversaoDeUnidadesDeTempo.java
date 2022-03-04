package com.amanda.cursojava.aula34.labs;

public class ConversaoDeUnidadesDeTempo {
	
	static double minutoEmSegundos(double minuto) {
		return minuto * 60;
	}
	
	static double horaEmMinutos(double hora) {
		return hora * 60;
	}
	static double diaEmHoras(double dia) {
		return dia * 24;
	}
	static double semanaEmDias(double semana) {
		return semana * 7;
	}
	static double mesEmDias(double mes) {
		return mes * 30;
	}
	static double anoemDias(double ano) {
		return ano * 365.25;
	}

}
