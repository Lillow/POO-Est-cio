package lista_01;

import java.util.Scanner;

//14. Escrever uma classe em que receba tr�s valores (a, b e c) e podem ser os comprimentos dos lados de 
//um tri�ngulo. Se for, verifique se o tri�ngulo � um equil�tero, is�sceles ou escaleno. Caso n�o seja, 
//tamb�m informar que comp�e um tri�ngulo

public class Triangulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Entre com o 1� n�mero:  ");
		a = scan.nextInt();
		
		System.out.println("Entre com o 2� n�mero:  ");
		b = scan.nextInt();
		
		System.out.println("Entre com o 3� n�mero:  ");
		c = scan.nextInt();
		
		if (a + b < c || b + c < a || a + c < b) {
			System.out.println("Valores inv�lidos");
		}else {
			if (a == b && b == c) {
				System.out.println("Os valores farma um tri�ngulo equil�tero.");
			} else if (a == b || b == c || c == a) {
				System.out.println("Os valores farma um tri�ngulo isosceles.");
			}else {
				System.out.println("Os valores farma um tri�ngulo escaleno.");
			}
		}
	}
}
