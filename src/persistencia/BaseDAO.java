package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class BaseDAO<T> {

    private EntityManagerFactory entityManager;

    /**
     * Constructor por omisión que inicializa el entity manager que te permite
     * hacer la conexión a la base de datos.
     */
    public BaseDAO() {

        this.entityManager = Persistence.createEntityManagerFactory("VentasJPAPU");

    }

    /**
     * Regresa el entityManager
     *
     * @return EntityManager
     */
    protected EntityManager getEntityManager() {
        return this.entityManager.createEntityManager();
    }

    public abstract boolean insert(T entidad);

    public abstract boolean update(T entidad);

    public abstract boolean remove(T entidad);

    public abstract List<T> find(String busqueda);

    public abstract T findById(Integer id);

}
