package lista_05_Heranca_1;

public class UsaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Jos�", "Manoel");
		Funcionario funcionario1 = new Funcionario("Leandro", "Charles", 2000);
		Professor professor1 = new Professor("Rita", "Cassia", 500);
		
		System.out.printf("\t%s\n%d\t%s\tR$:%.2f\tR$:%.2f\n%d\t%s\tR$:%.2f\tR$:%.2f", pessoa1.getNomeCompleto(),funcionario1.getMatricula(), funcionario1.getNomeCompleto(), funcionario1.getSalarioPrimeiraParcela(),funcionario1.getSalarioSegundaParcela(), professor1.getMatricula(), professor1.getNomeCompleto(), professor1.getSalarioPrimeiraParcela(), professor1.getSalarioSegundaParcela());
		
		
	}
}
