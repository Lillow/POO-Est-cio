package lista_01_Revis�o_Programa��o_Estruturada;

import java.util.Scanner;

/******************************
 * 28. Criar um m�todo que calcule o n�mero de Combina��es de n elementos p a p.
 * A f�rmula � a seguinte:
 ******************************/

public class Q_28_Combinacoes {
	public static double fatorial(double num) {
		double result = 1;
		while (num > 0) {
			result = result * num;
			num--;
		}
		return result;
	}

	public static double calculeCombinacoes(double n, double p) {
		double fatorialN = fatorial(n);
		double fatorialP = fatorial(p);
		double fatorialNP = fatorial(n - p);
		double c = fatorialN / (fatorialP * fatorialNP);
		return c;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("n: ");
		double n = scan.nextDouble();

		System.out.println("p: ");
		double p = scan.nextDouble();

		System.out.println(calculeCombinacoes(n, p));
	}
}
