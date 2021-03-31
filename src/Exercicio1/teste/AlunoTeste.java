package Exercicio1.teste;

import Exercicio1.classe.Exercicio1;

public class AlunoTeste {
    public static void main(String[] args) {
        Exercicio1 aluno = new Exercicio1();
        aluno.nome = "Eduardo";
        aluno.ra = "10236";
        aluno.dataNasc = "01/01/1990";
        aluno.email = "eduardo@gmail.com";

        System.out.println("Aluno: "+aluno.nome);
        System.out.println("RA: "+aluno.ra);
        System.out.println("Data de Nascimento: "+aluno.dataNasc);
        System.out.println("e-mail: "+aluno.email);

    }
}
