package lista_4_questao_2_ingresso;

/*********************
 * 2. Criar uma classe chamada Ingresso que possui um valor em reais e um m�todo
 * imprimeValor(). Criar uma classe VIP,que herda Ingresso e possui um valor
 * adicional. Criar um m�todo que retorne o valor do ingresso VIP(com o
 * adicional inclu�do). Criar uma classe Normal,que herda Ingresso e possui um
 * m�todo que imprime:"Ingresso Normal" Criar uma classe CamaroteInferior(que
 * possui a localiza��o do ingresso e m�todos para acessar e imprimir esta
 * localiza��o)e uma classe CamaroteSuperior,que � mais cara(possui um valor
 * adicional).Esta classe ainda possui um m�todo para retornar o valor do
 * ingresso.Ambas as classes herdam a classe VIP. Criar uma classe
 * ComprarIngresso como sendo a principal. Nesta classe,criar o m�todo
 * main()onde:Crie um ingresso.Pe�a para o usu�rio digitar 1 para normal e 2
 * para VIP.Conforme a escolha do usu�rio,diga se o ingresso � do tipo normal ou
 * VIP.Se for VIP,pe�a para ele digitar 1 para camarote superior e 2 para
 * camarote inferior.Conforme a escolha do usu�rio,reporte se a escolha VIP �
 * camarote superior ou inferior.Imprima o valor do ingresso.
 *********************/

public abstract class Ingresso {
	private float valor;

	public Ingresso(float valor) {
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void imprimeValor() {
		System.out.printf("R$ %.2f", valor);
	}

	public abstract void tipoIngresso();

	public abstract void imprimeAdicional();

}
