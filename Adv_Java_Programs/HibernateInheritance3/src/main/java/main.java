import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
//        entityManager.getTransaction().begin();

        Vehicle8 v1 = new Vehicle8();
        v1.setVname("CAR");


        TwoWheel8 t1 = new TwoWheel8();
        t1.setStrHandle("Handle Type");
        t1.setVname("Activa");

        FourWheel8 f1 =new FourWheel8();
        f1.setStrStering("Stering wheel type");
        f1.setVname("KIA");

        TwoWheel8 t2 = new TwoWheel8();
        t2.setStrHandle("Handle Type");
        t2.setVname("Activa 5G");

        FourWheel8 f2 =new FourWheel8();
        f2.setStrStering("Stering wheel type");
        f2.setVname("Renault");

        TwoWheel8 t3 = new TwoWheel8();
        t3.setStrHandle("Handle Type");
        t3.setVname("Honda");

        FourWheel8 f3 =new FourWheel8();
        f3.setStrStering("Stering wheel type");
        f3.setVname("Indica");

//        entityManager.persist(v1);
//        entityManager.persist(t1);
//        entityManager.persist(f1);
//        entityManager.persist(t2);
//        entityManager.persist(f2);
//        entityManager.persist(t3);
//        entityManager.persist(f3);

        //for HQL
        entityManager.getTransaction().begin();

        // for select all data from vehicle8
        Query query =(Query) entityManager.createQuery("from Vehicle8");

        List <Vehicle8> list = query.getResultList();

        for ( Vehicle8 ob : list) {

            System.out.println(ob.getVname());

        }

        // for select all data from vehicle8 where id=2
        Query query1 =(Query) entityManager.createQuery("from Vehicle8 where id=2");

        List <Vehicle8> list1 = query1.getResultList();

        for ( Vehicle8 ob : list1) {

            System.out.println(ob.getVname());

        }



        // System.out.println(query.getResultList().size());
        //System.out.println(query.getResultList() );

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
