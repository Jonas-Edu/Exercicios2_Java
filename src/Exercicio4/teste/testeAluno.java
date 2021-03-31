package Exercicio4.teste;

import Exercicio4.classe.Exercicio4;

public class testeAluno {
    public static void main(String[] args) {

        Exercicio4 novoAluno = new Exercicio4("1254", "Ana",8,1,2);

        System.out.println("A media é : "  +(novoAluno.media()));
        System.out.println("A falta : " +(novoAluno.mediaFinal())+ " para ser aprovado ");

    }
}
