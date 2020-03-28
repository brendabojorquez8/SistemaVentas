package objetosNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "rfc", length = 15, nullable = false)
    private String rfc;
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name = "direccion", length = 100, nullable = false)
    private String direccion;
    @Column(name = "telefono1", length = 15, nullable = true)
    private String telefono1;
    @Column(name = "telefono2", length = 15, nullable = true)
    private String telefono2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Venta> ventas;

     /**
     * Constructor por omisión que inicializa el ArrayList ventas
     */
    public Cliente() {
        this.ventas = new ArrayList<>();
    }

    /**
     * Constructor que recibe como parámetro un id de cliente
     * y asigna el valor a idCliente
     * @param idCliente 
     */
    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Constructor que recibe como parámetros un id de cliente, un rfc,
     * un nombre, una dirección, 2 números de teléfono y una Lista. 
     * Inicializa los valores asignando cada uno de ellos
     * @param idCliente
     * @param rfc
     * @param nombre
     * @param direccion
     * @param telefono1
     * @param telefono2
     * @param ventas 
     */
    public Cliente(Integer idCliente, String rfc, String nombre, String direccion, String telefono1, String telefono2, List<Venta> ventas) {
        this.idCliente = idCliente;
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.ventas = ventas;
    }

    /**
     * Método que retorna el id del cliente
     * @return idCliente
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Método que asigna el id del cliente recibiendo como parámetro un
     * Integer
     * @param idCliente
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Método que retorna el rfc del cliente
     * @return rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Método que asigna el rfc del cliente recibiendo como parámetro un
     * Integer
     * @param rfc
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
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
     * Método que retorna la dirección
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que asigna la dirección recibiendo como parámetro un String
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que retorna el teléfono 1
     * @return telefono1
     */
    public String getTelefono1() {
        return (telefono1 != null ? telefono1 : "");
    }

    /**
     * Método que asigna el teléfono 1 recibiendo como parámetro un String
     * @param telefono1 
     */
    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    /**
     * Método que retorna el teléfono 2
     * @return telefono2
     */
    public String getTelefono2() {
        return (telefono2 != null ? telefono2 : "");
    }

    /**
     * Método que asigna el teléfono 2 recibiendo como parámetro un String
     * @param telefono2 
     */
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    /**
     * Método que regresa la lista de ventas
     * @return ventas
     */
    public List<Venta> getVentas() {
        return ventas;
    }

    /**
     * Método que asigna los valores de la lista de ventas recibiendo como
     * parámetro una List
     * @param ventas 
     */
    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    /**
     * Método que añade una venta a la lista ventas
     * @param venta 
     */
    public void addVenta(Venta venta) {
        venta.setCliente(this);
        this.ventas.add(venta);
    }

    /**
     * Método que retorna un arreglo que contiene todos los datos en un 
     * ArrayList
     * @return Array
     */
    public Object[] toArray() {
        return new Object[]{
            this.getIdCliente(),
            this.getRfc(),
            this.getNombre(),
            this.getDireccion(),
            this.getTelefono1(),
            this.getTelefono2()
        };
    }

    /**
     * Método que asigna el hashCode a los objetos
     * @return hashCode
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
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
        // TODO: Warning - this method won't work in the case the id_cliente fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
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
