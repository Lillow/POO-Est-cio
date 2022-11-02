package lista_13_Classes_Abstratas_Interfaces;

/******************************
 * 8. Crie uma classe chamada Banco, que implementar� a interface BancoGeral,
 * dando as seguintes implementa��es para cada m�todo: - abrirConta(Cliente c,
 * String numeroDaConta, double saldoInicial, String tipo): Criar� uma Conta com
 * o n�mero informado, o saldo informado e o cliente informado. O tipo da conta
 * a ser criada depender� do tipo informado, podendo ser Poupan�a ou Conta
 * Corrente. - deposito(ContaAbstrata c, double valor): far� um deposito na
 * conta informada no valor informado. - saque(ContaAbstrata c, double valor):
 * far� um saque na conta informada no valor informado.
 ******************************/

public class Banco implements BancoGeral {
	public ContaAbstrata conta;

	public void abrirConta(Cliente c, String numeroDaConta, double saldoInicial, int tipo) {
		switch (tipo) {
		case 1: {
			conta = new ContaCorrente(c, numeroDaConta, saldoInicial, "Corrente");
			break;
		}

		case 2: {
			conta = new Poupanca(c, numeroDaConta, saldoInicial, "Poupan�a");
			break;
		}
		default:
			System.out.println("Tipo inv�lido");
		}
	}

	public void deposito(double valor) {
		conta.deposito(valor);

	}

	public void saque(double valor) {
		conta.saque(valor);
	}

}
