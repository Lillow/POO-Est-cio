package lista_06_questao_1_a_7_veiculo;

/******************************
7. Crie uma classe VeiculoTeste com um m�todo main, e crie 3 Bicicletas e 2 Carros de forma que sempre 
guarde a quantidade de ve�culos que est�o sendo criados. Em seguida chame os m�todos ajustar e limpar 
destes objetos. Tamb�m chame o m�todo aumentarMarcha dos objetos que s�o do tipo bicicleta e passe 
algum valor diferente. Agora chame o m�todo aumentar velocidade dos objetos carros. Chame o m�todo 
trocar �leo dos objetos carros. Por fim obtenha a quantidade de ve�culos que foram criados.
******************************/

import java.util.Arrays;

public class TesteVeiculo {
	public static void main(String[] args) {
		Bicicleta bicicleta1 = new Bicicleta("8BW", 50, 5);
		Bicicleta bicicleta2 = new Bicicleta("6CD", 30, 7);
		Bicicleta bicicleta3 = new Bicicleta("1AQ", 40, 5);
		Carro carro1 = new Carro("9LA", 150, 100);
		Carro carro2 = new Carro("3KX", 150, 100);

		bicicleta1.ajustar();
		bicicleta1.limpar();

		bicicleta2.ajustar();
		bicicleta2.limpar();

		bicicleta3.ajustar();
		bicicleta3.limpar();

		carro1.ajustar();
		carro1.limpar();

		carro2.ajustar();
		carro2.limpar();

		bicicleta1.aumentarMarcha(6);

		bicicleta2.aumentarMarcha(5);

		bicicleta3.aumentarMarcha(4);

		carro1.incrementarVeloc(200);
		carro2.incrementarVeloc(400);

		carro1.trocarOleo();
		carro2.trocarOleo();

		System.out.println(carro1.getCont());
	}
}
