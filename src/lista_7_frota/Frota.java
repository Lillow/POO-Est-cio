package lista_7_frota;

/*********************
 * 1. Ap�s analisar o diagrama de classe abaixo, crie um programa em Java que
 * implemente o cen�rio considerando a composi��o entre as classes:
 *********************/

public class Frota {
	public String nome;
	public String tipo;
	public String responsavel;
	public Carro carro = new Carro();
	public Caminhao caminhao = new Caminhao();
}
