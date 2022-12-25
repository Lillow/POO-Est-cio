package lista_01_Revis�o_Programa��o_Estruturada;

/******************************
22. Escreva uma classe que permita informar dados para dois arrays de inteiros de 20 posi��es cada um 
e apresente a intersec��o dos arrays. Intersec��o s�o os elementos repetidos em ambos arrays sem 
repeti��o (caso apare�a o mesmo n�mero novamente). Para sofisticar, criar um terceiro array com 
esta intersec��o.
******************************/

import java.util.Arrays;
import java.util.Scanner;

public class Q_22_ArraysInterseccao {
	public static void main(String[] args) {
		int[] a = incrementa("Vetor A");
		int[] b = incrementa("Vetor B");
		int[] c = interseccao(a, b);

		System.out.println(Arrays.toString(c));

	}

	public static int[] incrementa(String nomeVet) {
		int[] vet = new int[20];
		Scanner scan = new Scanner(System.in);

		System.out.println("Incremente os valores do vetor " + nomeVet);
		for (int i = 0; i < 20; i++) {
			System.out.printf("Vetor posi��o[%d]: ", i);
			vet[i] = scan.nextInt();
		}

		return vet;
	}

	public static int[] interseccao(int[] a, int[] b) {
		int[] aux = new int[20];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == b[j]) {
					aux[k] = a[i];
					k++;
				}
			}
		}
		int[] c = new int[k];
		for (int i = 0; i < k; i++) {
			c[i] = aux[i];
		}

		return c;
	}
}
