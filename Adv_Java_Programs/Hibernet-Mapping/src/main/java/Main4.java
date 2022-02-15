import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main4 {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        vehicle4 v1 = new vehicle4();
        v1.setVname("KIA");

        vehicle4 v2 = new vehicle4();
        v2.setVname("Renault");



        User4 u1 = new User4();
        u1.setUname("Priyanka");

        User4 u2 = new User4();
        u2.setUname("Rutuja");

        // user to multiple vehicle
        u1.getVob().add(v1);
        u2.getVob().add(v2);

        ////  vehicle to multiple user
        v1.getUsr4().add(u1);
        v1.getUsr4().add(u2);







        entityManager.persist(u1);
        entityManager.persist(v1);
        entityManager.persist(v2);
        entityManager.persist(u2);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();


    }
}


