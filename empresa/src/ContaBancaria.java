import java.time.LocalDateTime;
import java.util.ArrayList;

public class ContaBancaria {

    private class Movimentacao {
        private LocalDateTime dataHora;
        private Double valor;
        private String descricao;

        public LocalDateTime getDataHora() {
            return dataHora;
        }

        public void setDataHora(LocalDateTime dataHora) {
            this.dataHora = dataHora;
        }

        public Double getValor() {
            return valor;
        }

        public void setValor(Double valor) {
            this.valor = valor;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        private Movimentacao(
                LocalDateTime dataHora,
                Double valor,
                String descricao
        ) {
            this.setDataHora(dataHora);
            this.setValor(valor);
            this.setDescricao(descricao);
        }
    }

    // Atributos
    // Protected: apenas classes do mesmo pacote têm acesso
    private Integer numConta;
    //private String titular;
    private Pessoa titular;
    private Double saldo = 0.0;
    //private Double saldo = 0.0;
    private CestaTarifas cestaTarifas;
    private ArrayList<Movimentacao> historico = new ArrayList<>();

    // Construtor personalizado
    public ContaBancaria(Integer numConta, Pessoa titular, Double saldoInicial) {
        //this.numConta = numConta;
        this.setNumConta(numConta);
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

    public Pessoa getTitular() {
        return this.titular;
    }

    public void setTitular(Pessoa novoTitular) {
        if(novoTitular.getIdade() < 18) {
            throw new IllegalArgumentException("O titular da conta deve ser maior de idade.");
        }
        this.titular = novoTitular;
    }

    // O atributo saldo terá apenas o getter para podermos
    // consultar o seu valor. As modificações do seu valor
    // deverão ser feitas pelos métodos depositar() e sacar()
    public CestaTarifas getCestaTarifas() {
        return this.cestaTarifas;
    }

    public void setCestaTarifas(CestaTarifas cestaTarifas) {
        this.cestaTarifas = cestaTarifas;
        if(cestaTarifas != null) {
            Movimentacao mov = new Movimentacao(
                    LocalDateTime.now(),
                    -cestaTarifas.getValor(),
                    "Cobrança da cesta de tarifas %s".formatted(cestaTarifas.getNome())
            );
            this.historico.add(mov);
        }
    }

    public Double getSaldo() {
        return this.saldo;
        Double saldo = 0.0;
        for(Movimentacao h: this.historico) {
            saldo += h.getValor();
        }
        return saldo;
    }

    // Métodos
    public void depositar(Double quantia) {
        if(quantia <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
        }
        this.saldo += quantia;
        Movimentacao mov = new Movimentacao(
                LocalDateTime.now(),
                quantia,
                "Depósito"
        );
        this.historico.add(mov);
        System.out.println("O valor R$ " + quantia + " foi depositado.");
    }

    public void sacar(Double quantia) {
        if(quantia > this.saldo) {
            if(quantia > this.getSaldo()) {
                throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
            }
            this.saldo -= quantia;
            Movimentacao mov = new Movimentacao(
                    LocalDateTime.now(),
                    -quantia,
                    "Saque"
            );
            this.historico.add(mov);
            System.out.println("O valor R$ " + quantia + " foi sacado.");
        }

        public void exibirSaldo() {
            String msg = "Saldo da conta bancária nº %d de %s é R$ %.2f".formatted(this.numConta, this.titular.getNome(), this.saldo);
            Double saldoFinal = this.getSaldo();
            if(this.cestaTarifas != null) {
                saldoFinal -= this.cestaTarifas.getValor();
            }

            String msg = "Saldo da conta bancária nº %d de %s é R$ %.2f".formatted(this.numConta, this.titular.getNome(), saldoFinal);

            System.out.println(msg);
        }

        public void exibirExtrato() {
            System.out.println("Extrato da conta bancária nº %d de %s".formatted(this.numConta, this.titular.getNome()));
            Double saldo = 0.0;
            for(Movimentacao h: this.historico) {
                System.out.println("%s - %s: R$ %.2f".formatted(
                        h.getDataHora(),
                        h.getDescricao(),
                        h.getValor()
                ));
                saldo += h.getValor();
            }
            System.out.println("SALDO FINAL: R$ %.2f".formatted(saldo));
        }
    }