package Exercicio5.classe;
/*
5. Faça um programa de agenda telefônica, com as classes Agenda e Contato. Crie
uma classe Agenda que pode armazenar 10 contatos e que seja capaz de realizar
as seguintes operações:
a. void armazenaContato(Contato contato);
void removeContato(Contato contato);
b. int buscaContato(String nome); // informa em que posição da agenda está a
pessoa;
c. void imprimeAgenda(); // imprime os dados de todas os contatos da agenda
d. void imprimeContato(int index); // imprime os dados do contato que está na
posição do parâmetro índex da agenda.
 */
public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   public void mostrarInformacoes(){
        System.out.println("Nome: " +nome);
        System.out.println("E-mail: " +email);
        System.out.println("Telefone: " +telefone);
   }



}

