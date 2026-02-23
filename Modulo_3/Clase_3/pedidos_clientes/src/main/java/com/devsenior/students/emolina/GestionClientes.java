package com.devsenior.students.emolina;
import java.util.HashMap;
import java.util.Map;


public class GestionClientes {
    private Map clientes = new HashMap<>();

    public void registrarCliente (String id, String nombre) {
        clientes.put(id, nombre);
    }

    public String buscarCliente (String id) {
        if (!clientes.containsKey(id)) {
            throw new ClienteNoEncontradoException ("Cliente con id: " + id + "  no ha sido encontrado" );
        }
        return clientes.get(id).toString();
    }

}
