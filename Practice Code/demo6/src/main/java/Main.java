import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("default");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Transaction started");

        entityManager.getTransaction().begin();

        Department d1 = new Department();

        d1.setName("JAVA");

        entityManager.persist(d1);

       entityManager.getTransaction().commit();

       entityManager.close();
       entityManagerFactory.close();


    }
}
