package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Tobias Jacobsen
 */
public class Clean {
    
    public static void cleanAllTables() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createNativeQuery("SET FOREIGN_KEY_CHECKS=0").executeUpdate();
        em.createNativeQuery("truncate table employee").executeUpdate();
        em.createNativeQuery("truncate table grade").executeUpdate();
        em.createNativeQuery("truncate table person").executeUpdate();
        em.createNativeQuery("truncate table phdstudent").executeUpdate();
        em.createNativeQuery("truncate table student").executeUpdate();
        em.getTransaction().commit();
        em.close();
    }
    
        
    
}
