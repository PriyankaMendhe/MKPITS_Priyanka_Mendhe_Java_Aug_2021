import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        Address ad1 = new Address();
        ad1.setPincode(123456);
        ad1.setCity("NGP");
        ad1.setState("MH");

        emp e1 = new emp();
        e1.setAdr(ad1);
        e1.setEmail("xyz@ad");
        e1.setEname("priyanka");

        Address ad2 = new Address();
        ad2.setState("MH2");
        ad2.setCity("MUMBai");
        ad2.setPincode(789456);

        e1.setEname("p1");
        e1.setAdr(ad2);
        e1.setEmail("abc@hj");


        System.out.println("Saving Employee to Database");

        entityManager.persist(e1);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();





    }
}
