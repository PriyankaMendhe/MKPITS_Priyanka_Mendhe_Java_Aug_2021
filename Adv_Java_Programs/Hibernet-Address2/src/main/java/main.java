import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();
        //home address
        Address h1 = new Address();
        h1.setPincode(440030);
        h1.setCity("ngp");
        h1.setState("MH");

        //office address
        Address o1 = new Address();
        o1.setState("MH");
        o1.setCity("Amrawati");
        o1.setPincode(7856423);

        emp2 ob=new emp2();
        ob.setEname("Priyanka");
        ob.setHome_ad(h1);
        ob.setOffice_ad(o1);

        System.out.println("Saving Employee to Database");

        entityManager.persist(ob);
        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();

    }
}
