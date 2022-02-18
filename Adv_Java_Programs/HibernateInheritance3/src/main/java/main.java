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
        org.hibernate.Query query1 =(org.hibernate.query.Query) entityManager.createQuery("from Vehicle8 where id=2");

        List <Vehicle8> list1 = query1.list();

        for ( Vehicle8 ob : list1) {

            System.out.println(ob.getVname());

        }

        System.out.println(list.size());

        // System.out.println(query.getResultList().size());
        //System.out.println(query.getResultList() );
//to find
        org.hibernate.Query query3 =(org.hibernate.query.Query) entityManager.createQuery("from Vehicle8 where id=3");

        List l1 = query3.list();

        System.out.println(l1.size());


        org.hibernate.Query query4 =(org.hibernate.query.Query) entityManager.createQuery("from Vehicle8 where id= :Id");
        query4.setLong("Id",4);

        List l4 = query4.list();

        System.out.println(l4.size());


//to update
        org.hibernate.Query query5 =(org.hibernate.query.Query) entityManager.createQuery("update Vehicle8 set vname= :vn where id= :Id");
        query5.setString("vn","Audi");
        query5.setLong("Id",5);

        int i = query5.executeUpdate();

        //to display update value in id =5

        org.hibernate.Query query6 =(org.hibernate.query.Query) entityManager.createQuery("from Vehicle8 where id=5");

        List <Vehicle8> list5 = query6.list();

        for ( Vehicle8 ob1 : list5) {

            System.out.println(ob1.getVname()+ "" +ob1.getId());

        }


        //to delete
        org.hibernate.Query query7 =(org.hibernate.query.Query) entityManager.createQuery("delete from Vehicle8  where id= :Id");

        query7.setLong("Id",7);

        query7.executeUpdate();





        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
