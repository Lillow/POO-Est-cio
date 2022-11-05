package lista_14_Exceptions_1;

/******************************
 * 1. Criar um projeto para cadastramento de contas onde deve ser Implementado o
 * tratamento de exce��es para o Cadastro destas Contas.
 * 
 * a. Em algum lugar no projeto devem existir algumas funcionalidades:
 * 
 * i. Os m�todos set das classes b�sicas de neg�cio (Conta, ContaAPagar,
 * ContaAReceber, Cliente e Fornecedor) lan�ar�o exce��es do tipo
 * ExcecaoDadoInvalido quando o dado passado como par�metro n�o for v�lido.
 * 
 * ii. O m�todo inserir da classe CadastroContas deve lan�ar a exce��o
 * ExcecaoCadastroCheio quando n�o puder mais inserir contas no array e a
 * exce��o ExcecaoContaJaExistente quando uma conta com um mesmo n�mero j�
 * estiver cadastrada.
 * 
 * iii. O m�todo buscar da classe CadastroContas deve lan�ar a exce��o
 * ExcecaoContaInexistente quando a conta que se deseja buscar n�o estiver
 * cadastrada.
 ******************************/

public class Conta {
	private String cliente, fornecedor;
	private int numConta;
	private double contaApagar;
	private double contaAreceber;

	public Conta() {

	}

	public String getCliente() throws ExcecaoDadoInvalido {
		return cliente;
	}

	public void setCliente(String cliente) throws ExcecaoDadoInvalido {
		this.cliente = cliente;
	}

	public String getFornecedor() throws ExcecaoDadoInvalido {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) throws ExcecaoDadoInvalido {
		this.fornecedor = fornecedor;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getContaApagar() {
		return contaApagar;
	}

	public void setContaApagar(double contaApagar) {
		this.contaApagar = contaApagar;
	}

	public double getContaAreceber() {
		return contaAreceber;
	}

	public void setContaAreceber(double contaAreceber) {
		this.contaAreceber = contaAreceber;
	}

}
