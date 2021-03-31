package Exercicio5.classe;

public class Agenda {

    private Contato contatos[];

    public Agenda(int tamanho){
        contatos = new Contato[tamanho];
    }

    public boolean addContato(Contato novoContato) {
        for(int i = 0; i < contatos.length; i++) {
            if(contatos[i] == null) {
                contatos[i] = novoContato;
                             return true;
            }
        }
        return false;
    }

     public boolean removeContato(String nome) {
        for(int i = 0; i < contatos.length; i++) {
            if (contatos[i].getNome() == nome) {
                contatos[i] = null;
                return true;
            }
        }
        return false;
     }

     public void exibirContatos(){
        for(int i = 0; i < contatos.length; i++) {
            if(contatos[i] != null) {
                System.out.println("numero do contato " +1);
                contatos[i].mostrarInformacoes();
                System.out.println("===============");
            }
        }
    }




}
