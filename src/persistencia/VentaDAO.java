/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import objetosNegocio.Venta;

/**
 *
 * @author ProyectoBD_02_204722_204360
 */
public class VentaDAO extends BaseDAO<Venta>{
    
    EntityManager entityManager = getEntityManager();

    @Override
    public boolean insert(Venta venta) {
       //            INSERCIÓN
        entityManager.getTransaction().begin();
        if (venta != null) {
            entityManager.persist(venta);
        } else {
            return false;
        }
         entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(Venta venta) {
        //       FIND BY ID AND UPDATE
        entityManager.getTransaction().begin();
        Venta update = entityManager.find(Venta.class, venta.getIdVenta());
        if (update != null) {
            update.setCliente(venta.getCliente());
            update.setDescuento(venta.getDescuento());
            update.setFecha(venta.getFecha());
            update.setMontofinal(venta.getMontofinal());
            entityManager.persist(update);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean remove(Venta venta) {
        //      REMOVE
        entityManager.getTransaction().begin();
        Venta remove = entityManager.find(Venta.class, venta.getIdVenta());
        if (remove != null) {
            entityManager.remove(remove);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Venta findById(Integer id) {
        //       FIND BY ID AND UPDATE
        entityManager.getTransaction().begin();
        Venta find = entityManager.find(Venta.class, id);
        if (find != null) {
             entityManager.getTransaction().commit();
            return find;
        } 
       entityManager.getTransaction().commit();
       return null;
    }

    @Override
    public List<Venta> find(String busqueda) {//falta buscar
        //          Consulta de datos
        entityManager.getTransaction().begin();
     

            //se crea el constructor de consultas
            CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
            //se construye el objeto de consultas
            criteria.select(criteria.from(Venta.class));
            //creación de la consulta lista para ejecutarse
            Query query = entityManager.createQuery(criteria);
            //ejecución del query y retorno de resultados
            List<Venta> ventas = query.getResultList();
            entityManager.getTransaction().commit();
            return ventas;
        
    }
}
