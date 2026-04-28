//import java.util.Date;
//
//public class Funcionario extends Pessoa {
//    /*
//        taxaComissão é um ATRIBUTO DE CLASSE
//        O valor de um atributo de classe é COMPARTILHADO por todos os objetos
//        criados a partir da classe que a definiu.A declaração de atributos de classe é caracterizada
//        pelo uso da palavra-chave "static".
//    */
//    public static Double taxaComissao = 10.0;
//    // Atributos
//    public String matricula;
//    public String cargo;
//    public Double salarioBase;
//    public String departamento;
//    public Date dataAdmissao;
//
//    //MÉTODO CONSTRUTOR PERSONALIZADO
//    public Funcionario(
//            String nome,
//            Integer idade,
//            String cpf,
//            String email,
//            String telefone,
//            String matricula,
//            String cargo,
//            Double salarioBase,
//            String departamento
//    ) {
//        // chamando o construtor da classe pai
//        super(nome, idade, cpf, email, telefone);
//
//        //Armmazenando o valor dos atibutos particulares da classe Funcionario
//        this.matricula = matricula;
//        this.cargo = cargo;
//        this.salarioBase = salarioBase;
//        this.departamento = departamento;
//        this.dataAdmissao = new Date();
//    }
//
//    // Métodos
//    public Double calcularSalario() {
//        return this.salarioBase * (1 + (taxaComissao / 100));
//    }
//    public void aumentarSalarioBase(Double percentual) {
//        if(percentual == null || percentual <= 0) {
//            throw new IllegalArgumentException("O percentual de aumento deve ser positivo.");
//        }
//        this.salarioBase = this.salarioBase * (1 + (percentual / 100));
//        System.out.println("Salário base atualizado para R$ " + this.salarioBase);
//    }
//    public void registrarPonto() {
//        System.out.println("Ponto registrado para " + this.nome +
//                "\nMatrícula: " + this.matricula +
//                "\nData/hora:" + new Date()
//        );
//    }
//    @Override
//    public String exibirDados() {
//        /*
//            A palavra-chave "super" é uma referência á classe-base
//            (pessoa) da classe atual(Funcionário).
//            Em vez de reescrever o método exibirDados() do zero, chamamos a versão
//            do método implementado na classe Pessoa, usando a referência "super"(super.exibirDados();)
//            e, em seguida, apenas completamos com as informações que
//            são particulares de Funcionário.
//            Quando uma classe redefine(reescreve) um método de uma a
//        */
//        String dadosPessoa = super.exibirDados();
//        return dadosPessoa +
//                "\nMatricula: " + this.matricula +
//                "\nCargo: " + this.cargo +
//                "\nSalário base: R$ " + this.salarioBase +
//                "\nDepartamento: " + this.departamento +
//                "\nData de admissão: " + this.dataAdmissao;
//    }
//}
import java.util.Date;

public class Funcionario extends Pessoa {

    /*
        taxaComissao é um ATRIBUTO DE CLASSE.
        O valor de um atributo de classe é COMPARTILHADO por
        todos os objetos criados a partir da classe que o definiu.
        A declaração de atributos de classe é caracterizada pelo
        uso da palavra-chave "static".
    */
    public static Double taxaComissao = 10.0;
    public static Double salarioMinimo = 1621.0;

    // Atributos
    public String matricula;
    public String cargo;
    public Double salarioBase;
    public String departamento;
    public Date dataAdmissao;
    private String matricula;
    private String cargo;
    private Double salarioBase;
    private String departamento;
    private Date dataAdmissao;

    // MÉTODO CONSTRUTOR PERSONALIZADO
    public Funcionario(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone,
            String matricula,
            String cargo,
            Double salarioBase,
            String departamento
    ) {
        // Chamando o construtor da classe pai
        super(nome, idade, cpf, email, telefone);

        // Armazenando o valor dos atributos particulares da classe Funcionario
        //this.matricula = matricula;
        //this.cargo = cargo;
        //this.salarioBase = salarioBase;
        //this.departamento = departamento;
        //this.dataAdmissao = new Date();
        this.setMatricula(matricula);
        this.setCargo(cargo);
        this.setSalarioBase(salarioBase);
        this.setDepartamento(departamento);
        this.setDataAdmissao(new Date());
    }

    // Getters e setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if(matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("O código de matrícula deve ser informado.");
        }
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if(cargo.trim().length() < 3) {
            throw new IllegalArgumentException("O cargo deve ter, pelo menos, 3 caracteres.");
        }
        this.cargo = cargo;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        if(salarioBase < salarioMinimo) {
            throw new IllegalArgumentException("O salário base não pode ser menor que o salário mínimo, que atualmente é de R$ " + salarioMinimo);
        }
        this.salarioBase = salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if(departamento.trim().length() < 3) {
            throw new IllegalArgumentException("O nome do departamento deve ter, pelo menos, 3 caracteres.");
        }
        this.departamento = departamento;
        this.dataAdmissao = new Date();
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        if(dataAdmissao.after(new Date())) {
            throw new IllegalArgumentException("A data de admissão não pode estar no futuro.");
        }
        this.dataAdmissao = dataAdmissao;
    }

    // Métodos
    public Double calcularSalario() {
        return this.salarioBase * (1 + (taxaComissao / 100));
        return this.getSalarioBase() * (1 + (taxaComissao / 100));
    }

    public void aumentarSalarioBase(Double percentual) {
        if(percentual == null || percentual <= 0) {
            throw new IllegalArgumentException("O percentual de aumento deve ser positivo.");
        }
        this.salarioBase = this.salarioBase * (1 + (percentual / 100));
        System.out.println("Salário base atualizado para R$ " + this.salarioBase);
        //this.salarioBase = this.salarioBase * (1 + (percentual / 100));
        this.setSalarioBase(this.getSalarioBase() * (1 + (percentual / 100)));
        System.out.println("Salário base atualizado para R$ " + this.getSalarioBase());
    }

    public void registrarPonto() {
        System.out.println("Ponto registrado para " + this.nome +
                "\nMatrícula: " + this.matricula +
                System.out.println("Ponto registrado para " + this.getNome() +
                        "\nMatrícula: " + this.getMatricula() +
                        "\nData/hora:" + new Date()
                );
    }

    @Override
    public String exibirDados() {

        /*
            A palavra-chave "super" é uma referência à classe-base
            (Pessoa) da classe atual (Funcionário).

            Em vez de reescrever o método exibirDados() do zero,
            chamamos a versão do método implementada na classe
            Pessoa, usando a referência "super" (super.exibirDados();)
            e, em seguida, apenas completamos com as informações que
            são particulares de Funcionario.

            Quando uma classe redefine (reescreve) um método de sua
            classe-base, como nesse caso, a versão reescrita na classe
            derivada deve ser marcada com @Override.
        */
        String dadosPessoa = super.exibirDados();
        return dadosPessoa +
                "\nMatricula: " + this.matricula +
                "\nCargo: " + this.cargo +
                "\nSalário base: R$ " + this.salarioBase +
                "\nDepartamento: " + this.departamento +
                "\nData de admissão: " + this.dataAdmissao;
        "\nMatricula: " + this.getMatricula() +
                "\nCargo: " + this.getCargo() +
                "\nSalário base: R$ " + this.getSalarioBase() +
                "\nDepartamento: " + this.getDepartamento() +
                "\nData de admissão: " + this.getDataAdmissao();
    }
}