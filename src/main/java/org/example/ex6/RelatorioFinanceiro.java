package org.example.ex6;

public class RelatorioFinanceiro {
    private ClienteService clienteService;

    public RelatorioFinanceiro(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void gerarRelatorio() {
        System.out.println("=== Relatório Financeiro ===");
        mostrarClientes();
        System.out.println("===========================");
        System.out.println("Fim do Relatório");
    }

    private void mostrarClientes() {
        for (Cliente cliente : clienteService.getTodos()) {
            System.out.println(cliente);
        }
    }

    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService();
        RelatorioFinanceiro relatorioFinanceiro = new RelatorioFinanceiro(clienteService);

        clienteService.adicionarCliente(new Cliente("Leonardo", 1023.40));
        clienteService.adicionarCliente(new Cliente("Cadu", 10053.21));
        clienteService.adicionarCliente(new Cliente("Gabriela", 3567.00));

        relatorioFinanceiro.gerarRelatorio();
    }
}