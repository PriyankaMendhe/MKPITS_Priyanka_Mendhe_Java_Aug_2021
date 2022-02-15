import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main3 {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        vehicle3 v1 = new vehicle3();
        v1.setVname("KIA");

        vehicle3 v2 = new vehicle3();
        v2.setVname("Renault");



        user3 u1 = new user3();
        u1.setUname("Priyanka");
        u1.getVob().add(v1);
        u1.getVob().add(v2);

        // vehicle add user
        //many vehicle to one user mapping
        v1.setUsr3(u1);
        v2.setUsr3(u1);


        entityManager.persist(u1);
        entityManager.persist(v1);
        entityManager.persist(v2);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();


    }
}

