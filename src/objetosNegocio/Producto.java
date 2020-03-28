/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "productos")
public class Producto implements Serializable {

 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name = "precio_actual", nullable = false)
    private Float precioActual;
    @Column(name = "stock", nullable = false)
    private Integer stock;
    @ManyToOne(optional = false, targetEntity = Proveedor.class)
    @JoinColumn (name="id_proveedor", nullable = false)
    private Proveedor proveedor;
    @ManyToOne(optional = false, targetEntity = Categoria.class)
    @JoinColumn (name="id_categoria", nullable = false)
    private Categoria categoria;
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<RelacionProductoVenta> ventas;

    /**
     * Constructor por omisión que inicializa el ArrayList ventas
     */
    public Producto() {
        this.ventas = new ArrayList<>();
    }

    /**
     * Constructor que recibe como parámetro un id de producto
     * y asigna el valor a idProducto
     * @param idProducto 
     */
    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Constructor que recibe como parámetros un id de producto, un nombre,
     * un precio actual, si está en stock, el proveedor, una categoría y una Lista. 
     * Inicializa los valores asignando cada uno de ellos
     * @param idProducto
     * @param nombre
     * @param precioActual
     * @param stock
     * @param proveedor
     * @param categoria
     * @param ventas 
     */
    public Producto(Integer idProducto, String nombre, Float precioActual, Integer stock, Proveedor proveedor, Categoria categoria, List<RelacionProductoVenta> ventas) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stock = stock;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.ventas = ventas;
    }
    
 
    /**
     * Método que retorna el id del producto
     * @return idProducto
     */
    public Integer getIdProducto() {
        return idProducto;
    }

    /**
     * Método que asigna el id del producuto recibiendo como parámetro un
     * Integer
     * @param idProducto
     */
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Método que retorna el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que asigna el nombre recibiendo como parámetro un String
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que retorna el precio actual del producto
     * @return precioActual
     */
    public Float getPrecioActual() {
        return precioActual;
    }

    /**
     * Método que asigna el precio actual recibiendo como parámetro un Float
     * @param precioActual 
     */
    public void setPrecioActual(Float precioActual) {
        this.precioActual = precioActual;
    }

    /**
     * Método que retorna la cantidad que hay en stock de un producto
     * @return stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * Método que asigna la cantidad en stock del producto recibiendo como 
     * parámetro un Integer
     * @param stock 
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * Método que retorna el proveedor del producto
     * @return proveedor
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * Método que asigna el proveedor del producto recibiendo como parámetro 
     * un Proveedor
     * @param proveedor 
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * Método que retorna la categoría de un producto
     * @return categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Método que asigna la categoría recibiendo como parámetro una Categoría
     * @param categoria 
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Método que regresa la lista de ventas
     * @return ventas
     */
    public List<RelacionProductoVenta> getVentas() {
        return ventas;
    }

    /**
     * Método que asigna los valores de la lista de ventas recibiendo como
     * parámetro una List
     * @param ventas 
     */
    public void setVentas(List<RelacionProductoVenta> ventas) {
        this.ventas = ventas;
    }
    
    /**
     * Método que retorna un arreglo que contiene todos los datos en el 
     * ArrayList
     * @return Array
     */
        public Object[] toArray(){
        return new Object[]{
            this.idProducto,
            this.nombre,
            this.precioActual,
            this.stock,
            this.categoria.getIdCategoria(),
            this.proveedor.getIdProveedor()
        };
    }
        
        /**
     * Método que retorna un arreglo que contiene el  id del producto,
     * el nombre, su precio actual y la cantidad en stock.
     * ArrayList
     * @return Array
     */
        public Object[] toArray2(){
            return new Object[]{
            this.idProducto,
            this.nombre,
            this.precioActual,
            this.stock};
        }


    /**
     * Método que asigna el hashCode a los objetos
     * @return hashCode
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
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
        // TODO: Warning - this method won't work in the case the id_producto fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
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
        return this.getNombre();
    }


    
}
