import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        vehicle1 v1 = new vehicle1();
        v1.setVname("KIA");

        user1 u1 = new user1();
        u1.setUname("Priyanka");
        u1.setVeh(v1);

        entityManager.persist(u1);
        entityManager.persist(v1);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();


    }
}
