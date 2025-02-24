package org.example.ex6;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    private final List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getTodos() {
        return clientes.stream().toList();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}
