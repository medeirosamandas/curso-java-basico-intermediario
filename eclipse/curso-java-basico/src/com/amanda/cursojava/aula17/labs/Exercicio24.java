package com.amanda.cursojava.aula17.labs;

/*O Sr. Manoel Joaquim acaba de adquirir umaa panificadora e pretende implantar a metodologia da tabelinha, que j� � um sucesso na sua loja de 1,99. Voc� foi contratado para desenvolver o programa
 * que ponta a tabela de pre�os de p�es, de 1 at� 50 p�es, a partir do pre�o do p�o informado pelo usu�rio, conforme exemplo abaixo:
 * Pre�o do p�o R$ 0.18
 * Panificadora P�o de Ontem - Tabela de pre�os
 * 1 - R$ 0.18
 * 2 - R$ 0.36
 * ...
 * 50 - R$ 9.00*/


public class Exercicio24 {
	
    public static void main(String[] args){
        
        //Scanner scan = new Scanner(System.in);
        
        System.out.println("Pre�o do p�o: R$ 0.18");
        System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
        
        for (int i=1; i<=50; i++){
            System.out.println(i + " - R$ " + (0.18*i));
        }
    }

}
