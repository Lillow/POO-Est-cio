package lista_15_Thread;

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

	private Veiculo[] veiculos;
	private double valorApuradoDaOficina;
	Scanner scan = new Scanner(System.in);

	public void adicionarVeiculoFila(Veiculo v) {
		for (int i = 0; i < veiculos.length + 1; i++) {
			veiculos[i] = v;
		}
	}

	public void atenderProximo(Veiculo v) {
		v.limpar();
		v.ajustar();
		String decisao;
		int valor;

		System.out.println("Deseja incrementar o ve�culo?");
		decisao = scan.next();
		if (decisao == "Sim" || decisao == "sim") {
			valor = scan.nextInt();
			v.incrementarVeloc(valor);
		}

		if (v.getTipo() == "Carro") {
			v = new Carro();
			System.out.println("Trocar �leo? ");
			decisao = scan.next();
			if (decisao == "Sim" || decisao == "sim") {

			}
		}

	}

	public Veiculo getVeiculos(int i) {
		return veiculos[i];
	}
}
