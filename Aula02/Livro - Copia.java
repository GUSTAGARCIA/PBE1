package prjCaneta;

public class Livro {
  String nomeLivro;
  String nomeAutor;
  boolean alugado;
  
  public Livro(String nomeLivro, String nomeAutor) {
	  this.nomeLivro = nomeLivro;
	  this.nomeAutor = nomeAutor;
	  this.alugado = false;
  }
  
  void status() {
	  System.out.println(this.nomeLivro + " - " + this.nomeAutor + ":" + (this.alugado ? "Alugado":"Disponível"));
  }
  void alugar() {
	  this.alugado = true;
  }
  void devolver() {
	  this.alugado = false;
  }
}
