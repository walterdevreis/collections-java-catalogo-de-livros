package entity;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaDeLivros;

    public CatalogoLivros(){
        this.listaDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livros = new ArrayList<>();

        for (Livro livro : listaDeLivros){
            if (livro.getAutor().equalsIgnoreCase(autor)){
                livros.add(livro);
            }
        }
        return livros;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livros= new ArrayList<>();

        for (Livro livro : listaDeLivros){
            if (livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal){
                livros.add(livro);
            }
        }
        return livros;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livro = null;

        for (Livro item : listaDeLivros){
            if (item.getTitulo().equalsIgnoreCase(titulo)){
                livro = new Livro(item.getTitulo(), item.getAutor(), item.getAnoDePublicacao());
                break;
            }
        }
        return livro;
    }
}
