package lista_1;

import java.util.Scanner;

//11. Escreva um algoritmo que receba um n�mero qualquer do usu�rio e calcule o fatorial deste n�mero.

public class Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um n�mero para ver o seu fatorial: ");
		num = scan.nextInt();
		
		System.out.print(num + "! = " + num + " x ");
		for (int i = num -1; i > 0; i--) {
			num = num * i;
			System.out.print(i);
			if (i != 1) {
				System.out.print(" x ");
			}
		}
		System.out.println("\nResultado: " + num);
	}
}
