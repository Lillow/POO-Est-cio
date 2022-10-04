package lista_5_transporte;

/**********************
3. Implemente as classe abaixo:

a. Uma classe Transporte com atributo ligado (tipo boolean) e velocidade (tipo 
int) e m�todos liga e desliga. O M�todo liga torna o atributo ligado true e o 
m�todo desliga torna o atributo ligado false, al�m de tornar velocidade zero. 
Crie tamb�m m�todos getters and setters para modificar o atributo velocidade, 
sendo que a velocidade n�o pode ser negativa.

b. Uma subclasse de Transporte chamada Carro. Carro de ter o atributo 
quilometragem (tipo int) e os m�todos necess�rios para ler e gravar (getters
and setters). A quilometragem n�o pode ser negativa, nem ultrapassar o valor 
de 999999. A velocidade do Carro pode ser negativa, nem ultrapassar 200.
**********************/

public class Transporte {
	private boolean ligado;
	private int velocidade;
	
	public void liga() {
		ligado = true;
	}
	
	public void desliga() {
		ligado = false;
		velocidade = 0;
	}
	
	public boolean getLigado() {
		return this.ligado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		if (velocidade >= 0) {			
			this.velocidade = velocidade;
		}
		
		else {
			System.out.println("Valor de velocidade inv�lido");
		}
	}
	
	
}
