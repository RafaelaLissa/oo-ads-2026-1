public class Pessoa {
    //Atributos
    public String nome;
    public Integer idade;
    public String cpf;
    public String email;
    public String telefone;

    //Métodos
    public void apresentar(){
        System.out.println("Olá meu nome é "+ nome + "e tenho" + idade + "anos.");
    }
    public void fazerAniversario(){
        this.idade++; //Incremento a idade
        System.out.println("Feliz Aniversário," + nome + "! Agora você tem" + idade + "anos");
    }
    public void atualizarEmail(String novoEmail){
        this.email = novoEmail;
        System.out.println("Email atualizado para: " + this.email);
    }
    public String exibirDados(){
        //\n significa quebra de linha
        return "Nome:" + this.nome +
                "\nIdade:" + this.idade +
                "\nCpf:" + this.cpf +
                "\nE-mail:" + this.email +
                "\nTelefone:" + this.telefone;
    }
}
