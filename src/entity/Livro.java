package entity;

public class Livro {

    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livro(){}

    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    @Override
    public String toString() {
        return "Título do Livro: " +
                titulo + '\n' +
                "Autor do Livro: " + autor + '\n' +
                "Ano de publicação do Livro: " + getAnoDePublicacao() + "\n";
    }
}
