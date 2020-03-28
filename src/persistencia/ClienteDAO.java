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
import objetosNegocio.Cliente;

/**
 *
 * @author ProyectoBD_02_204722_204360
 */
public class ClienteDAO extends BaseDAO<Cliente> {

    EntityManager entityManager = getEntityManager();
    @Override
    public boolean insert(Cliente cliente) {
        //            INSERCIÓN
        entityManager.getTransaction().begin();
        if (cliente != null) {
            entityManager.persist(cliente);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(Cliente cliente) {
        //       FIND BY ID AND UPDATE
        entityManager.getTransaction().begin();
        Cliente update = entityManager.find(Cliente.class, cliente.getIdCliente());
        if (update != null) {
            update.setNombre(cliente.getNombre());
            update.setDireccion(cliente.getDireccion());
            update.setRfc(cliente.getRfc());
            update.setTelefono1(cliente.getTelefono1());
            update.setTelefono2(cliente.getTelefono2());
            update.setVentas(cliente.getVentas());
            entityManager.persist(update);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean remove(Cliente cliente) {
        //      REMOVE
        entityManager.getTransaction().begin();
        Cliente remove = entityManager.find(Cliente.class, cliente.getIdCliente());
        if (remove != null) {
            entityManager.remove(remove);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Cliente findById(Integer id) {
        //       FIND BY ID AND UPDATE
        entityManager.getTransaction().begin();

        Cliente find = entityManager.find(Cliente.class, id);
        if (find != null) {
            entityManager.getTransaction().commit();
            return find;
        }
        entityManager.getTransaction().commit();
        return null;
    }

    @Override
    public List<Cliente> find(String busqueda) {
        //          Consulta de datos
        entityManager.getTransaction().begin();
        if (busqueda == null || busqueda.isEmpty()) {

            //se crea el constructor de consultas
            CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
            //se construye el objeto de consultas
            criteria.select(criteria.from(Cliente.class));
            //creación de la consulta lista para ejecutarse
            Query query = entityManager.createQuery(criteria);
            //ejecución del query y retorno de resultados
            List<Cliente> clientes = query.getResultList();
            entityManager.getTransaction().commit();
            return clientes;
        } else {
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery criteria = builder.createQuery(Cliente.class);
            Root root = criteria.from(Cliente.class);
            criteria = criteria.select(root).where(builder.like(root.get("nombre"), "%"+busqueda+"%"));
            TypedQuery query = entityManager.createQuery(criteria);
            List<Cliente> clientes = query.getResultList();
            entityManager.getTransaction().commit();
            return clientes;
        }

    }

}
