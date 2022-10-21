package lista_8_questao_1_a_5_pessoa;

/******************************
 * 2. Como subclasse da classe Pessoa criar a classe Fornecedor. Onde cada
 * inst�ncia da classe Fornecedor tem, para al�m dos atributos que caracterizam
 * a classe Pessoa, os atributos valorCredito (correspondente ao cr�dito m�ximo
 * atribu�do ao fornecedor) e valorDivida (montante da d�vida para com o
 * fornecedor). Implemente na classe Fornecedor, (getters) e (setters) mais um
 * m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos
 * valorCredito e valorDivida. Depois de implementada a classe Fornecedor, criar
 * um programa de teste adequado que lhe permita verificar o funcionamento dos
 * m�todos implementados na classe Fornecedor e os herdados da classe Pessoa.
 ******************************/

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;

	public Fornecedor(String nome, String endereco, int telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double obterSaldo() {
		return valorCredito - valorDivida;
	}
}
