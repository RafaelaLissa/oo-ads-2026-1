//public class ContaBancaria {
//    //Atributos;
//    //Protected: apenas a própria classe e seus descendentes tem acesso
//    protected Double saldo;
//    public String titular;
//
//    //metodo constrututor;
//    public ContaBancaria(
//            String titular,
//            Double saldoInicial
//
//    ){
//        this.titular = titular;
//        this.saldo = saldoInicial;
//    }
//
//    //métodos para depositar;
//    public void depositar(Double quantia){
//        saldo += quantia;
//    }
//    //metódo para sacar;
//    public void sacar(Double quantia){
//        saldo -= quantia;
//    }
//    //metódo para exibir;
//    public void exibirSaldo(){
//        System.out.println("Titular: " + titular);
//        System.out.println("Saldo Atual:R$ " + saldo);
//    }
//    // Getter (necessário para a classe filha);
//    public Double getSaldo() {
//        return saldo;
//    }
//
//    public String getTitular() {
//        return titular;
//    }
//}
public class ContaBancaria {

    // Atributos
    // Protected: apenas classes do mesmo pacote têm acesso
    private Integer numConta;
    public String titular;
    protected Double saldo = 0.0;
    private String titular;
    private Double saldo = 0.0;

    // Construtor personalizado
    public ContaBancaria(Integer numConta, String titular, Double saldoInicial) {
        //this.numConta = numConta;
        this.setNumConta(numConta);
        this.titular = titular;
        //this.titular = titular;
        this.setTitular(titular);
        //this.saldo = saldoInicial;
        // Chama depositar() para ajustar o saldo inicial da conta,
        // passando pela validação existente no método
        this.depositar(saldoInicial);
    }

    // Getters/setters
    public Integer getNumConta() {
        return this.numConta;
    }

    public void setNumConta(Integer novoNumConta) {
        if(novoNumConta <= 0) {
            throw new IllegalArgumentException("O número da conta deve ser maior que zero.");
        }
        this.numConta = novoNumConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String novoTitular) {
        // Este é um exemplo de setter sem validações
        this.titular = novoTitular;
    }

    // O atributo saldo terá apenas o getter para podermos
    // consultar o seu valor. As modificações do seu valor
    // deverão ser feitas pelos métodos depositar() e sacar()
    public Double getSaldo() {
        return this.saldo;
    }

    // Métodos
    public void depositar(Double quantia) {
        if(quantia <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
        }
        this.saldo += quantia;
        System.out.println("O valor R$ " + quantia + " foi depositado.");
    }

    public void sacar(Double quantia) {
        if(quantia > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        this.saldo -= quantia;
        System.out.println("O valor R$ " + quantia + " foi sacado.");
    }

    public void exibirSaldo() {
        String msg = "Saldo da conta bancária nº %d de %s é R$ %.2f".formatted(this.numConta, this.titular, this.saldo);
        System.out.println(msg);
    }
}