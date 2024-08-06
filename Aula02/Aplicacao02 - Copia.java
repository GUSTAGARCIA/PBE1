package prjCaneta;

public class Aplicacao02 {

	public static void main(String[] args) {
	Livro livro01 = new Livro("Alice no País das Maravilhas","Júlio Trigueiro ");
	Livro livro02 = new Livro("Quarto de Despejo","Pedro Francisco ");
	
	System.out.println("Livros disponíveis: ");
	System.out.print("01. ");
	livro01.status();
	System.out.print("02. ");
	livro02.status();

	}

}
