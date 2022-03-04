package com.amanda.cursojava.aula52.labs;

import java.util.Scanner;

import com.amanda.cursojava.aula52.labs.Exceptions.AgendaCheiaException;
import com.amanda.cursojava.aula52.labs.Exceptions.ContatoNaoExisteException;

/*Escreva uma classe Contato que contenha nome, telefone e um identificador. Esse identificador deve ser gerado
 * automaticamente pela classe atrav�s de um contador (cada vez que um Contato � criado, o contador � incrementado e
 * atribu�do ao identificador). Crie uma classe Agenda que ir� funcionar para gerenciar os contatos.
 * Essa classe precisa ter um m�todo para adicionar um contato e tamb�m para consultar.
 * Crie uma classe teste que informe um menu ao usu�rio
 * 1 - para consultar um contato da agenda
 * 2 - para adicionar um contato na agenda
 * 
 * Se o contato n�o exisitr, o programa deve lan�ar uma exce��o de ContatoNaoExisteException. Caso a agenda esteja
 * cheia quando o usu�rio quiser adicionar uma exce��o AgendaCheiaException. Trate tamb�m as exce��es de tipo
 * de dados(caso o usu�rio entre com um tipo de dado inv�lido)*/

public class Exercicio01 {
	
	public static void main(String[] args) {
		
        
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        int opcao = 1;
        
        while (opcao != 3){
            opcao = obterOpcaoMenu(scan);
            
            if (opcao == 1){ //Consultar contato
                consultarContato(scan, agenda);
            } else if (opcao == 2){ //Adicionar contato
                adicionarContato(scan, agenda);
            }
        }
    }
    
    public static void adicionarContato(Scanner scan, Agenda agenda){
        try {
            System.out.println("Criando um contato, entre com as informa��es");
            String nome = leInformacaoString(scan, "Entre com o nome do contato");
            String telefone = leInformacaoString(scan, "Entre com o telefone do contato");
            
            Contato contato = new Contato(nome, telefone);

            
            System.out.println("Contato a ser criado: ");
            System.out.println(contato);
            
            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            
            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }
    }
    
    public static void consultarContato(Scanner scan, Agenda agenda){
        String nomeContato = leInformacaoString(scan, "Entre com o nome do contato a ser pesquisado: ");
            try {
                if (agenda.consultaContatoPorNome(nomeContato) >= 0){
                    System.out.println("Contato existe");
                }
            } catch (ContatoNaoExisteException e) {
                System.out.println(e.getMessage());
            }
    }
    
    public static String leInformacaoString(Scanner scan, String msg){
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }
    
    public static int obterOpcaoMenu(Scanner scan){
        
        boolean entradaValida = false;
        int opcao = 3;
        
        while (!entradaValida){
            System.out.println("Digite a op��o desejada:");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");
        
            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);
                
                if (opcao == 1 || opcao == 2 || opcao == 3){
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inv�lida");
                }
            } 
            catch (Exception e){
                System.out.println("Entrada inv�lida, digite novamente\n");
            }
        }
        
        return opcao;
    }

}
