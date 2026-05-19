public class Produto {

    private String descricao;
    private String marca;
    private Double precoBase;
    private Boolean importado;
    private Integer estoque;
    private Double alturaMm;
    private Double larguraMm;
    private Double profundidadeMm;
    private Double pesoG;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição não pode ser vazia.");
        }
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca.trim().isEmpty()) {
            throw new IllegalArgumentException("A marca não pode ser vazia.");
        }
        this.marca = marca;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        if(precoBase <= 0) {
            throw new IllegalArgumentException("O preço base deve ser maior que zero.");
        }
        this.precoBase = precoBase;
    }

    public Boolean getImportado() {
        return importado;
    }

    public void setImportado(Boolean importado) {
        this.importado = importado;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        if(estoque < 0) {
            throw new IllegalArgumentException("O estoque deve ser maior ou igual a zero.");
        }
        this.estoque = estoque;
    }

    public Double getAlturaMm() {
        return alturaMm;
    }

    public void setAlturaMm(Double alturaMm) {
        if(alturaMm <= 0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }
        this.alturaMm = alturaMm;
    }

    public Double getLarguraMm() {
        return larguraMm;
    }

    public void setLarguraMm(Double larguraMm) {
        if(larguraMm <= 0) {
            throw new IllegalArgumentException("A largura deve ser maior que zero.");
        }
        this.larguraMm = larguraMm;
    }

    public Double getProfundidadeMm() {
        return profundidadeMm;
    }

    public void setProfundidadeMm(Double profundidadeMm) {
        if(profundidadeMm <= 0) {
            throw new IllegalArgumentException("A profundidade deve ser maior que zero.");
        }
        this.profundidadeMm = profundidadeMm;
    }

    public Double getPesoG() {
        return pesoG;
    }

    public void setPesoG(Double pesoG) {
        if(pesoG <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
        this.pesoG = pesoG;
    }

    public Produto(
            String descricao,
            String marca,
            Double precoBase,
            Double alturaMm,
            Double larguraMm,
            Double profundidadeMm,
            Double pesoG
    ) {
        this.setDescricao(descricao);
        this.setMarca(marca);
        this.setPrecoBase(precoBase);
        this.setImportado(false);
        this.setEstoque(0);
        this.setAlturaMm(alturaMm);
        this.setLarguraMm(larguraMm);
        this.setProfundidadeMm(profundidadeMm);
        this.setPesoG(pesoG);
    }

    public Double calcularVolumeCm3() {
        return (this.getAlturaMm() * this.getLarguraMm() * this.getProfundidadeMm()) / 1000;
    }

    public Boolean isDisponivel() {
        return this.getEstoque() > 0;
    }

    public Double calcularPrecoFinal() {
        if(this.importado) return this.getPrecoBase() * 1.1; // 10% a mais
        else return this.getPrecoBase();
    }

    public void exibir() {
        System.out.println(
                "Descrição: " + this.getDescricao() + "\n" +
                        "Marca: " + this.getMarca() + "\n" +
                        "Preço Base: R$ %.2f".formatted(this.getPrecoBase()) + "\n" +
                        "Estoque: " + this.getEstoque() + "\n" +
                        "Importado: " + this.getImportado() + "\n" +
                        "Altura (mm): %.1f".formatted(this.getAlturaMm()) + "\n" +
                        "Largura (mm): %.1f".formatted(this.getLarguraMm()) + "\n" +
                        "Profundidade (mm): %.1f".formatted(this.getProfundidadeMm()) + "\n" +
                        "Peso (g): %.1f".formatted(this.getPesoG()) + "\n" +
                        "Volume (cm³) %.1f: ".formatted(this.calcularVolumeCm3()) + "\n" +
                        "Preço Final: R$ %.2f".formatted(this.calcularPrecoFinal()) + "\n" +
                        "Disponível: " + (this.isDisponivel() ? "Sim" : "Não") + "\n"
        );
    }

}
