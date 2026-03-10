public class Main {
    public static void main(String[] args) {
        // Criação do primeiro objeto de pessoa
        Pessoa pessoa1 = new Pessoa();
        // Atribuindo valores aos atributos
        pessoa1.nome = "Gervásio Gomes Garcia";
        pessoa1.idade = 54;
        pessoa1.cpf = "123.456.789-01";
        pessoa1.email = "gervasio.garcia@empresa.com.br";
        pessoa1.telefone = "(16) 98765-4321";
        // Chamando o método para exibir os dados da pessoa 1
        System.out.println(pessoa1.exibirDados());
        System.out.println("-".repeat(80));  // Traço separador
        pessoa1.fazerAniversario();
        // Chamando a apresentação da pessoa, que reflete a nova idade
        pessoa1.apresentar();
        System.out.println("-".repeat(80));  // Traço separador
        // Atualizando o e-mail
        pessoa1.atualizarEmail("ggarcia@outlook.com");
        System.out.println("-".repeat(80));  // Traço separador
        // Exibindo novamente os dados para conferir as alterações feitas
        System.out.println(pessoa1.exibirDados());
        // Alterando novamente o e-mail por meio de manipulação direta
        // do valor do atributo
        pessoa1.email = "garcia.gervasio@bol.com.br";
        System.out.println("-".repeat(80));  // Traço separador
        // Exibindo novamente os dados para conferir as alterações feitas
        System.out.println(pessoa1.exibirDados());
    }
}

