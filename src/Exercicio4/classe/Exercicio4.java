package Exercicio4.classe;

/*
4. Escreva uma classe cujos objetos representam alunos matriculados em uma
disciplina. Cada objeto dessa classe deve guardar os seguintes dados do aluno:
matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os seguintes
métodos para esta classe:
a. Média: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem
peso 2)
b. Final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não
for para a final considerando a nota final como 6).
 */
public class Exercicio4 {

   private String matricula;
   private String nome;
   private double nota1, nota2, trabalho;

    public Exercicio4(String matricula, String nome, double nota1, double nota2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }

    public double media(){
        return ((nota1+nota2)*2.5+trabalho*2)/7;
    }

    public double mediaFinal(){
        double media = media();
        if(media<2.5 || media>=6)
            return 0;
        return 10-media;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    @Override
    public String toString() {
        return "Exercicio4{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", trabalho=" + trabalho +
                '}';
    }
}
