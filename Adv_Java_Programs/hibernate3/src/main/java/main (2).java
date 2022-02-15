import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();

        Employee ob=new Employee();
        ob.setCompanyName("TCS");
        ob.setEid("4001");
        ob.setEname("Pankaj Kumar");
        ob.setSalary(89520);

        System.out.println("Saving Employee to Database");

        entityManager.persist(ob);
        entityManager.getTransaction().commit();


//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();

    }
}
