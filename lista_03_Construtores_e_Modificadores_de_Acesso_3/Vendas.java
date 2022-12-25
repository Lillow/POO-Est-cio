package lista_03_Construtores_e_Modificadores_de_Acesso_3;

/*********************
 * 3. Desenvolva um programa que calcule o valor de desconto em uma opera��o de
 * vendas. A classe Vendas dever� ter um construtor onde o valor da vari�vel
 * est�tica desconto ser� de 30% e haver� um m�todo obterTaxaDeDesconto que
 * receber� um valor onde ter� um teste se o valor recebido for 1, se sim, ent�o
 * o desconto ser� de 10%, caso contr�rio o desconto ser� o valor do desconto j�
 * informado no construtor da classe.
 *********************/

public class Vendas {
	private double desconto = 30;
	private double valor;

	public Vendas(double valor) {
		desconto = desconto / 100 * valor;
		valor = valor - desconto;
		this.valor = valor;
	}
	
	public Vendas(double valor, double desconto) {
		if(desconto == 1) {
			desconto = 10;
			this.desconto = desconto;
		}
		
		
		this.desconto = this.desconto / 100 * valor;
		this.valor = valor - desconto;
	}

	
	public String toString() {
		return "Vendas [desconto=" + desconto + ", valor=" + valor + "]";
	}

}
