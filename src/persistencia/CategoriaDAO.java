package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.Categoria;

public class CategoriaDAO extends BaseDAO<Categoria> {

    EntityManager entityManager = getEntityManager();

    /**
     * Método booleano que añade las categorías al entityManager
     *
     * @param categoria
     * @return
     */
    @Override
    public boolean insert(Categoria categoria) {
        //            INSERCIÓN
        entityManager.getTransaction().begin();
        if (categoria != null) {
            entityManager.persist(categoria);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método que permite actualizar la categoría en caso necesario mientras no
     * sea diferente de null
     *
     * @param categoria
     * @return verdadero o falso dependiendo de si se puede realizar la
     * actualización o no
     */
    @Override
    public boolean update(Categoria categoria) {
        //       FIND BY ID AND UPDATE
        entityManager.getTransaction().begin();
        Categoria update = entityManager.find(Categoria.class, categoria.getId());
        if (update != null) {
            update.setNombre(categoria.getNombre());
            update.setDescripcion(categoria.getDescripcion());
            update.setProductos(categoria.getProductos());
            entityManager.persist(update);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método que permite remover una categoría siempre y cuando esa categoría
     * se encuentre dentro de la base de datos
     *
     * @param categoria
     * @return verdadero o falso dependiendo de si se pudo remover la categoría
     * o no
     */
    @Override
    public boolean remove(Categoria categoria) {
        //      REMOVE
        entityManager.getTransaction().begin();
        Categoria remove = entityManager.find(Categoria.class, categoria.getId());
        if (remove != null) {
            entityManager.remove(remove);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método que regresa una categoría encontrándola por ID
     *
     * @param id
     * @return La categoría en caso de que se encuentre o null en caso de no ser
     * encontrada
     */
    @Override
    public Categoria findById(Integer id) {
        //       FIND BY ID AND UPDATE
        entityManager.getTransaction().begin();
        Categoria update = entityManager.find(Categoria.class, id);
        if (update != null) {
            entityManager.getTransaction().commit();
            return update;
        }
        entityManager.getTransaction().commit();
        return null;
    }

    /**
     * Método que regresa una categoría de la base de datos buscándola por
     * nombre, si no se ingresa un nombre o este es nulo, se regresa la lista
     * vacía, en caso contrario, muestra la búsqueda
     *
     * @param busqueda
     * @return La categoría buscada
     */
    @Override
    public List<Categoria> find(String busqueda) {
        //          Consulta de datos
        entityManager.getTransaction().begin();
        if (busqueda == null || busqueda.isEmpty()) {

            //se crea el constructor de consultas
            CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
            //se construye el objeto de consultas
            criteria.select(criteria.from(Categoria.class));
            //creación de la consulta lista para ejecutarse
            Query query = entityManager.createQuery(criteria);
            //ejecución del query y retorno de resultados
            List<Categoria> categorias = query.getResultList();
            entityManager.getTransaction().commit();
            return categorias;
        } else {
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery criteria = builder.createQuery(Categoria.class);
            Root root = criteria.from(Categoria.class);
            criteria = criteria.select(root).where(builder.like(root.get("nombre"), "%" + busqueda + "%"));
            TypedQuery query = entityManager.createQuery(criteria);
            List<Categoria> categorias = query.getResultList();
            entityManager.getTransaction().commit();
            return categorias;
        }
    }
}
