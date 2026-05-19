import java.util.Set;

public class Eletronico extends Produto {

    private Integer voltagem;
    private Double consumoWatts;
    private Integer tempoGarantia;

    public Integer getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(Integer voltagem) {
        // if(voltagem != 0 && voltagem != 110 && voltagem != 220)
        if(! Set.of(0, 110, 220).contains(voltagem)) {
            throw new IllegalArgumentException("Voltagem deve ser 0, 110 ou 220.");
        }
        this.voltagem = voltagem;
    }

    public Double getConsumoWatts() {
        return consumoWatts;
    }

    public void setConsumoWatts(Double consumoWatts) {
        if(consumoWatts <= 0) {
            throw new IllegalArgumentException("Consumo em watts deve ser maior que zero.");
        }
        this.consumoWatts = consumoWatts;
    }

    public Integer getTempoGarantia() {
        return tempoGarantia;
    }

    public void setTempoGarantia(Integer tempoGarantia) {
        if(tempoGarantia <= 0) {
            throw new IllegalArgumentException("Tempo de garantia deve ser maior que zero.");
        }
        this.tempoGarantia = tempoGarantia;
    }

    public Eletronico(
            String descricao,
            String marca,
            Double precoBase,
            Double alturaMm,
            Double larguraMm,
            Double profundidadeMm,
            Double pesoG,
            Double consumoWatts
    ) {
        super(descricao, marca, precoBase, alturaMm, larguraMm, profundidadeMm, pesoG);
        this.setVoltagem(110);
        this.setConsumoWatts(consumoWatts);
        this.setTempoGarantia(12);
    }

    public Double calcularCustoEnergia(Integer horas, Double tarifa) {
        if(horas <= 0) {
            throw new IllegalArgumentException("Horas de uso devem ser maiores que zero.");
        }
        if(tarifa <= 0) {
            throw new IllegalArgumentException("Tarifa de energia deve ser maior que zero.");
        }
        return this.getConsumoWatts() * horas * tarifa;
    }

    public Boolean isBivolt() {
        return this.getVoltagem() == 0;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println(
                "Voltagem: " + (this.getVoltagem() == 0 ? "110/220" : this.getVoltagem()) + " V" + "\n" +
                        "Consumo: " + this.getConsumoWatts() + " W" + "\n" +
                        "Garantia: " + this.getTempoGarantia() + " meses" + "\n" +
                        "É bivolt? " + (this.isBivolt() ? "Sim" : "Não") + "\n"
        );
    }

}
