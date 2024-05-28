package main;
import java.util.HashMap;
import java.util.Map;


public class Biblioteca {
    private Map<String, Livro> mapaLivros; 

    public Biblioteca() {
        this.mapaLivros = new HashMap<>();
    }

    public void adicionarLivro(Livro livro) {
        mapaLivros.put(livro.isbn, livro);
    }

    public void removerLivro(Livro livro) {
        mapaLivros.remove(livro.isbn);
    }

    public Livro buscarLivroPorCodigo(String codigo) {
        return mapaLivros.get(codigo);
    }
}
