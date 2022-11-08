package lista_15_Thread;

/******************************
 * 2. Crie duas subclasses para Veiculo:
 * 
 * a. Uma chamada Bicicleta, que possuir� o atributo privado nrMarchas (int);
 * 
 * b. Uma chamada Carro, que possuir� o atributo privado combust�vel (double).
 * Crie para as duas subclasses um construtor vazio e um construtor que
 * inicializa todos os atributos. Lembrando que como elas herdam de Veiculo,
 * tamb�m possuem os atributos que Veiculo possuir.
 * 
 * 5. Na classe Bicicleta, seguinte m�todo:
 * 
 * a. incrementarVeloc: m�todo p�blico que recebe um inteiro e soma esse inteiro
 * ao nrMarchas da bicicleta. Al�m disso, ele aumenta a velocidade da bicicleta
 * no valor da % do n�mero de marchas incrementadas.
 ******************************/

public class Bicicleta extends Veiculo {
	private int nrMarchas;

	public Bicicleta() {
		setTipo(1);
	}

	public Bicicleta(String chassi, double velocidadeMaxima, int nrMarchas) {
		super(chassi, velocidadeMaxima, 1);
		this.nrMarchas = nrMarchas;
	}

	public void incrementarVeloc(int qtdMarcha) {
		double velocPorMarcha = this.getVelocidadeMaxima() / this.nrMarchas;
		this.nrMarchas = this.nrMarchas + qtdMarcha;
		double velocFinal = velocPorMarcha * qtdMarcha;
		this.setVelocidadeMaxima(this.getVelocidadeMaxima() + velocFinal);
	}
}
