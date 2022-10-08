package lista_5_pessoa;

/******************************
 * 1. Escreva as classes como segue abaixo:
 * 
 * a. Uma chamada Pessoa, com atributo nome (tipo String) e sobrenome (tipo
 * string). Cada um desses atributos devem ter m�todos para ler e alterar
 * (getters and setters). A classe Pessoa ainda deve ter um m�todo chamado
 * getNomeCompleto que n�o possui par�metros de entrada e que retorna a
 * concatena��o do atributo nome com o atributo sobrenome. Al�m disto, a classe
 * deve possuir um construtor sem par�metros e um outro construtor que recebe
 * como par�metros o nome e o sobrenome da pessoa e altera respectivamente os
 * atributos nome e sobrenome.
 * 
 * b. Uma subclasse chamada Funcionario. A classe Funcionario deve ter os
 * atributos matricula (tipo int) e sal�rio (tipo double), com seus respectivos
 * m�todos para leitura e altera��o (getters and setters). O Sal�rio de um
 * funcion�rio jamais poder� ser negativo. Todo funcion�rio recebe seu sal�rio
 * em duas parcelas, sendo 60% na primeira e 40% na segunda parcela. Assim,
 * escreva os m�todos getSalarioPrimeiraParcela que retorna o valor da primeira
 * parcela do sal�rio (60%) e getSalarioSegundaParcelaque retorna o valor da
 * segunda parcela do sal�rio (40%).
 * 
 * c. Uma subclasse de Funcion�rio chamada Professor. Todo professor recebe seu
 * sal�rio em uma �nica parcela. Assim, deve-se sobrescrever os m�todos
 * getSal�rioPrimeiraParcela e getSalarioSegundaParcela. O m�todo
 * getSal�rioPrimeiraParcela da classe Professor deve retornar o valor integral
 * do sal�rio do professor e o m�todo getSalarioSegundaParcela deve retornar o
 * valor zero.
 * 
 * d. Crie uma classe UsaPessoa que inst�ncia os seguintes objetos: Passoa
 * 1(Pessoa) nome: Jos� sobrenome: Manoel
 * 
 * Passoa 1(Funcion�rio) nome: Leandro sobrenome: Charles salario: 2000.00
 * 
 * Passoa 1(Professor) nome: Rita sobrenome: Cassia salario: 500.00 Depois
 * execute as seguintes opera��es obedecendo a sequ�ncia das ordens:
 * 
 * e. Exibir a sa�da do m�todo getNomeCompleto para os 3 objetos. f. Exibir a
 * sa�da dos m�todos getSal�rioPrimeiraParcela egetSalarioSegundaParcela para os
 * objetos dos itens pessoa2epessoa3.
 ******************************/

public class Pessoa {
	private String nome;
	private String sobrenome;

	public Pessoa() {
	}

	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return nome + " " + sobrenome;
	}

}
