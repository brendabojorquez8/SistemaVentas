
package control;

import java.util.List;
import objetosNegocio.*;
import persistencia.*;

/**
 *
 * @author ProyectoBD_02_204722_204360  
 */
public class ControlCategoria {
    CategoriaDAO categoria= new CategoriaDAO();
    
    
    public boolean guardarCategoria(Categoria categoria) {
        return this.categoria.insert(categoria);
    }

    public boolean actualizarCategoria(Categoria categoria ) {
        return this.categoria.update(categoria);
    }

    public boolean eliminarCategoria(Categoria categoria) {
        return this.categoria.remove(categoria);
    }

    public Categoria consultarPorIdCategoria(Integer id) {
        return this.categoria.findById(id);
    }

    public List<Categoria> consultarCategorias(String busqueda) {
        return this.categoria.find(busqueda);
    }
}
