package org.example.ex9;

public class Processador {
    public void processarDado(String dado) {
        if (dado == null) {
            return;
        }
        System.out.println("Processando: " + dado);
    }
}
