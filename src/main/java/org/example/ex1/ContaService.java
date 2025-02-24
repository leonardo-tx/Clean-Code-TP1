package org.example.ex1;

import java.util.ArrayList;
import java.util.List;

public class ContaService {
    private final List<Conta> contas = new ArrayList<>();

    public List<Conta> getTodos() {
        return contas.stream().toList();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void processarPagamentos(double taxa) {
        for (Conta conta : contas) {
            conta.sacar(taxa);
        }
    }
}
