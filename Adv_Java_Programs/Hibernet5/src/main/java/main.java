import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        Address a1 = new Address();
        a1.setCity("Nagpur");
        a1.setPincode(440030);
        a1.setState("MH");

        emp e1 = new emp();
        e1.setName("Priyanka");
        e1.setEmail("xvs@gmail.com");
        e1.setAdd(a1);

        Address a2 = new Address();
        a1.setCity("Mumbai");
        a1.setPincode(4400304);
        a1.setState("MH2");

        emp e2 = new emp();
        e1.setName("Priyanka");
        e1.setEmail("xvs@gmail.com");
        e1.setAdd(a2);




       System.out.println("Saving Employee to Database");

        entityManager.persist(e1);
        entityManager.persist(e2);
        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();


    }
}
