import com.sun.scenario.effect.Merge;

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

        employee ob=new employee();


        ob.setName("rutuja");
        ob.getAd1().add(o1);
        ob.getAd1().add(h1);

        ob.setName("Priyanka");
        ob.getAd1().add(o1);
        ob.getAd1().add(h1);


//        System.out.println("Saving Employee to Database");
//
       // entityManager.persist(ob);

        //to search data in table
     employee e1 = entityManager.find(employee.class,2l);
        // System.out.println(e1.getId()+" "+e1.getName()+""+e1.getAd1());//getAd1 creates hashcode of address

     // to update set and merge
     //     e1.setName("Surbhi");
     //     entityManager.merge(e1);

        //to remove
        entityManager.remove(e1);




        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();

    }
}
