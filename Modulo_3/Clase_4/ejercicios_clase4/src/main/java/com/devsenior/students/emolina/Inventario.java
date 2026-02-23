package com.devsenior.students.emolina;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Integer> productos = new HashMap<>();

    public void agregarProducto(String nombreProducto, int cantidad) throws CantidadInvalidaException {
        if (cantidad <= 0) {
            throw new CantidadInvalidaException("La cantidad del nuevo producto no puede ser igual o menor a 0");
        }
        productos.put(nombreProducto, cantidad);
    }

    public void eliminarProducto(String nombreProducto) {
        if (!productos.containsKey(nombreProducto)) {
            throw new ProductoNoEncontradoException("El Producto no existe");
        }
        productos.remove(nombreProducto);
    }

    public Integer buscarProducto(String nombreProducto) {
       if (!productos.containsKey(nombreProducto)) {
            throw new ProductoNoEncontradoException("El Producto no ha sido encontrado");
        }
        return productos.get(nombreProducto);
    }

    public void actualizarCantidad (String nombreProducto, int nuevaCantidad) throws CantidadInvalidaException {
        if (nuevaCantidad <0) {
            throw new CantidadInvalidaException("No es posible tener cantidades negativas del producto");
        }
        if (!productos.containsKey(nombreProducto)) {
            throw new ProductoNoEncontradoException("El Producto no existe");
        }
        productos.replace(nombreProducto, nuevaCantidad);
    }
}
