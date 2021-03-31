package Exercicio2.classe;
/*
2. Crie uma classe para gerenciar livros em um projeto de sistema. A classe deve
conter os atributos e métodos a seguir:
a. Atributos protegidos:
i. código
ii. nome;
iii. descrição;
iv. valor;
v. isbn (código de registro no padrão “978-85-66250-46-6”).
b. Métodos:
i. Construtor de classe;
ii. Exibição de atributos do livro;
iii. Todos os Getters e Setters;
iv. O método setter do atributo valor deve validar e impedir a entrada de valores
negativos.
c. Crie um classe para testar as instancias de objetos da classe livro e utilize cada
um dos métodos criados.
 */
public class Exercicio2 {
    private String codigo;
    private String nome;
    private String descricao;
    private int valor;
    private String isbn;

    public Exercicio2(String codigo, String nome, String descricao, int valor, String isbn) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
    }

    public void imprime(){
      System.out.println(this.codigo);
      System.out.println(this.nome);
      System.out.println(this.descricao);
      System.out.println(this.valor);
      System.out.println(this.isbn);
  }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(int valor) {
      if(valor < 0){
          System.out.println("Valor invalido");
       return;
      }
      this.valor = valor;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getValor() {
        return valor;
    }
    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Exercicio2{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
