package org.example.ex4;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo) {
        Posicao posicao = getPosicao(titulo);
        if (!posicao.existe) {
            livros.add(posicao.indice, new Livro(titulo, 1));
            return;
        }
        Livro livroArmazenado = livros.get(posicao.indice);
        livroArmazenado.increaseQuantidadeMaxima();
        livroArmazenado.increaseQuantidade();
    }

    public Livro emprestarLivro(String titulo) {
        Posicao posicao = getPosicao(titulo);
        if (!posicao.existe) {
            throw new IllegalArgumentException("Livro não disponível.");
        }
        Livro livro = livros.get(posicao.indice);
        if (!livro.disponibilidade()) {
            throw new IllegalArgumentException("Livro não disponível.");
        }
        livro.decreaseQuantidade();
        return livro;
    }

    public void devolverLivro(String titulo) {
        Posicao posicao = getPosicao(titulo);
        if (!posicao.existe) {
            throw new IllegalArgumentException("Livro não encontrado.");
        }
        Livro livroArmazenado = livros.get(posicao.indice);
        if (livroArmazenado.cheio()) {
            throw new IllegalArgumentException("Não há livros para devolver para essa obra.");
        }
        livroArmazenado.increaseQuantidade();
    }

    private Posicao getPosicao(String titulo) {
        int left = 0;
        int right = livros.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int diff = titulo.compareTo(livros.get(mid).getTitulo());

            if (diff == 0) {
                return new Posicao(mid, true);
            }
            if (diff > 0) {
                left = mid + 1;
                continue;
            }
            right = mid - 1;
        }
        return new Posicao(left, false);
    }
}
