public class ContaEspecial extends ContaBancaria {
    //atributos
    public double limite;
    //método construtor
    public ContaEspecial(
            String titular,
            Double saldoInicial,
            Double limite
    ){
        super(titular,saldoInicial); //chama construtor da classe pai
        this.limite = limite;
    }
    @Override
    public void exibirSaldo(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo com limites: " + (getSaldo()+ limite));
    }
    //saldo real(sem limites)
    public void exibirSaldoReal(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo real: " + getSaldo());
    }
}
