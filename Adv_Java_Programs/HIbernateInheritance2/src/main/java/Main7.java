import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main7 {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();

        Vehicle7 v1 = new Vehicle7();
        v1.setVname("CAR");


        twoWheelar1  t1 = new twoWheelar1();
        t1.setStrHandle("Handle Type");
        t1.setVname("Activa");

       fourWheller1 f1 =new fourWheller1();
       f1.setStrwheel("Stering wheel type");
       f1.setVname("KIA");

        entityManager.persist(v1);
        entityManager.persist(t1);
        entityManager.persist(f1);


        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
