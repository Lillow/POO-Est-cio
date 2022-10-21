package lista_4_questao_1_imovel;

/*********************
 * 1. Criar a classe Imovel, que possui um endere�o e um pre�o. � Criar uma
 * classe Novo, que herda Imovel e possui um adicional no pre�o. � Criar m�todos
 * de acesso e impress�o deste valor adicional. � Criar uma classe Usado, que
 * herda Imovel e possui um desconto no pre�o. � Criar m�todos de acesso e
 * impress�o para este desconto. � Criar uma classe de VendaImovel com o m�todo
 * main(). � Neste m�todo: Crie um im�vel. Pe�a para o usu�rio digitar 1 para
 * novo e 2 para usado. Conforme a defini��o do usu�rio e imprima o valor final
 * do im�vel.
 *********************/

public class Imovel {
	private String endereco;
	private double preco;

	public Imovel(String endereco, double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}

}
