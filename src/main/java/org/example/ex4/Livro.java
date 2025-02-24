package org.example.ex4;

public class Livro {
    private final String titulo;
    private int quantidade;
    private int quantidadeMaxima;

    public Livro(String titulo, int quantidade) {
        if (titulo.isEmpty()) {
            throw new IllegalArgumentException("O título do livro não pode ser vazio.");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade de livros não pode ser menor que 0.");
        }
        this.titulo = titulo;
        this.quantidade = quantidade;
        this.quantidadeMaxima = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public void decreaseQuantidade() {
        if (quantidade - 1 < 0) {
            throw new IllegalArgumentException("A quantidade de livros não pode ser menor que 0.");
        }
        quantidade -= 1;
    }

    public void increaseQuantidade() {
        if (quantidade + 1 > quantidadeMaxima) {
            throw new IllegalArgumentException("A quantidade de livros não pode ser maior que a quantidade máxima.");
        }
        quantidade += 1;
    }

    public void increaseQuantidadeMaxima() {
        quantidadeMaxima += 1;
    }

    public boolean disponibilidade() {
        return quantidade > 0;
    }

    public boolean cheio() {
        return quantidade == quantidadeMaxima;
    }
}
