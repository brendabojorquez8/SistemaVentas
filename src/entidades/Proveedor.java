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
@Table(name = "proveedores")
public class Proveedor extends EntityBase implements Serializable {

    @Column(name = "rfc", length = 15, nullable = false)
    private String rfc;
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name = "direccion", length = 100, nullable = false)
    private String direccion;
    @Column(name = "telefono", length = 20, nullable = true)
    private String telefono;
    @Column(name = "pagina_web", length = 500, nullable = true)
    private String paginaWeb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedor")
    private List<Producto> productos;

    /**
     * Constructor por omisión que inicializa el ArrayList productos
     */
    public Proveedor() {
        this.productos = new ArrayList<>();
    }

    /**
     * Constructor que recibe como parámetro un id de proveedor y asigna el
     * valor a idProveedor
     *
     * @param idProveedor
     */
    public Proveedor(Integer idProveedor) {
        this.setId(idProveedor);
    }

    /**
     * Constructor que recibe como parámetros el id del proveedor, su rfc, su
     * nombre, una dirección, su teléfono, página web y una lista.
     *
     * @param idProveedor
     * @param rfc
     * @param nombre
     * @param direccion
     * @param telefono
     * @param paginaWeb
     * @param productos
     */
    public Proveedor(Integer idProveedor, String rfc, String nombre, String direccion, String telefono, String paginaWeb, List<Producto> productos) {
        this.setId(idProveedor);
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;
        this.productos = productos;
    }

    /**
     * Método que retorna el rfc del cliente
     *
     * @return rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Método que asigna el rfc del cliente recibiendo como parámetro un Integer
     *
     * @param rfc
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
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
     * Método que retorna la dirección
     *
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que asigna la dirección recibiendo como parámetro un String
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que retorna el teléfono, en caso de que este no exista, el valor
     * regresado es uno vacío
     *
     * @return telefono
     */
    public String getTelefono() {
        return (telefono != null ? telefono : "");
    }

    /**
     * Método que asigna el teléfono del proveedor recibiendo como parámetro un
     * String
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método que retorna la página web del proveedor, en caso de que esta no
     * exista, el valor regresado es uno vacío
     *
     * @return páginaWeb
     */
    public String getPaginaWeb() {
        return (paginaWeb != null ? paginaWeb : "");
    }

    /**
     * Método que asigna la página web del proveedor recibiendo como parámetro
     * un String
     *
     * @param paginaWeb
     */
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
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
        producto.setProveedor(this);
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
            this.getRfc(),
            this.getNombre(),
            this.getDireccion(),
            this.getTelefono(),
            this.getPaginaWeb()
        };
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
