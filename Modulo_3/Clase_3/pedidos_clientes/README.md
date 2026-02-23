# Sistema de Gestión de Clientes y Pedidos

Desarrolla un sistema de gestión de clientes y pedidos que permita a los usuarios registrar clientes, crear pedidos y buscar pedidos. El sistema debe manejar adecuadamente las excepciones relacionadas con la gestión de clientes y pedidos utilizando excepciones personalizadas tanto verificadas (checked) como no verificadas (unchecked).

## Requisitos:

1. Crea una excepción personalizada llamada ClienteNoEncontradoException que extienda RuntimeException. Esta excepción debe ser lanzada cuando se intente buscar un cliente que no exista en el sistema.

2. Crea una excepción personalizada llamada PedidoInvalidoException que extienda Exception. Esta excepción debe ser lanzada cuando se intente crear un pedido con información inválida (por ejemplo, cantidad negativa o cliente inexistente).

3. Crea una clase llamada GestionClientes que contenga métodos para registrar y buscar clientes.
    - Método registrarCliente(String id, String nombre) que registre un cliente en el sistema.

    - Método buscarCliente(String id) que lance ClienteNoEncontradoException si el cliente no existe.

4. Crea una clase llamada GestionPedidos que contenga métodos para crear y buscar pedidos.
    - Método crearPedido(String clienteId, String producto, int cantidad) que lance PedidoInvalidoException si la información del pedido es inválida.
    - Método buscarPedido(String clienteId, String producto) que lance ClienteNoEncontradoException si el cliente no existe.

5. Utiliza bloques try-catch para manejar las excepciones lanzadas por los métodos del GestionClientes y GestionPedidos. Proporciona mensajes de error adecuados para el usuario.

6. Crea una clase principal que permita al usuario interactuar con el sistema de gestión de clientes y pedidos, y maneje las excepciones adecuadamente.