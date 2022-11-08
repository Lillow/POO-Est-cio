package lista_15_Thread;

/******************************
 * 1. Crie uma classe chamada Veiculo, que conter� os seguintes atributos
 * privados: chassi (String), tipo (carro ou bicicleta - String) e
 * velocidadeMaxima (double). Essa classe dever� possuir um construtor vazio e
 * um construtor que inicialize todos os atributos.
 * 
 * 3. Adicione � classe Veiculo os seguintes m�todos:
 * 
 * a.limpar: m�todo p�blico que ao ser chamado imprime a seguinte mensagem: �O
 * ve�culo TIPO_DO_VEICULO� est� sendo limpo;
 * 
 * b.ajustar: m�todo p�blico que ao ser chamado imprime uma mensagem dizendo: �O
 * ve�culo TIPO_DO_VEICULO� est� sendo ajustado;
 * 
 * c.incrementarVeloc: m�todo p�blico que recebe um valor inteiro e que soma
 * esse inteiro � velocidadeMaxima do ve�culo.
 * 
 ******************************/

public class Veiculo {
	private String chassi;
	private final String[] tipos = { "Carro", "Bicicleta" };
	private String tipo;
	private double velocidadeMaxima;

	public Veiculo() {

	}

	public Veiculo(String chassi, double velocidadeMaxima, int tipo) {
		this.chassi = chassi;
		this.velocidadeMaxima = velocidadeMaxima;
		this.tipo = tipos[tipo];
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(int i) {
		tipo = tipos[i];

	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double setVelocidadeMaxima) {
		velocidadeMaxima = setVelocidadeMaxima;
	}

	public void limpar() {
		System.out.println("O v�culo " + this.tipo + " est� sendo limpo.");
	}

	public void ajustar() {
		System.out.println("O ve�culo " + this.tipo + " est� sendo ajustado");
	}

	public void incrementarVeloc(int velocidade) {
		velocidadeMaxima += velocidade;
	}
}
