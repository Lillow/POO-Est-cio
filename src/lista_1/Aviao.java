/******************************************************************************

30. A tabela abaixo se refere ao tempo em que um avi�o leva para percorrer o percurso entre as cidades 
que fazem parte da rota da aeronave.

*******************************************************************************/

package lista_1;
//Incompleto!

import java.util.Scanner;

public class Aviao {
	public static void percorrer() {
		Scanner scan = new Scanner(System.in);
		String cidades[] = { "Recife", "Jo�o Pessoa", "Macei�", "Natal", "Aracaj�", "Fortaleza", "Salvador" };
		int distancias[][] = new int[7][7];
		int cidade1, cidade2, total;

		for (int i = 0; i < cidades.length; i++) {
			for (int j = 0; j < cidades.length; j++) {
				if (i == j) {
					distancias[i][j] = 0;
				} else if ((i == 0 && j == 1) || (i == 1 && j == 0) || (i == 1 && j == 5) || (i == 3 && j == 5)
						|| (i == 5 && j == 1) || (i == 5 && j == 3)) {
					distancias[i][j] = 2;
				} else if ((i == 0 && j == 2) || (i == 0 && j == 5) || (i == 2 && j == 0) || (i == 2 && j == 3)
						|| (i == 3 && j == 2) || (i == 5 && j == 0)) {
					distancias[i][j] = 11;
				} else if ((i == 1 && j == 2) || (i == 2 && j == 1)) {
					distancias[i][j] = 7;
				} else if ((i == 0 && j == 3) || (i == 3 && j == 0)) {
					distancias[i][j] = 6;
				} else if ((i == 0 && j == 4) || (i == 1 && j == 6) || (i == 4 && j == 0) || (i == 6 && j == 1)) {
					distancias[i][j] = 15;
				} else if ((i == 0 && j == 6) || (i == 3 && j == 6) || (i == 6 && j == 0) || (i == 6 && j == 3)) {
					distancias[i][j] = 1;
				} else if ((i == 1 && j == 3) || (i == 3 && j == 1)) {
					distancias[i][j] = 12;
				} else if ((i == 2 && j == 4) || (i == 4 && j == 2)) {
					distancias[i][j] = 8;
				} else if ((i == 3 && j == 4) || (i == 4 && j == 3)) {
					distancias[i][j] = 10;
				} else if ((i == 4 && j == 5) || (i == 5 && j == 4)) {
					distancias[i][j] = 5;
				} else if ((i == 2 && j == 6) || (i == 4 && j == 6) || (i == 6 && j == 2) || (i == 6 && j == 4)) {
					distancias[i][j] = 13;
				} else if ((i == 5 && j == 6) || (i == 6 && j == 5)) {
					distancias[i][j] = 14;
				}
			}
		}

//		for (int i = 0; i < cidades.length; i++) {
//			for (int j = 0; j < cidades.length; j++) {
//				System.out.print(" [" + distancias[i] [j] + "] ");
//			}
//			System.out.println();
//		}
	
		for (int i = 0; i < cidades.length; i++) {
			System.out.printf("%d. %s \n",(i + 1), cidades[i]);
		}

		do {
			cidade1 = -1;
			cidade2 = -1;
			total = 0;
			System.out.println("Digite o n�mero da 1� cidade: ");
			cidade1 = scan.nextInt();

			System.out.println("Digite o n�mero da 2� cidade: ");
			cidade2 = scan.nextInt();

//			for (int i = 0; i < cidade2; i++) {
//				for (int j = cidade1; j < cidade2; j++) {
//					total += distancias[i][j];
//				}
//			}

			System.out.println(total);
		} while (cidade1 != cidade2);

	}

	public static void main(String[] args) {
		percorrer();
	}
}
