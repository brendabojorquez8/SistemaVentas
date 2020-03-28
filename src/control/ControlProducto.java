
package control;

import java.util.List;
import javax.swing.JTable;
import objetosNegocio.Producto;
import persistencia.ProductoDAO;

/**
 *
 * @author ProyectoBD_02_204722_204360
 */
public class ControlProducto {
    ProductoDAO producto=new ProductoDAO();
    
    
    public boolean guardarProducto(Producto producto) {
        return this.producto.insert(producto);
    }

    public boolean actualizarProducto(Producto producto) {
        return this.producto.update(producto);
    }

    public boolean eliminarProducto(Producto producto) {
        return this.producto.remove(producto);
    }

    public Producto consultarPorIdProducto(Integer id) {
        return this.producto.findById(id);
    }

    public List<Producto> consultarProductos(String busqueda) {
        return this.producto.find(busqueda);
    }
    

}
