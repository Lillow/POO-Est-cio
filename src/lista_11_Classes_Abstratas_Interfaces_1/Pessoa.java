package lista_11_Classes_Abstratas_Interfaces_1;

/******************************
 * 1. Considerando o diagrama abaixo, realize as devidas implementa��es
 * considerando que Pessoa, PessoaF�sica e Funcion�rio s�o classes abstratas e
 * todos seus m�todos s�o abstratos:
 ******************************/

public abstract class Pessoa {
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;

	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
