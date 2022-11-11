package lista_15_Thread_1_a_7;

import java.util.Scanner;

/*******************************
 * 
 * 6. Crie a classe Oficina:
 * 
 * a. A classe Oficina ter� como atributo um array de Veiculos e um double com o
 * valor apurado da oficina.
 * 
 * b. Possuir� os seguintes m�todos: - adicionarVeiculoFila(Veiculo v): recebe
 * um ve�culo e o adiciona no array de ve�culos; - atenderProximo(): olha o
 * pr�ximo da fila e o atende, isto �,realiza a limpeza(m�todo limpar) econserta
 * o ve�culo (m�todo ajustar). Em seguida, pergunta ao usu�rio se ele deseja
 * incrementar o ve�culo, se a resposta for SIM, ele pede um valor e faz o
 * incremento no ve�culo (m�todo incrementarVeloc). Em seguida, o m�todo avalia
 * se a classe � um Carro, se for ele pergunta se o mesmo deseja trocar o �leo,
 * caso a resposta seja SIM, troque o �leo do carro (m�todo trocarOleo). Por
 * fim, como o ve�culo j� foi atendido, ele o remove da fila.
 *
 */

public class Oficina {
	private Veiculo veiculos[] = new Veiculo[100];
	private double valorApurado;
	private int finalFila = 0;
	private int inicioFila = 0;

	public Oficina() {
	}

	public void adicionarVeiculoFila(Veiculo v) {
		this.veiculos[finalFila] = v;
		this.finalFila++;
	}

	public void atenderProximo() {
		this.veiculos[inicioFila].limpar();
		this.veiculos[inicioFila].ajustar();

		Scanner scan = new Scanner(System.in);
		System.out.println("Voc� deseja incrementar o ve�culo?");
		String respostaIncremento = scan.next();

		if (respostaIncremento.equalsIgnoreCase("sim") || respostaIncremento.equalsIgnoreCase("Sim")) {
			System.out.println("Qual o valor do incremento?");
			int valorIncremento = scan.nextInt();
			this.veiculos[inicioFila].incrementarVeloc(valorIncremento);
		}
		if (this.veiculos[inicioFila] instanceof Carro) {
			System.out.println("Deseja trocar o �leo?");
			String respostaOleo = scan.next();
			if (respostaOleo.equalsIgnoreCase("sim") || respostaOleo.equalsIgnoreCase("Sim")) {
				Carro carro = (Carro) this.veiculos[inicioFila];
				carro.trocarOleo();
			}
		}

		this.veiculos[inicioFila] = null;
		this.inicioFila++;
	}
}
