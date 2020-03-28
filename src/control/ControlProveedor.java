
package control;

import java.util.List;
import objetosNegocio.Proveedor;
import persistencia.ProveedorDAO;

/**
 *
 * @author ProyectoBD_02_204722_204360
 */
public class ControlProveedor {
    ProveedorDAO proveedor=new ProveedorDAO();
    
    public boolean guardarProveedor(Proveedor proveedor) {
        return this.proveedor.insert(proveedor);
    }

    public boolean actualizarProveedor(Proveedor proveedor) {
        return this.proveedor.update(proveedor);
    }

    public boolean eliminarProveedor(Proveedor proveedor) {
        return this.proveedor.remove(proveedor);
    }

    public Proveedor consultarPorIdProveedor(Integer id) {
        return this.proveedor.findById(id);
    }

    public List<Proveedor> consultarProveedores(String busqueda) {
        return this.proveedor.find(busqueda);
    }
}
