package org.example.ex5;

public class SistemaBancario {
    private final ContaService contaService = new ContaService();

    public void criarConta(String titular, double saldoInicial) {
        try {
            contaService.criarConta(new Conta(titular, saldoInicial));
            System.out.println("Conta criada com sucesso.");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void transferir(String origem, String destino, double valor) {
        try {
            contaService.transferir(origem, destino, valor);
            System.out.println("Transferência realizada com sucesso.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        SistemaBancario sistemaBancario = new SistemaBancario();
        sistemaBancario.criarConta("1", 1000);
        sistemaBancario.criarConta("2", 1000);
        sistemaBancario.criarConta("3", -1);
        sistemaBancario.criarConta("2", 2000);

        sistemaBancario.transferir("1", "2", 2000);
        sistemaBancario.transferir("1", "2", 500);
    }
}
