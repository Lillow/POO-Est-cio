package lista_10_Classes_Abstratas_Interfaces_3;

/******************************
 * 3. Dado o diagrama UML da Figura 1.1, construir um programa capaz de simular
 * o funcionamento de folha de pagamento com quatro classes de trabalhadores:
 * Empregado, PorHora, PorComissao e PorHoraeComissao. A classe Empregado deve
 * ser abstrata, pois o m�todo getPay(), que retorna o quanto cada tipo de
 * empregado deve ganhar, s� poder� ser definido nas subclasses. Desse modo, a
 * classe Empregado deve ser declarada abstrata. Para todas as classes cujo
 * ganho dos trabalhadores est� relacionado com a comiss�o relativa ao montante
 * de vendas (PorComissao e PorHoraeComissao), deve-se empregar o m�todo
 * setVendas e a informa��o contida no campo COMMISSION_RATE. Por �ltimo, a
 * classe FolhadePagamento emprega objetos de todas as classes. Uma vis�o geral
 * do programa � dada no diagrama UML da Figura 1.1.
 ******************************/

public abstract class Empregado {
	private String name;

	public Empregado(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void printPay() {
		System.out.printf("%.2f", getPay());
	}

	public abstract double getPay();
}
