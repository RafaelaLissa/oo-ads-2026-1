//public class Pessoa {
//    //Atributos
//    public String nome;
//    public Integer idade;
//    public String cpf;
//    public String email;
//    public String telefone;
//    /*
//    MÉTODO CONSTRUTOR
//    o método construtor é sempre chamado quando se cria um novo objeto a partir da classe
//    Nele, podemos exigir que deterinados valores sejam informados para que a existência do objeto seja possivel
//    O método construtor SEMPRE tem o MESMO NOME DA CLASSE
//    */
//    public Pessoa(
//            String nome,
//            Integer idade,
//            String cpf,
//            String email,
//            String telefone
//    ){
//        this.nome = nome;
//        this.idade = idade;
//        this.cpf = cpf;
//        this.email = email;
//        this.telefone = telefone;
//    }
//    //Métodos
//    public void apresentar(){
//        System.out.println("Olá meu nome é "+ nome + "e tenho" + idade + "anos.");
//    }
//    public void fazerAniversario(){
//        this.idade++; //Incremento a idade
//        System.out.println("Feliz Aniversário," + nome + "! Agora você tem" + idade + "anos");
//    }
//    public void atualizarEmail(String novoEmail){
//        this.email = novoEmail;
//        System.out.println("Email atualizado para: " + this.email);
//    }
//    public String exibirDados(){
//        //\n significa quebra de linha
//        return "Nome:" + this.nome +
//                "\nIdade:" + this.idade +
//                "\nCpf:" + this.cpf +
//                "\nE-mail:" + this.email +
//                "\nTelefone:" + this.telefone;
//    }
//}
public class Pessoa {

    // Atributos
    public String nome;
    public Integer idade;
    public String cpf;
    public String email;
    public String telefone;
    private String nome;
    private Integer idade;
    private String cpf;
    private String email;
    private String telefone;

    /*
        MÉTODO CONSTRUTOR
        O método construtor é sempre chamado quando se cria um novo objeto
        a partir da classe.
        Nele, podemos exigir que determinados valores sejam informados para
        que a existência do objeto seja possível.
        O método construtor SEMPRE tem o MESMO NOME DA CLASSE.
    */
    public Pessoa(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone
    ) {
        //this.nome = nome;
        //this.idade = idade;
        //this.cpf = cpf;
        //this.email = email;
        //this.telefone = telefone;

        // No construtor, deve-se usar sempre os setters,
        // jamais a atribuição direta
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().length() < 5 || !(nome.trim().contains(" "))) {
            throw new IllegalArgumentException("O nome deve ter, no mínimo, 5 caracteres e 2 palavras.");
        }
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if(idade < 0 || idade > 125) {
            throw new IllegalArgumentException("A idade deve estar entre 0 e 125.");
        }
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // EXISTE UMA VALIDAÇÃO ESPECIAL PARA O CPF
        if(cpf.trim().length() < 11) {
            throw new IllegalArgumentException("O número do CPF deve ter, no mínimo, 11 caracteres.");
        }
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // EXISTE VALIDAÇÃO ESPECIAL PARA E-MAIL
        if(! email.contains("@")) {
            throw new IllegalArgumentException("Endereço de e-mail inválido.");
        }
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone.trim().length() < 10) {
            throw new IllegalArgumentException("O número de telefone deve ter, no mínimo, 10 caracteres.");
        }
        this.telefone = telefone;
    }

    // Métodos
    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e tenho " + this.idade + " anos.");
        System.out.println("Olá, meu nome é " + this.getNome() + " e tenho " + this.getIdade() + " anos.");
    }

    public void fazerAniversario() {
        this.idade++;   // Incrementa a idade
        System.out.println("Feliz aniversário, " + this.nome + "! Agora você tem " + this.idade + " anos.");
        //this.idade++;   // Incrementa a idade
        this.setIdade(this.getIdade() + 1);
        System.out.println("Feliz aniversário, " + this.getNome() + "! Agora você tem " + this.getIdade() + " anos.");
    }

    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
        System.out.println("Email atualizado para: " + this.email);
        this.setEmail(novoEmail);
        System.out.println("Email atualizado para: " + this.getEmail());
    }

    public String exibirDados() {
        // \n significa quebra de linha
        return "Nome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nCPF: " + this.cpf +
                "\nE-mail: " + this.email +
                "\nTelefone: " + this.telefone;
        return "Nome: " + this.getNome() +
                "\nIdade: " + this.getIdade() +
                "\nCPF: " + this.getCpf() +
                "\nE-mail: " + this.getEmail() +
                "\nTelefone: " + this.getTelefone();

    }
}
