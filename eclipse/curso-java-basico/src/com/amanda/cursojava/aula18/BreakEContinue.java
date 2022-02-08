package com.amanda.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		
		// utiliza��o do break comum, para sair do loop
		// quando utilizado o break, ele sai do loop assim que a condi��o for satisfeita a primeira vez, sem o break ele faz o loop at� o final da condi��o apresentada no loop for

		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		int num = sc.nextInt();
		
		System.out.println("Entre com um limite");
		int max = sc.nextInt();
		
		// 
		
		for(int i = num; i <= max; i++) {
			if (i % 7 == 0) {
				System.out.println("O valor de i �: " + i);
				break;
			}
		}*/
		
		// break com rotulo (n�o � comum a utiliza��o no dia a dia)
		
		/*for(int i = 0; i <=4; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3:{
						if (i == 1) {
							break rotulo1;
						}
						if (i == 2) {
							break rotulo2;
						}
						if (i ==3) {
							break rotulo3;
						}
						System.out.println("rotulo3");
					}
					System.out.println("rotulo2");

				}
				System.out.println("rotulo1");

			}
			System.out.println(i);

		}*/
		
		// continue
		// o continue v� a condi��o, se for satisfeita, ela j� incrementa +1 e n�o passa pelo c�digo a ser feito dentro do for.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		int num = sc.nextInt();
		
		System.out.println("Entre com um limite");
		int max = sc.nextInt();
		
		// 
		
		for(int i = num; i <= max; i++) {
			if (i % 7 == 0) {
				
				continue;
			}
			System.out.println("O valor de i �: " + i);
		}
	}

}
