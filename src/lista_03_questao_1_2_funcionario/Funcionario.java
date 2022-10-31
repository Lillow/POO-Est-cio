package lista_03_questao_1_2_funcionario;

/*********************
1. Desenvolva um programa para uma empresa, que pretende controlar quantos 
funcion�rios existem na empresa. (matr�cula, nome, idade, sal�rio). A matr�cula seria o 
atributo est�tico da classe para gerar um n�mero incremental sempre que um novo 
funcion�rio for cadastrado.

2. Aprimore o programa da quest�o 1, atribuindo um setor de trabalho para cada 
funcion�rio. O setor seria composto por um c�digo e um nome. Ent�o cada funcion�rio 
passaria a ter um objeto do setor ao qual ele fosse alocado. 
Premissas da classe Setor: Al�m do c�digo e do nome, a classe Setor teria um atributo 
est�tico para realizar uma contagem de setores criados; O atributo est�tico ao ser 
incrementado, repassaria este valor para o atributo c�digo que n�o � est�tico a fim de 
guardar o valor que foi incrementado. Neste momento tamb�m se deve receber o nome 
do Setor e guardar no atributo nome do setor. Por fim, ao imprimir os dados do 
funcion�rio, tamb�m se deve imprimir o c�digo e o nome do setor em que o funcion�rio 
foi alocado, exatamente como segue abaixo:
*********************/

public class Funcionario {
	private int matricula;
	private String nome;
	private int idade;
	private double salario;
	private String setor = "";
	private static int cont = 0;
	private static String setores[] = {"1-Administra��o","2-Contabilidade","3-T.I."};

	public Funcionario(String nome, int idade, double salario, int i) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.setor = setores[i -1];
		cont ++;
		matricula = cont;
	}

	public int getMatricula() {
		return matricula;
	}



	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}



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



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public String getSetor() {
		return setor;
	}



	public void setSetor(int i) {
		this.setor = setores[i -1];
	}



	@Override
	public String toString() {
		return "[Matricula= " + matricula + " Nome= " + nome + ", Idade= " + idade + ", Salario= " + salario + " Setor= " + setor + "]";
	}
}
