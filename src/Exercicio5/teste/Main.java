package Exercicio5.teste;

import Exercicio5.classe.Agenda;
import Exercicio5.classe.Contato;

public class Main {
    public static void main(String[] args) {

    Contato lara = new Contato("Lara", "19-98749-9632","lara@gmail.com");
    Contato rita = new Contato("Rita", "19-98749-9632","rita@gmail.com");

        Agenda agendaJonas = new Agenda(1000);

        agendaJonas.addContato(lara);
        agendaJonas.addContato(rita);

        agendaJonas.exibirContatos();



        }
}
