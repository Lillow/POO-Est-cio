package lista_03_Construtores_e_Modificadores_de_Acesso_4;

/********************
4) Desenvolva um programa para um setor de vendas e uma empresa onde ser� gerado 
um objeto Pedidos que ter� as seguintes caracter�sticas: n�mero, data, cliente valor;
O atributo n�mero ser� um atributo est�tico da classe para gerar um n�mero 
incremental �nico para todos os pedidos gerado sempre que necess�rio.
Para testar, gere 3 pedidos onde o n�mero inicie do 1 e v� at� o n�mero 3.
********************/

import java.util.Date;

public class Empresa {
	private static int cont;
	private int numero;
	private String data;
	private String cliente;
	private double valor;
	
	public Empresa(String data, String cliente, double valor) {
		cont ++;
		this.data = data;
		this.cliente = cliente;
		this.valor = valor;
		numero = cont;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	public String toString() {
		return "Vendas [" + numero + " data=" + data + ", cliente=" + cliente + ", valor=" + valor + "]";
	}
}
