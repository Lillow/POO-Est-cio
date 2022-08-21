package lista_1;

import java.util.Scanner;

//13. Escreva uma classe que obtenha o m�ximo divisor comum (MDC) entre dois n�meros fornecidos

public class Mdc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o 1� n�mero:  ");
		int valor1 = scan.nextInt();
		System.out.println("Entre com o 2� n�mero:  ");
		int valor2 = scan.nextInt();

		int resto;
		while (valor2 != 0) {
			resto = valor1 % valor2;
			valor1 = valor2;
			valor2 = resto;
		}
		System.out.println("MDC = " + valor1);
	}
}
