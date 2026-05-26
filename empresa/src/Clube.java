import java.util.ArrayList;

public class Clube {
    private String nome;
    private ArrayList<Pessoa> socios = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do clube não pode ser vazio.");
        }
        this.nome = nome;
    }

    public ArrayList<Pessoa> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Pessoa> socios) {
        this.socios = socios;
    }

    public Clube(
            String nome
    ) {
        this.setNome(nome);
    }

    public void addSocio(Pessoa socio) {
        this.socios.add(socio);
    }

    public void listSocios() {
        System.out.println("Sócios do clube " + this.getNome() + ":");
        for(Pessoa s: this.socios) {
            System.out.println(s.getNome());
        }
    }
}