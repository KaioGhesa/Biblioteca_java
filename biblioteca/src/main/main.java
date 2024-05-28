package main;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        
     Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Jujutsu Kaisen", "Gege Akutam", "05318");
        Livro livro2 = new Livro("Naruto", "Masashi Kishimoto", "081174");
        Livro livro3 = new Livro("HunterxHunter", "Yoshiro Togashi", "270466");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o codigo do livro que deseja buscar: ");
        String codigoLivro = scanner.nextLine();

        Livro livroEncontrado = biblioteca.buscarLivroPorCodigo(codigoLivro);
        if (livroEncontrado != null) {
            System.out.println("Livro encontrado: " + livroEncontrado.getTitulo());
            System.out.println("ID Livro: " + livroEncontrado.getIsbn());
            System.out.println("Autor: " + livroEncontrado.getAutor());
        } else {
            System.out.println("Livro não encontrado.");
        }
    }   
        
        
 }
    

