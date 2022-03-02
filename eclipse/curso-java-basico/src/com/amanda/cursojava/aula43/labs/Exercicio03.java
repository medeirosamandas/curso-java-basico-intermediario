package com.amanda.cursojava.aula43.labs;

/*Animais
 * Um animal cont�m nome, comprimento, n�mero de patas (padr�o � 4), cor, ambiente e velocidade (em m/s)
 * Um peixe � um animal, tem 0 patas, seu ambiente � o mar (padr�o), cor cinzenta (padr�o). Al�m disso tem como
 * caracter�sticas barbatanas e caldas
 * Um urso � um mam�fero, cor castanho e seu alimento preferido � o mel.
 * Crie as classes Anima, Peixe e Mam�fero.
 * Para a classe Animal, coloque os atributos:
 * Nome, comprimento, patas, cor ambiente, velocidade
 * Para as classe Peixe, codifique o atributo caracter�sticas
 * */

public class Exercicio03 {
	
	public static void main(String[] args) {
		   Animal camelo = new Animal();
	        camelo.setNome("Camelo");
	        camelo.setComprimento(150);
	        //camelo.setPatas(4);
	        camelo.setCor("Amarelo");
	        camelo.setAmbiente("Terra");
	        camelo.setVelocidade(2);
	        
	        Peixe tubarao = new Peixe();
	        tubarao.setNome("Tubar�o");
	        tubarao.setComprimento(300);
	        tubarao.setVelocidade(1.5);
	        
	        Mamifero urso = new Mamifero();
	        urso.setNome("Urso-do-canad�");
	        urso.setComprimento(180);
	        urso.setCor("Vermelho");
	        urso.setVelocidade(0.5);
	        
	        Animal[] animais = new Animal[3];
	        animais[0] = camelo;
	        animais[1] = tubarao;
	        animais[2] = urso;
	        
	        System.out.println("-----------------------");
	        for (Animal animal : animais){
	            System.out.println(animal);
	            System.out.println("-----------------------");
	        }
	}
	
	

}
