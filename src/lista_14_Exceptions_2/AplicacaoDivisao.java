package lista_14_Exceptions_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AplicacaoDivisao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Divisao divisao = new Divisao();

		double num1, num2;

		try {
			System.out.println("Digite o primeiro n�mero: ");
			num1 = scan.nextDouble();

			System.out.println("Digite o segundo n�mero: ");
			num2 = scan.nextDouble();

			System.out.println(divisao.calcula(num1, num2));
		} catch (ExcecaoDivisaoPorZero e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("A informa��o passada n�o � n�mero.");
		}
	}
}
