import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // teste01();;
        //teste02();
       // teste03();
         //prova1();
        teste04();
    }

//    public static void teste01() {
//        // Criação do primeiro objeto de pessoa
//        Pessoa pessoa1 = new Pessoa(
//                "Gervásio Gomes Garcia",
//                54,
//                "123.456.789-01",
//                "gervasio.garcia@empresa.com.br",
//                "(16) 98765-4321"
//        );
//
//        // Atribuindo valores aos atributos
////        pessoa1.nome = "Gervásio Gomes Garcia";
////        pessoa1.idade = 54;
////        pessoa1.cpf = "123.456.789-01";
////        pessoa1.email = "gervasio.garcia@empresa.com.br";
////        pessoa1.telefone = "(16) 98765-4321";
//
//        // Chamando o método para exibir os dados da pessoa 1
//        System.out.println(pessoa1.exibirDados());
//
//        System.out.println("-".repeat(80));  // Traço separador
//
//        pessoa1.fazerAniversario();
//
//        // Chamando a apresentação da pessoa, que reflete a nova idade
//        pessoa1.apresentar();
//
//        System.out.println("-".repeat(80));  // Traço separador
//
//        // Atualizando o e-mail
//        pessoa1.atualizarEmail("ggarcia@outlook.com");
//
//        System.out.println("-".repeat(80));  // Traço separador
//
//        // Exibindo novamente os dados para conferir as alterações feitas
//        System.out.println(pessoa1.exibirDados());
//
//        // Alterando novamente o e-mail por meio de manipulação direta
//        // do valor do atributo
//        pessoa1.email = "garcia.gervasio@bol.com.br";
//
//        System.out.println("-".repeat(80));  // Traço separador
//
//        // Exibindo novamente os dados para conferir as alterações feitas
//        System.out.println(pessoa1.exibirDados());
//
//        System.out.println("*".repeat(80));
//
//        // Vamos criar o primeiro objeto da classe Funcionario
//        Funcionario func1 = new Funcionario(
//                "Veneranda Vieira",
//                26,
//                "987.654.321-09",
//                "veneranda@empresa.com.br",
//                "(36) 91234-5678",
//                "F0123",
//                "Assistente Financeiro",
//                3500.00,
//                "Gerência Financeira"
//        );
//
//        // Dando valor aos atributos do funcionário
//        // (inclui atributos herdados de Pessoa)
//        func1.nome = "Veneranda Vieira";
//        func1.idade = 26;
//        func1.cpf = "987.654.321-09";
//        func1.email = "veneranda@empresa.com.br";
//        func1.telefone = "(36) 91234-5678";
//        //----//
//        func1.matricula = "F0123";
//        func1.cargo = "Assistente Financeiro";
//        func1.salarioBase = 3500.00;
//        func1.departamento = "Gerência Financeira";
//        func1.dataAdmissao = new Date();
//
//        // Exibindo os dados do funcionário
//        System.out.println(func1.exibirDados());
//
//        System.out.println("-".repeat(80));
//
//        func1.fazerAniversario();
//
//        // Exibindo os dados novamente para verificar mudança de idade
//        System.out.println(func1.exibirDados());
//
//        System.out.println("-".repeat(80));
//
//        // Calculando o salário de Veneranda
//        Double salarioFinal = func1.calcularSalario();
//        System.out.println("O salário final de Veneranda é R$ " + salarioFinal);
//    }
//
//    public static void teste02() {
//
//        System.out.println("%".repeat(80));
//
//        Pessoa p = new Pessoa();
//        System.out.println("Exibindo dados de uma pessoa...");
//        System.out.println(p.exibirDados());
//
//        Funcionario f = new Funcionario();
//        System.out.println("Exibindo dados de um funcionário...");
//        System.out.println(f.exibirDados());
//    }
//    public static void teste03(){
//        // Criando três contas bancárias;
//        ContaBancaria conta1 = new ContaBancaria("Lissa", 1000.0);
//        ContaBancaria conta2 = new ContaBancaria("Jimin", 2000.0);
//        ContaBancaria conta3 = new ContaBancaria("Austin", 5000.0);
//
//        // Operações na conta 1;
//        conta1.depositar(200.0);
//        conta1.sacar(150.0);
//
//        // Operações na conta 2;
//        conta2.depositar(300.0);
//        conta2.sacar(100.0);
//
//        // Operações na conta 3;
//        conta3.sacar(500.0);
//        conta3.depositar(1000.0);
//
//        // Exibindo saldo final de cada conta;
//        System.out.println("\n--- Conta 1 ---");
//        conta1.exibirSaldo();
//
//        System.out.println("\n--- Conta 2 ---");
//        conta2.exibirSaldo();
//
//        System.out.println("\n--- Conta 3---");
//        conta3.exibirSaldo();
//
//        //criando contas especiais;
//        ContaEspecial contaE1  = new ContaEspecial("Damon",1000.0, 500.0);
//        ContaEspecial contaE2 = new ContaEspecial("Taeyhung",2000.0, 500.0);
//        ContaEspecial contaE3 = new ContaEspecial("Ally",5000.0, 450.0);
//        //operações da conta1;
//        contaE1.depositar(200.0);
//        contaE1.sacar(100.0);
//        //operações da conta2;
//        contaE2.depositar(250.0);
//        contaE2.sacar(100.0);
//        //operações da conta3;
//        contaE3.depositar(300.0);
//        contaE3.sacar(160.0);
//
//        //Exibir resultados;
//        System.out.println("\n--- Conta Especial 1 ---");
//        contaE1.exibirSaldoReal();
//        contaE1.exibirSaldo();
//
//
//        System.out.println("\n--- Conta Especial 2 ---");
//        contaE2.exibirSaldoReal();
//        contaE2.exibirSaldo();
//
//        System.out.println("\n--- Conta Especial 3 ---");
//        contaE3.exibirSaldoReal();
//        contaE3.exibirSaldo();
//    }
//}
//public static void prova1(){
//    //Criação dos estudantes
//    //Estudante 1
//    Estudante e1 = new Estudante("Austin Moon", 22, "111.222.333-44","austin@email.com", "(16) 99111-1111", "Engenharia Civil");
//    e1.notaPrimeiroBimestre = 7.0;
//    e1.notaSegundoBimestre = 5.0;
//    //Estudante 2
//    Estudante e2 = new Estudante("Larissa Silva", 20, "222.333.444-55", "larija@email.com", "(16) 99222-2222", "Administração");
//    e2.notaPrimeiroBimestre = 9.0;
//    e2.notaSegundoBimestre = 8.0;
//    //Estudante 3
//    Estudante e3 = new Estudante("Ally Dolson", 24, "333.444.555-66", "ally@email.com", "(16) 99333-3333", "Direito");
//    e3.notaPrimeiroBimestre = 3.0;
//    e3.notaSegundoBimestre = 5.0;
//    //Estudante 4
//    Estudante e4= new Estudante("Rafaela Lissa Maciel Da Silva", 20,"444.666.777.99","rafaela@email.com",
//            "(16) 99345-4566", "Analise e Desenvolvimento de Sistemas");
//    e4.notaPrimeiroBimestre = 9.0;
//    e4.notaSegundoBimestre = 7.5;
//
//    // Exibindo os dados dos estudantes
//    System.out.println("\n--- Estudante 1 ---");
//    System.out.println(e1.exibirDados());
//    System.out.println("\n--- Estudante 2 ---");
//    System.out.println(e2.exibirDados());
//    System.out.println("\n--- Estudante 3 ---");
//    System.out.println(e3.exibirDados());
//    System.out.println("\n--- Estudante 4 ---");
//    System.out.println(e4.exibirDados());
//  }
//}
//public static void teste04() {
//    ContaBancaria c1 = new ContaBancaria("Zeferino Zacarias", 500.00);
//    c1.exibirSaldo();
//
//    c1.sacar(350.00);
//    c1.exibirSaldo();
//
//    // Atributo "saldo" foi privatizado
//    // Mudanças no saldo agora só podem ser feitas por meio dos
//    // métodos depositar() e sacar()
//    //c1.saldo = -100.00;
//    //c1.exibirSaldo();
//
//    c1.depositar(200.00);
//    c1.exibirSaldo();
//
//    ContaBancaria c2 = new ContaBancaria("Yuri Yamashita", -850.00);
//    c2.exibirSaldo();
//}
//}
public static void teste04() {
    ContaBancaria c1 = new ContaBancaria(987, "Zeferino Zacarias", 500.00);
    c1.exibirSaldo();

    c1.sacar(350.00);
    c1.exibirSaldo();

    // Atributo "saldo" foi privatizado
    // Mudanças no saldo agora só podem ser feitas por meio dos
    // métodos depositar() e sacar()
    //c1.saldo = -100.00;
    //c1.exibirSaldo();

    c1.depositar(200.00);
    c1.exibirSaldo();

    ContaBancaria c2 = new ContaBancaria(654, "Yuri Yamashita", 850.00);
    c2.exibirSaldo();

    c2.setNumConta(40);
    System.out.println("Conta de %s agora tem o número %d.".formatted(c2.titular, c2.getNumConta()));
    System.out.println("Conta de %s agora tem o número %d.".formatted(c2.getTitular(), c2.getNumConta()));
}
}