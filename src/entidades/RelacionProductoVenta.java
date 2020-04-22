package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rel_productos_ventas")
public class RelacionProductoVenta extends EntityBase implements Serializable {

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
     *
     * @param id
     */
    public RelacionProductoVenta(Integer id) {
        this.setId(id);
    }

    /**
     * Constructor que inicializa todos los valores recibidos por los parámetros
     *
     * @param venta
     * @param producto
     * @param precio
     * @param cantidad
     * @param montoTotal
     */
    public RelacionProductoVenta(Venta venta, Producto producto, Float precio, Integer cantidad, Float montoTotal) {

        this.venta = venta;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.montoTotal = montoTotal;
    }

    /**
     * Método que retorna la venta
     *
     * @return venta
     */
    public Venta getVenta() {
        return venta;
    }

    /**
     * Método que asigna la venta
     *
     * @param venta
     */
    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    /**
     * Método que retorna el producto
     *
     * @return producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Método que asigna el producto
     *
     * @param producto
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Método que retorna el precio del producto
     *
     * @return precio
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * Método que asigna el precio
     *
     * @param precio
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * Método que retorna la cantidad de productos
     *
     * @return cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Método que asigna la cantidad
     *
     * @param cantidad
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Método que retorna el monto total
     *
     * @return montoTotal
     */
    public Float getMontoTotal() {
        return montoTotal;
    }

    /**
     * Método que asigna el monto total
     *
     * @param montoTotal
     */
    public void setMontoTotal(Float montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * Método que retorna un arreglo que contiene todos los datos en un
     * ArrayList
     *
     * @return Array
     */
    public Object[] toArrayProducto() {
        return new Object[]{
            this.producto.getId(),
            this.producto.getNombre(),
            this.producto.getPrecioActual(),
            this.cantidad,
            this.montoTotal
        };
    }

}
