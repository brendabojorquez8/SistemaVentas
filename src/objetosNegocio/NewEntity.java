/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class NewEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * Método que retorna el id
     * @return id
     */
    public Integer getId() {
        return id;
    }
    
    /**
     * Método que asigna el valor del id recibiendo como parámetro un Integer
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Método que asigna el hashCode
     * @return hashCode
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * Método que compara dos objetos y comprueba que no sean iguales, si
     * los objetos son iguales, regresa verdadero, si no, regresa falso
     * @param object
     * @return true or false
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NewEntity)) {
            return false;
        }
        NewEntity other = (NewEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Método que retorna un String con el id
     * @return id
     */
    @Override
    public String toString() {
        return "objetosNegocio.NewEntity[ id=" + id + " ]";
    }
    
}
