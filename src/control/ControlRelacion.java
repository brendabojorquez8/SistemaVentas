
package control;

import java.util.List;
import objetosNegocio.RelacionProductoVenta;
import persistencia.RelacionDAO;

/**
 *
 * @author ProyectoBD_02_204722_204360
 */
public class ControlRelacion {
    RelacionDAO relacion=new RelacionDAO();
    
    public boolean guardarVenta(RelacionProductoVenta relacion) {
        return this.relacion.insert(relacion);
    }

    public boolean actualizarVenta(RelacionProductoVenta relacion ) {
        return this.relacion.update(relacion);
    }

    public boolean eliminaVenta(RelacionProductoVenta relacion) {
        return this.relacion.remove(relacion);
    }

    public RelacionProductoVenta consultarPorIdVenta(Integer id) {
        return this.relacion.findById(id);
    }

    public List<RelacionProductoVenta> consultarVentas(String busqueda) {
        return this.relacion.find(busqueda);
    }
}
