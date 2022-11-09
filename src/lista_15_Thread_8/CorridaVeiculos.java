package lista_15_Thread_8;

/*******************************
 * 8. Crie um fluxo paralelo para realizar uma corrida de 5 voltas onde cada
 * ve�culo ser�o os competidores e ter�o tempos de pitStops diferentes: (Carro
 * 1500 e Bicicleta 950) milissegundos. Inicie a corrida informando o nome do
 * ve�culo que largou e seu tipo. Tamb�m informe o nome de cada ve�culo e seu
 * tipo ap�s realizar uma volta. Caso aconte�a algum problema durante a volta
 * relate qual foi o ve�culo e seu tipo. Fique � vontade para sincronizar,
 * priorizar, adormecer ou at� parar as threads. Tamb�m se necess�rio, fa�a com
 * que que eles aguardem por algum momento e as notifique para que voltem a
 * executar. Ao concluir a corrida, informe o ve�culo que terminou.
 *******************************/

public class CorridaVeiculos implements Runnable {
	private String nome;
	private String tipo;
	private int tempoPitStop;

	public CorridaVeiculos(String nome, String tipo, int tempoPitStop) {
		this.nome = nome;
		this.tipo = tipo;
		this.tempoPitStop = tempoPitStop;
	}

	public void run() {
		System.out.println(nome + tipo + " Come�ou...");
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + tipo + " j� percorreu " + i + " voltas.");
				Thread.sleep(tempoPitStop);
			}
		} catch (InterruptedException e) {
			System.out.println(nome + tipo + " Foi interrompida.");
		}
		System.out.println(nome + " Terminou");

	}
}
