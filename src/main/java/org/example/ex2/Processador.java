package org.example.ex2;

public class Processador {
    public void processar(String dado) {
        if (dado == null || dado.isEmpty()) {
            System.out.println("Dado inválido");
            return;
        }
        if (dado.length() <= 10) {
            System.out.println("Dado muito curto.");
            return;
        }
        System.out.println("Dado válido: " + dado);
    }
}
