//public class Estudante extends Pessoa{
//    //Atributos
//    public String nomeCurso;
//    public Double notaPrimeiroBimestre;
//    public Double notaSegundoBimestre;
//
//    public Estudante(
//            String nome,
//            Integer idade,
//            String cpf,
//            String email,
//            String telefone,
//            String nomeCurso
//    ){
//        super(nome, idade, cpf, email,telefone);
//        this.nomeCurso = nomeCurso;
//        this.notaPrimeiroBimestre = 0.0;
//        this.notaSegundoBimestre = 0.0;
//    }
//    //calcular média
//    public Double calcularMediaFinal(){
//        return (this.notaPrimeiroBimestre + this.notaSegundoBimestre) / 2.0;
//    }
//    public String verificarMedia(){
//        if (calcularMediaFinal() >= 6.0){
//            return "Aprovado";
//        }else{
//            return "Reprovado";
//        }
//    }
//    @Override
//    public String exibirDados(){
//        String dadosPessoa = super.exibirDados();
//        return dadosPessoa +
//                "\nNome do Curso: " + this.nomeCurso +
//                "\nNota do 1°Bimestre: " + this.notaPrimeiroBimestre +
//                "\nNota do 2°Bimestre: " + this.notaSegundoBimestre +
//                "\nMédia Final: " + this.calcularMediaFinal() +
//                "\nA situação do Aluno é: " + this.verificarMedia();
//    }
//}
public class Estudante extends Pessoa {

    // Atributo
    public String nomeCurso;
    // 1ª opção de inicializar notas zeradas
    //public Double nota1Bim = 0.0;
    //public Double nota2Bim = 0.0;
    public Double nota1Bim;
    public Double nota2Bim;
    private String nomeCurso;
    private Double nota1Bim;
    private Double nota2Bim;

    public Estudante(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone,
            String nomeCurso
    ) {
        super(nome, idade, cpf, email, telefone);
        this.setNomeCurso(nomeCurso);
        this.setNota1Bim(0.0);
        this.setNota2Bim(0.0);
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        if (nomeCurso.trim().length() < 3) {
            throw new IllegalArgumentException("O nome do curso deve ter, pelo menos, 3 caracteres.");
        }
        this.nomeCurso = nomeCurso;
        // 2ª opção de inicializar notas zeradas
        this.nota1Bim = 0.0;
        this.nota2Bim = 0.0;
    }

    public Double getNota1Bim() {
        return nota1Bim;
    }

    public void setNota1Bim(Double nota1Bim) {
        if (nota1Bim < 0 || nota1Bim > 10) {
            throw new IllegalArgumentException("A nota bimestral deve estar entre 0 (inclusive) e 10 (inclusive)");
        }
        this.nota1Bim = nota1Bim;
    }

    public Double getNota2Bim() {
        return nota2Bim;
    }

    public void setNota2Bim(Double nota2Bim) {
        if (nota2Bim < 0 || nota2Bim > 10) {
            throw new IllegalArgumentException("A nota bimestral deve estar entre 0 (inclusive) e 10 (inclusive)");
        }
        this.nota2Bim = nota2Bim;
    }

    // Métodos
    public Double calcularMedia() {
        return (this.nota1Bim + this.nota2Bim) / 2;
        return (this.getNota1Bim() + this.getNota2Bim()) / 2;
    }

    public String determinarSituacao() {
        // if(this.calcularMedia() > 6.0) return "APROVADO";
        // else return "REPROVADO";
        return this.calcularMedia() >= 6.0 ? "APROVADO" : "REPROVADO";
    }

    @Override
    public String exibirDados() {
        String dadosEstudante = super.exibirDados();
        return dadosEstudante +
                "\nCurso: " + this.nomeCurso +
                "\nNota 1º bim.: " + this.nota1Bim +
                "\nNota 2º bim.: " + this.nota2Bim +
                "\nCurso: " + this.getNomeCurso() +
                "\nNota 1º bim.: " + this.getNota1Bim() +
                "\nNota 2º bim.: " + this.getNota2Bim() +
                "\nMédia final: " + this.calcularMedia() +
                "\nSituação: " + this.determinarSituacao();
    }
}
