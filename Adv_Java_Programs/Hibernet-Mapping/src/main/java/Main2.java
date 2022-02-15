import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main2 {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        vehicle2 v1 = new vehicle2();
        v1.setVname("KIA");

        vehicle2 v2 = new vehicle2();
        v2.setVname("Renault");



        user2 u1 = new user2();
        u1.setUname("Priyanka");
        u1.getVob().add(v1);
        u1.getVob().add(v2);


        entityManager.persist(u1);
        entityManager.persist(v1);
        entityManager.persist(v2);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();


    }
}
