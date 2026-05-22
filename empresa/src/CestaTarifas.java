public class CestaTarifas {

    private String nome;
    private Double valor;

    public CestaTarifas(String nome, Double valor) {
        this.setNome(nome);
        this.setValor(valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da cesta não pode ser vazio.");
        }
        this.nome = nome;
    }

    public Double getValor() {
        if(valor < 0) {
            throw new IllegalArgumentException("O valor da cesta não pode ser negativo.");
        }
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}