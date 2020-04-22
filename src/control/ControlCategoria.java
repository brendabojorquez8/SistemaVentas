package control;

import entidades.Categoria;
import java.util.List;
import persistencia.*;

public class ControlCategoria {

    CategoriaDAO categoria = new CategoriaDAO();

    public boolean guardarCategoria(Categoria categoria) {
        return this.categoria.insert(categoria);
    }

    public boolean actualizarCategoria(Categoria categoria) {
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
