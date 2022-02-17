import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main5 {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();

        veh5 v1 = new veh5();
        v1.setVname("KIA");

        veh5 v2 = new veh5();
        v2.setVname("DUSTER");



       user5 u1 = new user5();
       u1.setName("Priyanka");
       u1.getVob().add(v1);
       u1.getVob().add(v2);

       entityManager.persist(u1);


        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
