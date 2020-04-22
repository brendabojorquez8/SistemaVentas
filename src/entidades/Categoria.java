package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria extends EntityBase implements Serializable {

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name = "descripcion", length = 100, nullable = false)
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    private List<Producto> productos;

    /**
     * Constructor por omisión que inicializa el ArrayList productos
     */
    public Categoria() {
        this.productos = new ArrayList<>();
    }

    /**
     * Constructor que recibe como parámetro un id de categoría, inicializa el
     * ArrayList productos y asigna el valor a idCategoria
     *
     * @param idCategoria
     */
    public Categoria(Integer idCategoria) {
        this.productos = new ArrayList<>();
        this.setId(idCategoria);
    }

    /**
     * Constructor que recibe como parámetros un id de categoría, un nombre, una
     * descripción y una Lista. Inicializa los valores asignando cada uno de
     * ellos
     *
     * @param idCategoria
     * @param nombre
     * @param descripcion
     * @param productos
     */
    public Categoria(Integer idCategoria, String nombre, String descripcion, List<Producto> productos) {
        this.setId(idCategoria);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.productos = new ArrayList<>();
        this.productos = productos;
    }

    /**
     * Método que retorna el nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que asigna el nombre recibiendo como parámetro un String
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que retorna la descripción
     *
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método que asigna la descripción recibiendo como parámetro un String
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método que regresa la lista de productos
     *
     * @return productos
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Método que asigna los valores de la lista de productos recibiendo como
     * parámetro una List
     *
     * @param productos
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    /**
     * Método que añade un producto a la lista productos
     *
     * @param producto
     */
    public void addProducto(Producto producto) {
        producto.setCategoria(this);
        this.productos.add(producto);
    }

    /**
     * Método que retorna un arreglo que contiene todos los datos en un
     * ArrayList
     *
     * @return Array
     */
    public Object[] toArray() {
        return new Object[]{
            this.getId(),
            this.getNombre(),
            this.getDescripcion(),};
    }

    /**
     * Método que retorna un String con el nombre
     *
     * @return Nombre
     */
    @Override
    public String toString() {
        return this.getNombre();
    }

}
