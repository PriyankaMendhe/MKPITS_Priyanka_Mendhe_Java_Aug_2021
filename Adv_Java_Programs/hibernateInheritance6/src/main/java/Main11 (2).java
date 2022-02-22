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
        Vehicle11 v2 = new Vehicle11();
        v2.setVname("ALTO");
        Vehicle11 v3 = new Vehicle11();
        v3.setVname("MARUTI");
        Vehicle11 v4 = new Vehicle11();
        v4.setVname("AUDI");
        Vehicle11 v5 = new Vehicle11();
        v5.setVname("SUZUKI");
        Vehicle11 v6 = new Vehicle11();
        v6.setVname("Renault");
//
//        entityManager.persist(v1);
//        entityManager.persist(v2);
//        entityManager.persist(v3);
//        entityManager.persist(v4);
//        entityManager.persist(v5);
//        entityManager.persist(v6);



//        Query query = (Query) entityManager.createQuery("from Vehicle11 ");
//
//        //first result will come after 3rd data.
//        query.setFirstResult(3);//from where to start from db
//
//        query.setMaxResults(2);//how much data to show on consol. limitation on consol to show data
//        List<Vehicle11> list =query.list();
//
//        for (Vehicle11 l1:list) {
//
//            System.out.println(l1.getVname());
//
//        }
//        System.out.println("Size of Vehicle list: "+list.size());


//check condition with greater
//        Query query = (Query) entityManager.createQuery("from Vehicle11 where vid>10");
//
//        List<Vehicle11> list =query.list();
//
//        for (Vehicle11 l1:list) {
//
//            System.out.println(l1.getVname());
//
//        }
//        System.out.println("Size of Vehicle list: "+list.size());


        //check condition with variable
        //sql injection

//        String sid="10";
//
//        Query query = (Query) entityManager.createQuery("from Vehicle11 where vid> "+sid);
//
//        List<Vehicle11> list =query.list();
//
//        for (Vehicle11 l1:list) {
//
//            System.out.println(l1.getVname());
//
//        }
//        System.out.println("Size of Vehicle list: "+list.size());



        //parameter binding
        //position parameter

//        String sid="10";
//        Query query = (Query) entityManager.createQuery("from Vehicle11 where vid> ?1");
//
//         query.setInteger(1,Integer.parseInt(sid));//position 1 define column 1
//
//        List<Vehicle11> list =query.list();
//
//        for (Vehicle11 l1:list) {
//
//            System.out.println(l1.getVname());
//
//        }
//        System.out.println("Size of Vehicle list: "+list.size());


        //name Parameter binding

//        String sid="9";
//        Query query = (Query) entityManager.createQuery("from Vehicle11 where vid> :Id");
//
//        query.setInteger("Id",Integer.parseInt(sid));
//
//        List<Vehicle11> list =query.list();
//
//        for (Vehicle11 l1:list) {
//
//            System.out.println(l1.getVname());
//
//        }
//        System.out.println("Size of Vehicle list: "+list.size());
/////////////////////////////////////
        //sql injection

//        String sid="9 or 1=1";// (1=1 showing all data from table)
//        Query query = (Query) entityManager.createQuery("from Vehicle11 where vid> "+sid);
//
//
//
//        List<Vehicle11> list =query.list();
//
//        for (Vehicle11 l1:list) {
//
//            System.out.println(l1.getVname());
//
//        }
//        System.out.println("Size of Vehicle list: "+list.size());


        ////////////////////////////////////
       // NAmed Query

//        String sid="8";// (1=1 showing all data from table)
//        Query query = (Query) entityManager.createNamedQuery("vehicleByID");
//        query.setInteger("Id",Integer.parseInt(sid));
//
//
//
//        List<Vehicle11> list =query.list();
//
//        for (Vehicle11 l1:list) {
//
//            System.out.println(l1.getVname());
//
//        }
//        System.out.println("Size of Vehicle list: "+list.size());


////////////////////////////////////////////////////////

        //NativeNameQuery



        Query query = (Query) entityManager.createNamedQuery("vehicleByNAme");

        List<Vehicle11> list =query.list();

        for (Vehicle11 l1:list) {

            System.out.println(l1.getVname());

        }
        System.out.println("Size of Vehicle list: "+list.size());

        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();





    }
}


