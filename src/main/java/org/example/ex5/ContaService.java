package org.example.ex5;

import java.util.ArrayList;
import java.util.List;

public class ContaService {
    private final List<Conta> contas = new ArrayList<>();

    public void criarConta(Conta conta) {
        Posicao posicao = getPosicao(conta.getTitular());
        if (posicao.existe) {
            throw new IllegalArgumentException("Já existe uma conta com o titular dado.");
        }
        contas.add(posicao.indice, conta);
    }

    public void transferir(String origem, String destino, double valor) {
        Posicao posicaoOrigem = getPosicao(origem);
        Posicao posicaoDestino = getPosicao(destino);

        if (!posicaoOrigem.existe || !posicaoDestino.existe) {
            throw new IllegalArgumentException("Erro na transferência.");
        }
        Conta contaOrigem = contas.get(posicaoOrigem.indice);
        if (contaOrigem.getSaldo() < valor) {
            throw new IllegalArgumentException("Erro na transferência.");
        }
        Conta contaDestino = contas.get(posicaoDestino.indice);

        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);
    }

    private Posicao getPosicao(String titular) {
        int left = 0;
        int right = contas.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int diff = titular.compareTo(contas.get(mid).getTitular());

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
