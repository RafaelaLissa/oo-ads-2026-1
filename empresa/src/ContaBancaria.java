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
    protected Double saldo;
    public String titular;

    // Construtor personalizado
    public ContaBancaria(String titular, Double saldoInicial) {
        this.titular = titular;
        //this.saldo = saldoInicial;
        // Chama depositar() para ajustar o saldo inicial da conta,
        // passando pela validação existente no método
        this.depositar(saldoInicial);
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
        System.out.println("Saldo da conta de " + this.titular + " é R$ " + this.saldo);
    }
}
