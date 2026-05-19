import java.util.Set;

public class Notebook extends Eletronico {

    private String processador;
    private Integer memoriaGb;
    private Integer armazenamentoGb;
    private Integer bateriaMAh;
    private Double telaPol;
    private String tipoPlacaVideo;

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        if(processador.trim().isEmpty()) {
            throw new IllegalArgumentException("O processador deve ser preenchido.");
        }
        this.processador = processador;
    }

    public Integer getMemoriaGb() {
        return memoriaGb;
    }

    public void setMemoriaGb(Integer memoriaGb) {
        if(memoriaGb <= 0) {
            throw new IllegalArgumentException("A quantidade de memória deve ser preenchida.");
        }
        this.memoriaGb = memoriaGb;
    }

    public Integer getArmazenamentoGb() {
        return armazenamentoGb;
    }

    public void setArmazenamentoGb(Integer armazenamentoGb) {
        if(armazenamentoGb <= 0) {
            throw new IllegalArgumentException("A quantidade de armazenamento deve ser preenchida.");
        }
        this.armazenamentoGb = armazenamentoGb;
    }

    public Integer getBateriaMAh() {
        return bateriaMAh;
    }

    public void setBateriaMAh(Integer bateriaMAh) {
        if(bateriaMAh <= 0) {
            throw new IllegalArgumentException("A capacidade da bateria deve ser preenchida.");
        }
        this.bateriaMAh = bateriaMAh;
    }

    public Double getTelaPol() {
        if(telaPol <= 0) {
            throw new IllegalArgumentException("O tamanho da tela deve ser preenchido.");
        }
        return telaPol;
    }

    public void setTelaPol(Double telaPol) {
        this.telaPol = telaPol;
    }

    public String getTipoPlacaVideo() {
        return tipoPlacaVideo;
    }

    public void setTipoPlacaVideo(String tipoPlacaVideo) {
        if(tipoPlacaVideo.compareTo("integrada") != 0 && tipoPlacaVideo.compareTo("dedicada") != 0) {
            throw new IllegalArgumentException("O tipo da placa de vídeo deve ser 'integrada' ou 'dedicada'.");
        }
        this.tipoPlacaVideo = tipoPlacaVideo;
    }

    // Construtor
    public Notebook(
            String descricao,
            String marca,
            Double precoBase,
            Double alturaMm,
            Double larguraMm,
            Double profundidadeMm,
            Double pesoG,
            Double consumoWatts,
            String processador,
            Integer memoriaGb,
            Integer armazenamentoGb
    ) {
        super(descricao, marca, precoBase, alturaMm, larguraMm, profundidadeMm, pesoG, consumoWatts);
        this.setProcessador(processador);
        this.setMemoriaGb(memoriaGb);
        this.setArmazenamentoGb(armazenamentoGb);
        this.setBateriaMAh(3000);
        this.setTelaPol(15.0);
        this.setTipoPlacaVideo("integrada");
    }

    public Boolean isGamer() {
        return this.getTipoPlacaVideo().equals("dedicada");
    }

    public Boolean suportaUpgradeMemoria (Integer novaMemoriaGb) {
        if(novaMemoriaGb < 0) {
            throw new IllegalArgumentException("A nova quantidade de memória deve ser maior ou igual a zero.");
        }
        return novaMemoriaGb + this.getMemoriaGb() <= 64;
    }

    @Override
    public Double calcularPrecoFinal() {
        Double precoFinal = super.calcularPrecoFinal();
        if(this.isGamer()) {
            precoFinal *= 1.15; // Acrescenta 15% ao preço final para notebooks gamers
        }
        return precoFinal;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println(
                "Processador: " + this.getProcessador() + "\n" +
                        "Memória: " + this.getMemoriaGb() + " GB" + "\n" +
                        "Armazenamento: " + this.getArmazenamentoGb() + " GB" + "\n" +
                        "Tela: " + this.getTelaPol() + " pol." + "\n" +
                        "Placa de Vídeo: " + this.getTipoPlacaVideo() + "\n" +
                        "É gamer? " + (this.isGamer() ? "Sim" : "Não") + "\n" +
                        "Suporta upgrade de memória até 64 GB? " + (this.suportaUpgradeMemoria(64 - this.getMemoriaGb()) ? "Sim" : "Não") + "\n"
        );
    }
}