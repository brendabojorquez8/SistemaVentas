package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.RelacionProductoVenta;

public class RelacionDAO extends BaseDAO<RelacionProductoVenta> {

    EntityManager entityManager = getEntityManager();

    @Override
    public boolean insert(RelacionProductoVenta relacion) {
        //            INSERCIÓN
        entityManager.getTransaction().begin();
        if (relacion != null) {
            entityManager.persist(relacion);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(RelacionProductoVenta relacion) {
        //       FIND BY ID AND UPDATE
        entityManager.getTransaction().begin();
        RelacionProductoVenta update = entityManager.find(RelacionProductoVenta.class, relacion.getId());
        if (update != null) {
            update.setCantidad(relacion.getCantidad());
            update.setMontoTotal(relacion.getMontoTotal());
            update.setPrecio(relacion.getPrecio());
            update.setProducto(relacion.getProducto());
            update.setVenta(relacion.getVenta());
            entityManager.persist(update);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean remove(RelacionProductoVenta relacion) {
        //      REMOVE
        entityManager.getTransaction().begin();
        RelacionProductoVenta remove = entityManager.find(RelacionProductoVenta.class, relacion.getId());
        if (remove != null) {
            entityManager.remove(remove);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public RelacionProductoVenta findById(Integer id) {
        //       FIND BY ID AND UPDATE
        entityManager.getTransaction().begin();

        RelacionProductoVenta update = entityManager.find(RelacionProductoVenta.class, id);
        if (update != null) {
            entityManager.getTransaction().commit();
            return update;

        }
        entityManager.getTransaction().commit();
        return null;
    }

    @Override
    public List<RelacionProductoVenta> find(String busqueda) {
        //          Consulta de datos
        entityManager.getTransaction().begin();
        if (busqueda == null || busqueda.isEmpty()) {

            //se crea el constructor de consultas
            CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
            //se construye el objeto de consultas
            criteria.select(criteria.from(RelacionProductoVenta.class));
            //creación de la consulta lista para ejecutarse
            Query query = entityManager.createQuery(criteria);
            //ejecución del query y retorno de resultados
            List<RelacionProductoVenta> relaciones = query.getResultList();
            entityManager.getTransaction().commit();
            return relaciones;
        } else {
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery criteria = builder.createQuery(RelacionProductoVenta.class);
            Root root = criteria.from(RelacionProductoVenta.class);
            criteria = criteria.select(root).where(builder.like(root.get("nombre"), "%" + busqueda + "%"));
            TypedQuery query = entityManager.createQuery(criteria);
            List<RelacionProductoVenta> relaciones = query.getResultList();
            entityManager.getTransaction().commit();
            return relaciones;
        }
    }

}
