package objetosNegocio;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ProyectoBD_02_204722_204360
 */
@Entity
@Table(name = "ventas")
public class Venta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVenta;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha", nullable = false)
    private GregorianCalendar fecha;
    @ManyToOne(optional = false, targetEntity = Cliente.class)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;
    @Column(name = "descuento", nullable = false)
    private Float descuento;
    @Column(name = "montofinal", nullable = false)
    private Float montofinal;
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private List<RelacionProductoVenta> productos;

    /**
     * Constructor por omisión que inicializa el ArrayList productos
     */
    public Venta() {
        this.productos = new ArrayList<>();
    }

    /**
     * Constructor que recibe como parámetro un id de venta y asigna el 
     * valor a idVenta
     * @param idVenta 
     */
    public Venta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    /**
     * Constructor que inicializa los valores de sus parámetros
     * @param idVenta
     * @param descuento
     * @param fecha
     * @param montofinal
     * @param cliente
     * @param productos 
     */
    public Venta(Integer idVenta, Float descuento, GregorianCalendar fecha, Float montofinal, Cliente cliente, List<RelacionProductoVenta> productos) {
        this.idVenta = idVenta;
        this.descuento = descuento;
        this.fecha = fecha;
        this.montofinal = montofinal;
        this.cliente = cliente;
        this.productos = productos;
    }
    
    

    /**
     * Método que retorna el id de la venta
     * @return idVenta
     */
    public Integer getIdVenta() {
        return idVenta;
    }

    /**
     * Método que asigna el id de la venta
     * @param idVenta 
     */
    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    /**
     * Método que retorna el descuento
     * @return descuento
     */
    public Float getDescuento() {
        return descuento;
    }

    /**
     * Método que asigna el descuento
     * @param descuento 
     */
    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    /**
     * Método que retorna el monto final
     * @return 
     */
    public Float getMontofinal() {
        return montofinal;
    }

    /**
     * Método que asigna el monto final
     * @param montofinal 
     */
    public void setMontofinal(Float montofinal) {
        this.montofinal = montofinal;
    }

    /**
     * Método que retorna al cliente
     * @return cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Método que asigna al cliente
     * @param cliente 
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Método que retorna la fecha de la venta
     * @return fecha
     */
    public GregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Método que asigna la fecha de la venta
     * @param fecha 
     */
    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    /**
     * Método que regresa la lista de productos
     * @return productos
     */
    public List<RelacionProductoVenta> getProductos() {
        return productos;
    }

    /**
     * Método que asigna los valores de la lista de productos recibiendo como
     * parámetro una List
     * @param productos 
     */
    public void setProductos(List<RelacionProductoVenta> productos) {
        this.productos = productos;
    }
    
    /**
     * Método que añade un productoRelacionVenta a la lista productos
     * @param RelacionProductoVenta
     */
     public void addProducto(RelacionProductoVenta RelacionProductoVenta) {
        this.productos.add(RelacionProductoVenta);
    }
     
     /**
     * Método que retorna un arreglo que contiene todos los datos en un 
     * ArrayList
     * @return Array
     */
     public Object[] toArray() {
         SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        return new Object[]{
            this.getIdVenta(),
            this.getCliente().toString(),
            sf.format(this.getFecha().getTime()),
            ((this.getDescuento()/100)+1)*this.getMontofinal(),
            this.getDescuento(),
            this.getMontofinal()
        };
    }

    
    /**
     * Método que asigna el hashCode a los objetos
     * @return hashCode
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenta != null ? idVenta.hashCode() : 0);
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
   
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
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
        return "objetosNegocio.Venta[ id=" + idVenta + " ]";
    }

}
