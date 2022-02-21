import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();

        Vehicle9 ob = new Vehicle9();
        ob.setVname("Auto");//transient state

        Vehicle9 ob2 = new Vehicle9();
        ob2.setVname("AutoRickshaw");

        Vehicle9 ob3 = new Vehicle9();
        ob3.setVname("KIA");

        entityManager.persist(ob);
        entityManager.persist(ob2);
        entityManager.persist(ob3);

        ob2.setVname("Alto");//persitance state. // it will reflect in DB also.

        entityManager.getTransaction().commit();


        entityManager.close();

        //session close
         //Deatch State
        ob3.setVname("Renault");//because session closed it will not update and reflect in DB.

        entityManagerFactory.close();





    }

}
