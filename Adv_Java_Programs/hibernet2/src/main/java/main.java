import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();

        Student ob=new Student();
        ob.setId(2L);
        ob.setRoll_no(55);
        ob.setName("Priyanka");
        ob.setAddress("Nagpur");

        System.out.println("Saving student to Database");

        entityManager.persist(ob);
        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }


    }

