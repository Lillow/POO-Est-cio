package lista_01_Revis�o_Programa��o_Estruturada;

import java.util.Scanner;

//15. Escreva uma classe que receba diversos n�meros(inteiros e/ou positivos) do usu�rio e o programa 
//deve ser interrompido ao ser informado o n�mero zero. Com os n�meros recebidos, determine o 
//maior e o menor valor deste conjunto de n�meros

public class Q_15_NumerosParada0 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, maior, menor;
		
		System.out.println("Digite um n�mero: ");
		num = scan.nextInt();
		maior = num;
		menor = num;

		while (true) {

			if (num >= 0) {
				
				if (num == 0) {
					break;
				} else if (num > maior) {
					maior = num;
				} else if (num < menor) {
					menor = num;
				}

			} else {
				if (num < 0) {
					System.out.println("N�mero inv�lido!");
				}
			}
			
			System.out.println("Digite outro n�mero: ");
			num = scan.nextInt();

		}
		System.out.printf("O maior valor digitado foi %d e o menor foi %d ", maior, menor);
	}
}
