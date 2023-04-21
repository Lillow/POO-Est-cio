package lista_01_Revis�o_Programa��o_Estruturada;

/***********************************************
Fazer um programa que cria uma estrutura de tabela de pre�o de produtos contendo os elementos, 
c�digo do produto, nome do produto, pre�o do produto, desconto do produto. Em seguida criar uma 
vari�vel desta estrutura que ser� um Array de 5 elementos. Ap�s isto, alimente esta estrutura de 
registro com os dados de acordo com cada atributo. Ao final fa�a uma leitura dos valores desta 
estrutura e imprima a m�dia de todos os pre�os.
***********************************************/
Public class Q_27_Tabela_Preco_Produtos{
	public static void main(String[] args) {
        // criar uma matriz de 5 elementos para armazenar a tabela de pre�o
        String[][] tabela = new String[5][4];
        
        // preencher a tabela de pre�o com os dados de cada produto
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tabela.length; i++) {
            System.out.println("Digite o c�digo do produto " + (i+1) + ": ");
            tabela[i][0] = sc.nextLine();
            System.out.println("Digite o nome do produto " + (i+1) + ": ");
            tabela[i][1] = sc.nextLine();
            System.out.println("Digite o pre�o do produto " + (i+1) + ": ");
            tabela[i][2] = sc.nextLine();
            System.out.println("Digite o desconto do produto " + (i+1) + ": ");
            tabela[i][3] = sc.nextLine();
        }
        
        // calcular a m�dia dos pre�os dos produtos
        double somaPreco = 0;
        for (int i = 0; i < tabela.length; i++) {
            double preco = Double.parseDouble(tabela[i][2]);
            somaPreco += preco;
        }
        double mediaPreco = somaPreco / tabela.length;
        
        // imprimir a tabela de pre�o e a m�dia dos pre�os dos produtos
        System.out.println("\nC�digo\tNome\tPre�o\tDesconto");
        for (int i = 0; i < tabela.length; i++) {
            System.out.println(tabela[i][0] + "\t" + tabela[i][1] + "\t" + tabela[i][2] + "\t" + tabela[i][3]);
        }
        System.out.println("\nA m�dia dos pre�os dos produtos �: " + mediaPreco);
    }
}