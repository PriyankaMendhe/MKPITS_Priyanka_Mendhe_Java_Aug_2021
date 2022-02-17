import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();

        TwoWheeler t1 = new TwoWheeler();
        t1.setvName("Activa");
        t1.setStHandle("Handle Type");

        FourWheeler f1 = new FourWheeler();
        f1.setvName("KIA");
        f1.setStStering("Stering Type");

        entityManager.persist(t1);
        entityManager.persist(f1);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


    }
}
