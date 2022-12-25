package lista_10_Classes_Abstratas_Interfaces_1;

/******************************
 * 1. Crie uma classe abstrata OperacaoMatematica. Esta classe deve implementar
 * as opera��es b�sicas (soma, subtra��o, divis�o e multiplica��o). Crie um
 * m�todo abstrato calcular com dois argumentos double. Crie uma classe Soma que
 * herde da classe abstrata OperacaoMatematica e gere um m�todo que retorne a
 * soma dos dois n�meros. Crie uma classe Subtracao que herde da classe abstrata
 * OperacaoMatematica e gere um m�todo que retorne a sutra��o dos n�meros. Por
 * fim crie uma classe Contas que tenha um m�todo est�tico mostrarCalculo que
 * tenha como par�metro um objeto do tipo Opera��oMatem�tica al�m dos dosi
 * n�mesos. Imprima o do c�lculo. Para demonstrar o polimorfismo, crie uma
 * chamada atrav�s do m�todo mostrarCalculo instanciando um objeto soma() e
 * passado dois parametros. Seguindo o item anterior, crie uma outra chamada ao
 * m�todo s� que ser� a subtra��o.
 ******************************/

public abstract class OperacaoMatematica {
	public abstract double calcular(double num1, double num2);
}
