import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();

        product ob=new product();
        ob.setPid("p12");
        ob.setPname("laptop");
        ob.setPvalue(60000);

        System.out.println("Saving product to Database");

        entityManager.persist(ob);
        entityManager.getTransaction().commit();


//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();

    }
}
