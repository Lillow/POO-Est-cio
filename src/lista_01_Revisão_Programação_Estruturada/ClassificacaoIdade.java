package lista_01_Revis�o_Programa��o_Estruturada;

import java.util.Scanner;

//5. Escreva uma classe que receba a idade de um atleta, fa�a uma classifica��o seguindo a tabela abaixo:

public class ClassificacaoIdade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;

		System.out.println("Digite a idade: ");
		idade = sc.nextInt();

		if (idade <= 4) {
			System.out.println("N�o permitido.");
		}
	}
}
