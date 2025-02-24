package org.example.ex4;

public class SistemaBiblioteca {
    private final Biblioteca biblioteca = new Biblioteca();

    public void devolverLivro(String titulo) {
        try {
            biblioteca.devolverLivro(titulo);
            System.out.println("Livro devolvido: " + titulo);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void emprestarLivro(String titulo) {
        try {
            biblioteca.emprestarLivro(titulo);
            System.out.println("Livro emprestado: " + titulo);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void adicionarLivro(String titulo) {
        biblioteca.adicionarLivro(titulo);
        System.out.println("Livro adicionado: " + titulo);
    }

    public static void main(String[] args) {
        SistemaBiblioteca sistemaBiblioteca = new SistemaBiblioteca();
        for (int i = 0; i < 2; i++) {
            sistemaBiblioteca.adicionarLivro("Percy Jackson: O Ladrão de Raios");
        }
        sistemaBiblioteca.adicionarLivro("Sobrevivendo no jogo como um bárbaro");
        sistemaBiblioteca.adicionarLivro("Escravo das Sombras");
        sistemaBiblioteca.adicionarLivro("Clean Code");
        sistemaBiblioteca.adicionarLivro("Solo Leveling");

        sistemaBiblioteca.emprestarLivro("Escravo das Sombras");
        sistemaBiblioteca.emprestarLivro("Percy Jackson: O Ladrão de Raios");
        sistemaBiblioteca.emprestarLivro("Sobrevivendo no jogo como um bárbaro");
        sistemaBiblioteca.emprestarLivro("Percy Jackson: O Ladrão de Raios");
        sistemaBiblioteca.emprestarLivro("Escravo das Sombras");

        sistemaBiblioteca.devolverLivro("Percy Jackson: O Ladrão de Raios");
        sistemaBiblioteca.devolverLivro("Percy Jackson: O Ladrão de Raios");
        sistemaBiblioteca.devolverLivro("Percy Jackson: O Ladrão de Raios");
        sistemaBiblioteca.emprestarLivro("?????");
        sistemaBiblioteca.devolverLivro("?????");
    }
}
