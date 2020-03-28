
package objetosNegocio;

import control.ControlProducto;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ProyectoBD_02_204722_204360
 */
@Entity
@Table(name = "rel_productos_ventas")
public class RelacionProductoVenta implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;
    @ManyToOne
    @JoinColumn(name = "id_venta", nullable = false)
    private Venta venta;
    @Column(name = "precio", nullable = false)
    private Float precio;
    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;
    @Column(name = "monto_total", nullable = false)
    private Float montoTotal;

    public RelacionProductoVenta() {
    }

    /**
     * Constructor que inicializa el id de la relación producto-venta
     * @param id 
     */
    public RelacionProductoVenta(Integer id) {
        this.id = id;
    }

    /**
     * Constructor que inicializa todos los valores recibidos por los 
     * parámetros
     * @param venta
     * @param producto
     * @param precio
     * @param cantidad
     * @param montoTotal 
     */
    public RelacionProductoVenta( Venta venta, Producto producto, Float precio, Integer cantidad, Float montoTotal) {
 
        this.venta = venta;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.montoTotal = montoTotal;
    }

    /**
     * Método que retorna el id de la relación
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Método que asigna el valor del id de la relación
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Método que retorna la venta
     * @return venta
     */
    public Venta getVenta() {
        return venta;
    }

    /**
     * Método que asigna la venta
     * @param venta 
     */
    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    /**
     * Método que retorna el producto
     * @return producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Método que asigna el producto
     * @param producto 
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Método que retorna el precio del producto
     * @return precio
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * Método que asigna el precio
     * @param precio 
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * Método que retorna la cantidad de productos
     * @return cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Método que asigna la cantidad
     * @param cantidad 
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Método que retorna el monto total
     * @return montoTotal
     */
    public Float getMontoTotal() {
        return montoTotal;
    }

    /**
     * Método que asigna el monto total
     * @param montoTotal 
     */
    public void setMontoTotal(Float montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    /**
     * Método que retorna un arreglo que contiene todos los datos en un 
     * ArrayList
     * @return Array
     */
    public Object[] toArrayProducto(){
        return new Object[]{
            this.producto.getIdProducto(),
            this.producto.getNombre(),
            this.producto.getPrecioActual(),
            this.cantidad,
            this.montoTotal
        };
    }

    /**
     * Método que asigna el hashCode a los objetos
     * @return hashCode
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * Método que comprueba que un objeto sea diferente de otro, si el objeto 
     * es el mismo, retorna verdadero, en caso contrario retorna falso
     * @param object
     * @return true or false
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelacionProductoVenta)) {
            return false;
        }
        RelacionProductoVenta other = (RelacionProductoVenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Método que retorna un String con el nombre
     * @return Nombre
     */
    @Override
    public String toString() {
        return "objetosNegocio.RelacionProductoVenta[ id=" + id + " ]";
    }

}
