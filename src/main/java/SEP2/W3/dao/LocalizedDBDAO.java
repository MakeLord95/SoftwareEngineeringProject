package SEP2.W3.dao;

import SEP2.W3.datasource.MariaDBConnector;
import jakarta.persistence.EntityManager;

public class LocalizedDBDAO {
    private static final EntityManager entityManager = MariaDBConnector.getInstance();

    public static void saveToTable(String table, String firstName, String lastName, String email) {
        entityManager.getTransaction().begin();
        switch (table) {
            case "employee_en" ->
                    entityManager.createNativeQuery("INSERT INTO employee_en (first_name, last_name, email) VALUES (?, ?, ?)")
                            .setParameter(1, firstName)
                            .setParameter(2, lastName)
                            .setParameter(3, email)
                            .executeUpdate();
            case "employee_ja" ->
                    entityManager.createNativeQuery("INSERT INTO employee_ja (first_name, last_name, email) VALUES (?, ?, ?)")
                            .setParameter(1, firstName)
                            .setParameter(2, lastName)
                            .setParameter(3, email)
                            .executeUpdate();
            case "employee_fa" ->
                    entityManager.createNativeQuery("INSERT INTO employee_fa (first_name, last_name, email) VALUES (?, ?, ?)")
                            .setParameter(1, firstName)
                            .setParameter(2, lastName)
                            .setParameter(3, email)
                            .executeUpdate();
            default -> throw new IllegalArgumentException("Invalid table name: " + table);
        }

        entityManager.getTransaction().commit();
    }
}
