package SEP2.W3.datasource;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MariaDBConnector {
    private static EntityManagerFactory entityManagerFactory = null;
    private static EntityManager entityManager = null;

    public static EntityManager getInstance() {
        if (entityManager == null) {
            if (entityManagerFactory == null) {
                entityManagerFactory = Persistence.createEntityManagerFactory("LocalizedDB");
            }
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }
}
