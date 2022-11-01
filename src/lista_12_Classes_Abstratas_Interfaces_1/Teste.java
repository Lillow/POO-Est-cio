package lista_12_Classes_Abstratas_Interfaces_1;

public class Teste {

	public static void main(String[] args) {
		Aviao aviao = new Aviao();

		aviao.setNome("Avi�o");
		aviao.setNumeroPassageiro(80);
		aviao.ligarMotor();
		aviao.setVelocidadeAtual(200);
		aviao.setAltitudeAtual(250);
		aviao.setNumeroMotores(4);
		aviao.subir(20);
		aviao.descer(60);
		aviao.curvar(20);
		aviao.abastecer(60);

		System.out.println(aviao.getNome());
		System.out.println("NumeroPassageiro: " + aviao.getNumeroPassageiro());
		System.out.println("Velocidade Atual: " + aviao.getVelocidadeAtual());
		System.out.println("Altitude Atual: " + aviao.getAltitudeAtual());
		System.out.println("Est� Parado: " + aviao.estaParado());
		System.out.println();

		Balao balao = new Balao();

		balao.setNome("Bal�o");
		balao.setNumeroPassageiro(4);
		balao.setVelocidadeAtual(50);
		balao.setAltitudeAtual(90);
		balao.aquecerAr(5);
		balao.largarPeso(6);
		balao.subir(10);
		balao.descer(20);

		System.out.println(balao.getNome());
		System.out.println("NumeroPassageiro: " + balao.getNumeroPassageiro());
		System.out.println("Velocidade Atual: " + balao.getVelocidadeAtual());
		System.out.println("Altitude Atual: " + balao.getAltitudeAtual());
		System.out.println("Est� Parado: " + balao.estaParado());
		System.out.println("Peso largado" + balao.getPesoLargard());
		System.out.println();

		Carro carro = new Carro();

		carro.setNome("Carro");
		carro.setNumeroPassageiro(5);
		carro.setVelocidadeAtual(0);
		carro.setTipo("asdf");
		carro.estacionar();
		carro.abastecer(20);
		carro.ligarMotor();
		carro.embreiar();

		System.out.println(carro.getNome());
		System.out.println("NumeroPassageiro: " + carro.getNumeroPassageiro());
		System.out.println("Velocidade Atual: " + carro.getVelocidadeAtual());
		System.out.println("Est� Parado: " + carro.estaParado());
		System.out.println();

		Bicicleta bicicleta = new Bicicleta();

		bicicleta.setNome("Bicicleta");
		bicicleta.setNumeroPassageiro(1);
		bicicleta.setVelocidadeAtual(5);
		bicicleta.setTipo("asdf");
		bicicleta.pedalar();
		bicicleta.pedalar();
		bicicleta.pedalar();

		System.out.println(bicicleta.getNome());
		System.out.println("NumeroPassageiro: " + bicicleta.getNumeroPassageiro());
		System.out.println("Velocidade Atual: " + bicicleta.getVelocidadeAtual());
		System.out.println("Est� Parado: " + bicicleta.estaParado());
		System.out.println();

	}

}
