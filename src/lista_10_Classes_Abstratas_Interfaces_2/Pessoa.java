package lista_10_Classes_Abstratas_Interfaces_2;

/******************************
 * 2. Criar uma classe abstrata Pessoa que tenha um atributo privado nome, um
 * construtor p�blico para a classe, um m�todo get para o atributo e um m�todo
 * abstrato getDescricao. Criar uma classe Empregado que herde da classe
 * abstrata Pessoa. Esta classe ter� o atributo nome da superclasse e um
 * atributo sal�rio como privado desta classe. Os m�todos getSalario que
 * retornar� o sal�rio e o m�todo getDescricao que retornar� o nome e o sal�rio
 * do empregado. Ter� tamb�m um m�todo atualizaSalario com um argumento do tipo
 * double �porPercentual� que far� o ajuste: sal�rio * porPercentual/100 e
 * atualizar� o sal�rio. Criar uma classe Estudante que herda da classe abstrata
 * Pessoa. Esta classe classe passa o nomo para o construtor da superclassse e
 * tem um atributo privado do tipo String para a �rea de estudo. Ter� um m�todo
 * getDescricao que retorna o nome do estudante e a �rea de estudo. Por fim,
 * criar um classe PessoaTeste para testar a classe Pessoa. Instanciando o
 * objeto pessoa como um array de duas posi��es. Preenchendo o array de pessoa
 * com objetos Estudante e Empregado. Em seguida imprimir os nomes e descri��es
 * de todos os objetos Pessoa. Obs. Para a o objeto Pessoa trazer os dados dos
 * empregados, vir� (nome e sal�rio), para os dados dos estudante, vir� (nome e
 * �rea de estudo).
 * 
 ******************************/
public abstract class Pessoa {
	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public abstract String getDescricao();
}
