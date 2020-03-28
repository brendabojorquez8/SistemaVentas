
package control;

import java.util.List;
import objetosNegocio.Venta;
import persistencia.VentaDAO;

/**
 *
 * @author ProyectoBD_02_204722_204360
 */
public class ControlVenta {
    VentaDAO venta=new VentaDAO();
    
    public boolean guardarVenta(Venta venta) {
        return this.venta.insert(venta);
    }

    public boolean actualizarVenta(Venta venta ) {
        return this.venta.update(venta);
    }

    public boolean eliminaVenta(Venta venta) {
        return this.venta.remove(venta);
    }

    public Venta consultarPorIdVenta(Integer id) {
        return this.venta.findById(id);
    }

    public List<Venta> consultarVentas(String busqueda) {
        return this.venta.find(busqueda);
    }
}
