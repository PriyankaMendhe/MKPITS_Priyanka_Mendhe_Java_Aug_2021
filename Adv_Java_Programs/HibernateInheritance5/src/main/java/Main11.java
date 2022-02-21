import org.hibernate.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main11 {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();


        Vehicle11 v1 = new Vehicle11();
        v1.setVname("KIA");
        Vehicle10 v2 = new Vehicle10();
        v2.setVname("ALTO");
        Vehicle11 v3 = new Vehicle11();
        v3.setVname("MARUTI");
        Vehicle11 v4 = new Vehicle11();
        v4.setVname("AUDI");
        Vehicle11 v5 = new Vehicle11();
        v5.setVname("SUZUKI");
        Vehicle11 v6 = new Vehicle11();
        v6.setVname("Renault");

//        entityManager.persist(v1);
//        entityManager.persist(v2);
//        entityManager.persist(v3);
//        entityManager.persist(v4);
//        entityManager.persist(v5);
//        entityManager.persist(v6);


        Query query = (Query) entityManager.createQuery("from Vehicle10");

        //first result will come after 3rd data.
        query.setFirstResult(3);//from where to start from db

        query.setMaxResults(2);//how much data to show on consol. limitation on consol to show data

        List<Vehicle10> list =query.list();

        for (Vehicle10 l1:list) {

            System.out.println(l1.getVname());

        }
        System.out.println("Size of Vehicle list: "+list.size());



        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();





    }
}

