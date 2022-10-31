package lista_02_questao_2_retangulo;

/*********************
2. Escreva um programa em java que calcule a �rea e o per�metro de um ret�ngulo 
utilizando o encapsulamento. Para isto, crie uma classe Ret�ngulo com os atributos 
privados altura e largura. Nesta classe ter� os m�todos que calculam a �rea (altura * 
largura) e o per�metro (altura * 2) + (largura * 2). Em outra classe Ret�nguloTeste, 
Instancie um objeto da classe Ret�ngulo e passe os valores da altura e largura como 
par�metro para os m�todos criados. Por fim, imprima a �rea e o per�metro do ret�ngulo 
nesta segunda classe.
*********************/

public class Retangulo {
	private double heith;
	private double width;

	public Retangulo(double heith, double width) {
		this.heith = heith;
		this.width = width;
	}

	public double getHeith() {
		return heith;
	}

	public void setHeith(double heith) {
		this.heith = heith;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area() {
		double a = heith * width;
		return a;
	}
	
	public double perimeter() {
		double a = (heith * 2) + (width * 2);
		return a;
	}

}
