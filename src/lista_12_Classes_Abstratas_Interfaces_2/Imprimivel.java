package lista_12_Classes_Abstratas_Interfaces_2;

/******************************
 * 2. Criar um programa que contemple interfaces e classes abstratas al�m de
 * outras classes como segue o roteiro abaixo:
 * 
 * a. Crie uma interface p�blica de nome Imprimivel, em um pacote a sua escolha.
 * Defina duas constantes de classe: IMPRIME_NOME_DA_EMPRESA com valor true e
 * NAO_IMPRIME_NOME_DA_EMPRESA com valor false. Defina tamb�m um m�todo p�blico
 * e abstrato que n�o retorne valor chamado imprime e que receba um par�metro do
 * tipo boolean.
 * 
 * b. Crie uma classe abstrata de nome Modelo, no mesmo pacote. Essa classe deve
 * definir uma vari�vel de inst�ncia nomeDaEmpresa, privada com m�todos get e
 * set p�blicos, um m�todo toString abstrato e um construtor que receba como
 * par�metro o nome da empresa e inicialize a vari�vel de inst�ncia equivalente.
 * 
 * c. Crie uma classe LinguagemDeProgramacao que estenda Modelo e implemente
 * Imprimivel. Essa classe deve definir uma vari�vel de inst�ncia
 * nomeDaLinguagem privada e seus m�todos get e set p�blicos. Deve definir
 * tamb�m um construtor que acione o construtor da superclasse e inicialize a
 * vari�vel de inst�ncia criada na classe. Por �ltimo, deve ser implementado o
 * m�todo imprime que condicionar� a impress�o do nome da empresa ao valor do
 * argumento recebido com par�metro.
 * 
 * d. Crie uma classe Testa API que instancia objetos da classe
 * LinguagemDeProgramacao, usando diferentes tipos de refer�ncia, atribui
 * valores a suas vari�veis de inst�ncia e imprime os objetos, usando o m�todo
 * imprime.
 ******************************/

public interface Imprimivel {
	final boolean IMPRIME_NOME_DA_EMPRESA = true;
	final boolean NAO_IMPRIME_NOME_DA_EMPRESA = false;

	public void imprime(boolean a);

}
