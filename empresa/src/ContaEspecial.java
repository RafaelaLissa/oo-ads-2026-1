//public class ContaEspecial extends ContaBancaria {
//    //atributos;
//    public double limite;
//    //método construtor;
//    public ContaEspecial(
//            String titular,
//            Double saldoInicial,
//            Double limite
//    ){
//        super(titular,saldoInicial); //chama construtor da classe pai;
//        this.limite = limite;
//    }
//    @Override
//    //exibir;
//    public void exibirSaldo(){
//        System.out.println("Titular: " + getTitular());
//        System.out.println("Saldo com limites: " + (getSaldo()+ limite));
//    }
//    //saldo real(sem limites);
//    public void exibirSaldoReal(){
//        System.out.println("Titular: " + getTitular());
//        System.out.println("Saldo real: " + getSaldo());
//    }
//}
public class ContaEspecial extends ContaBancaria {

    // Atributo
    Double limite;
    private Double limite;

    // Construtor personalizado
    public ContaEspecial(
            Integer numConta,
            String titular,
            Double saldoInicial,
            Double limite
    ) {
        super(numConta, titular, saldoInicial);
        this.limite = limite;
        //this.limite = limite;
        this.setLimite(limite);
    }

    // Getter e setter
    public Double getLimite() {
        return this.limite;
    }

    public void setLimite(Double novoLimite) {
        if(novoLimite <= 0) {
            throw new IllegalArgumentException("O limite deve ser maior que zero.");
        }
        this.limite = novoLimite;
    }

    @Override
    public void exibirSaldo() {
        String msg = "Saldo da conta ESPECIAL nº %d de %s é R$ %.2f".formatted(this.getNumConta(), this.titular, this.saldo + this.limite);
        String msg = "Saldo da conta ESPECIAL nº %d de %s é R$ %.2f".formatted(
                this.getNumConta(),
                this.getTitular(),
                this.getSaldo() + this.getLimite()
        );
        System.out.println(msg);
    }
    public void exibirSaldoReal() {
        String msg = "Saldo (real) da conta ESPECIAL nº %d de %s é R$ %.2f".formatted(this.getNumConta(), this.titular, this.saldo);
        String msg = "Saldo (real) da conta ESPECIAL nº %d de %s é R$ %.2f".formatted(
                this.getNumConta(),
                this.getTitular(),
                this.getSaldo()
        );
        System.out.println(msg);
    }
}