package lista_14_Exceptions_2;

/******************************
 * 2. Implementar a exce��o ExcecaoDivisaoPorZero. Esta exce��o ser� lan�ada
 * pelo m�todo double calcula(double a, double b) da classe Divis�o. Implementar
 * tamb�m a aplica��o AplicacaoDivisao que recebe dois n�meros informados pelo
 * usu�rio e faz a divis�o do primeiro pelo segundo usando uma chamada ao m�todo
 * calcula da classe Divis�o.
 ******************************/

public class ExcecaoDivisaoPorZero extends Exception {
	public ExcecaoDivisaoPorZero(String mensagem) {
		super(mensagem);
	}
}
