package lista_01_Revis�o_Programa��o_Estruturada;

import java.util.Scanner;

//10. Escreva uma classe que receba um n�mero qualquer do usu�rio e identifique se � um n�mero primo.

public class Primos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		boolean primo = true;

		System.out.println("Entre com um numero ");
		num = scan.nextInt();

		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				primo = false;
			}
			
		}
		if (primo) {
			System.out.println("� primo!");
		}else {
			System.out.println("N�o � pimo!");
		}
	}
}
