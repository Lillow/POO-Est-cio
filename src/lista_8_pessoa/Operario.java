package lista_8_pessoa;

/******************************
 * 5. Crie a classe Operario como subclasse da classe Empregado. Um determinado
 * oper�rio tem como atributos, todos da classe Pessoa e da classe Empregado, e
 * tamb�m o atributo valorProducao (que corresponde ao valor monet�rio dos
 * artigos efetivamente produzidos pelo oper�rio) e o atributo comissao (que
 * corresponde � porcentagem do valorProducao que ser� adicionado ao vencimento
 * base do oper�rio). Note que dever� redefinir nesta subclasse o m�todo herdado
 * calcularSalario (o sal�rio de um oper�rio � equivalente ao sal�rio de um
 * empregado usual acrescido da referida comiss�o). Escreva um programa de teste
 * adequado para esta classe.
 ******************************/

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;

	public Operario(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double imposto,
			double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao / 100 * getSalarioBase();
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao / 100 * getSalarioBase();
	}

	public double calcularSalario() {
		return getSalarioBase() - getImposto() + comissao;
	}

}
