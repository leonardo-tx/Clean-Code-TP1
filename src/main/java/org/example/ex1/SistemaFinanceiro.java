package org.example.ex1;

public class SistemaFinanceiro {
    private final ContaService contaService;

    public SistemaFinanceiro(ContaService contaService) {
        this.contaService = contaService;
    }

    public void adicionarConta(Conta conta) {
        contaService.adicionarConta(conta);
    }

    public void gerarRelatorio() {
        System.out.println("=== Relatório Financeiro ===");
        for (Conta conta : contaService.getTodos()) {
            System.out.println(conta);
        }
    }

    public void processarPagamentos(double taxa) {
        contaService.processarPagamentos(taxa);
    }
}
