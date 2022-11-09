package lista_15_Thread;

/******************************
 * 4. Adicione � classe Carro o seguinte m�todo:
 * 
 * a.trocarOleo: m�todo p�blico que imprime uma mensagem dizendo: �O
 * ve�culoTIPO_DO_VEICULO trocou o �leo�.
 ******************************/

public class Carro extends Veiculo {
	private double combustivel;

	public Carro() {
		setTipo(0);
	}

	public Carro(String chassi, double velocidadeMaxima, double combustivel) {
		super(chassi, velocidadeMaxima, 0);
		this.combustivel = combustivel;
	}

	public void trocarOleo() {
		System.out.println("O ve�culo" + getTipo() + "trocou o �leo.");
	}
}
