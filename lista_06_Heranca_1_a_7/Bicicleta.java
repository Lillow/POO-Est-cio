package lista_06_Heranca_1_a_7;

/******************************
 * 2. Crie duas subclasses para Veiculo:
 * 
 * a. Uma chamada Bicicleta, que possuir� o atributo privado nrMarchas (int);
 * 
 * b. Uma chamada Carro, que possuir� o atributo privado combust�vel (double).
 * Crie para as duas subclasses um construtor vazio e um construtor que
 * inicializa todos os atributos. Lembrando que como elas herdam de Veiculo,
 * tamb�m possuem os atributos que Veiculo possui
 ******************************/

/******************************
 * 5. Na classe Bicicleta, seguinte m�todo:
 * 
 * a. aumentarMarcha: m�todo p�blico que recebe um inteiro e soma esse inteiro
 * ao nrMarchas da bicicleta. Al�m disso, ele aumenta a velocidade da bicicleta
 * chamando o m�todo da superclasse (incrementarVeloc), e passa o valor inteiro
 * resultante da express�o: ((nrMarchas da bicicleta/velocidadem�xima da
 * supleclasse)*100). Neste momento o m�todo da superclasse reportar� a nova
 * velocidade.
 ******************************/

public class Bicicleta extends Veiculo {
	private int nrMarchas;

	public Bicicleta() {

	}

	public Bicicleta(String chassi, double velocidadeMaxima, int nrMarchas) {
		super(chassi, velocidadeMaxima, 1);
		this.nrMarchas = nrMarchas;
	}

	public double aumentarMarcha(int marcha) {
		nrMarchas += marcha;
		
		return ((nrMarchas/getVelocidadeMaxima())*100);
		
	}

}
