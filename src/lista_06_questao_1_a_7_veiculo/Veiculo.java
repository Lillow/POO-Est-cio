package lista_06_questao_1_a_7_veiculo;

/******************************
 * 1. Crie uma classe chamada Veiculo, que conter� os seguintes atributos
 * privados: chassi (String), tipo (carro ou bicicleta - String),
 * velocidadeMaxima (double) e cont (int) como est�tico. Essa classe dever�
 * possuir um construtor vazio e um construtor que inicialize todos os atributos
 * e incremente este contador (cont).
 ******************************/

/******************************
 * 3. Adicione � classe Veiculo os seguintes m�todos:
 * 
 * a. gets/sets para todos os atributos;
 * 
 * b. limpar: m�todo p�blico que ao ser chamado imprime a seguinte mensagem: �O
 * ve�culo TIPO_DO_VEICULO�, com CHASSI est� sendo limpo;
 * 
 * c. ajustar: m�todo p�blico que ao ser chamado imprime uma mensagem dizendo:
 * �O ve�culo TIPO_DO_VEICULO�, com CHASSI est� sendo ajustado;
 * 
 * d. incrementarVeloc: m�todo p�blico que recebe um valor inteiro e que soma
 * esse inteiro � velocidadeMaxima do ve�culo e imprime uma mensagem dizendo: �O
 * ve�culo TIPO_DO_VEICULO�, com CHASSI agora tem a velocidadeMaxima km/h de
 * velocidade.
 ******************************/

public class Veiculo {
	private String chassi;
	private String tipo;
	private String[] tipos = { "carro", "bicicleta" };
	private double velocidadeMaxima;
	private static int cont;

	public Veiculo() {
		cont++;
	}

	public Veiculo(String chassi, double velocidadeMaxima, int tipo) {
		this.chassi = chassi;
		this.velocidadeMaxima = velocidadeMaxima;
		this.tipo = tipos[tipo];
		cont++;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getTipo() {
		return tipo;
	}

	public String[] getTipos() {
		return tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void limpar() {
		System.out.println("O ve�culo " + tipo + " com CHASSI " + chassi);
	}

	public void ajustar() {
		System.out.println("O ve�culo " + tipo + " com CHASSI " + chassi + " est� sendo ajustado.");
	}

	public void incrementarVeloc(int velocidade) {
		velocidadeMaxima += velocidade;
		System.out.println(
				"O ve�culo " + tipo + " com CHASSI " + chassi + " agora tem a velocidadeMaxima " + velocidade + "km/h");
	}

	public int getCont() {
		return cont;
	}
}
