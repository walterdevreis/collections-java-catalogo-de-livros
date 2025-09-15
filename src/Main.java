import entity.CatalogoLivros;
import entity.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CatalogoLivros catalogoLivros = getCatalogoLivros();

        System.out.println();

        System.out.print("Pesquise por autor: ");
        String autor = sc.nextLine();
        List<Livro> livros = catalogoLivros.pesquisarPorAutor(autor);
        for (Livro livro : livros){
            System.out.println(livro);
        }

        System.out.println();

        System.out.println("Pesquise livros publicados em um determinado intervalo de anos: ");
        System.out.print("Digite o ano inicial: ");
        int anoInicial = sc.nextInt();
        System.out.print("digite o ano final: ");
        int anoFinal = sc.nextInt();
        List<Livro> livrosPorAno = catalogoLivros.pesquisarPorIntervaloAnos(anoInicial, anoFinal);
        for (Livro listaDeLivro : livrosPorAno){
            System.out.println(listaDeLivro);
        }

        System.out.println();

        System.out.println("Pesquise o livro por título: ");
        System.out.print("Digite o título do livro: ");
        sc.nextLine();
        String titulo = sc.nextLine();
        Livro livro = catalogoLivros.pesquisarPorTitulo(titulo);

        System.out.println(livro);

        sc.close();
    }

    private static CatalogoLivros getCatalogoLivros() {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Use a Cabeça Java", "Kothy Sierra, Bert Bates & Trish Gee", 2008);
        catalogoLivros.adicionarLivro("Java para iniciantes", "Herbert Schidt", 2009);
        catalogoLivros.adicionarLivro("Java para leigos", "Barry Burd", 2013);
        catalogoLivros.adicionarLivro("Java como programar 10º Edição", "Paul Deitel, Harvey Deitel", 2016);
        catalogoLivros.adicionarLivro("Programação em Java", "Pedro Coelho", 2016);
        catalogoLivros.adicionarLivro("Java para web: Desenvolvimento de aplicações", "William Pereira Alves", 2015);
        catalogoLivros.adicionarLivro("Jornada Java", "Alison Medeiros", 2021);
        catalogoLivros.adicionarLivro("Lógica de Programação e Estrutura de Dados: Com Aplicações em Java", "Sandra Puga, Gerson Rissetti", 2008);
        catalogoLivros.adicionarLivro("Estruturas de Dados & Algoritmos em Java", "Michael T. Goodrich, Roberto Tamassia, Bernardo Copstein", 2013);
        catalogoLivros.adicionarLivro("Dominando Java: 100+ Exercícios Resolvidos e Comentados para Acelerar seu Aprendizado", "Ruhan Conceição", 2023);
        catalogoLivros.adicionarLivro("Intro to Python for Computer Science and Data Science: Learning to Program with Ai, Big Data and the Cloud", "Paul Deitel, Harvey Deitel", 2019);
        return catalogoLivros;
    }
}