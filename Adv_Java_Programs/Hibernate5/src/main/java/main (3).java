import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();

        Book ob = new Book();
        ob.setBid("b01");
        ob.setBname("Programming Fundamentals in C");
        ob.setbPrice(500);

        System.out.println("Saving Book to Database");

        entityManager.persist(ob);
        entityManager.getTransaction().commit();


//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();

    }
}
