package lista_13_Classes_Abstratas_Interfaces;

/******************************
 * 4. Crie as classes Poupanca e ContaCorrente, que ser�o subclasses de
 * ContaAbstrata. N�o esque�a de implementar seus m�todos abstratos!
 * 
 * 5. Na classe Poupanca adicione o seguinte m�todo: - renderJuros(): aumenta em
 * 1% o saldo
 * 
 ******************************/

public class Poupanca extends ContaAbstrata {
	public Poupanca(Cliente c, String numeroDaConta, double saldoInicial, String tipo) {
		Cliente cliente = c;
		setNumeroDaConta(numeroDaConta);
		setSaldo(saldoInicial);
		setTipo(tipo);
	}

	public void renderJuros() {
		setSaldo(getSaldo() + getSaldo() * 0.01);
	}

	public void deposito(double valor) {
		setSaldo(getSaldo() + valor);
	}

	public void saque(double valor) {
		setSaldo(getSaldo() - valor);
	}
}
