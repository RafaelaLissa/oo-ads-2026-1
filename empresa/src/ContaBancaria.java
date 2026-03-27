public class ContaBancaria {
    //Atributos
    public Double saldo;
    public String titular;

    //metodo constrututor
    public ContaBancaria(
            String titular,
            Double saldoInicial
    ){
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    //métodos para depositar;
    public void depositar(Double quantia){
        saldo += quantia;
    }
    //metódo para sacar
    public void sacar(Double quantia){
        saldo -= quantia;
    }
    //metódo para exibir
    public void exibirSaldo(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Atual:R$ " + saldo);
    }
    // Getter (necessário para a classe filha)
    public Double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
