package control;

import java.util.List;
import entidades.Cliente;
import persistencia.ClienteDAO;

public class ControlCliente {

    ClienteDAO cliente = new ClienteDAO();

    public boolean guardarCliente(Cliente cliente) {
        return this.cliente.insert(cliente);
    }

    public boolean actualizarCliente(Cliente cliente) {
        return this.cliente.update(cliente);
    }

    public boolean eliminarCliente(Cliente cliente) {
        return this.cliente.remove(cliente);
    }

    public Cliente consultarPorIdCliente(Integer id) {
        return this.cliente.findById(id);
    }

    public List<Cliente> consultarClientes(String busqueda) {
        return this.cliente.find(busqueda);
    }
}
