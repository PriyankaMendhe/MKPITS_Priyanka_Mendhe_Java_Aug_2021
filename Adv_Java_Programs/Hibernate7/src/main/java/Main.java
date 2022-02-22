import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
//        entityManager.getTransaction().begin();
//
//
//        Student s1 = new Student();
//        s1.setSname("KIA");
//
//        Student s2 = new Student();
//        s2.setSname("KIYANSH");
//
//        Student s3 = new Student();
//        s3.setSname("SURBHI");
//
//        Student s4 = new Student();
//        s4.setSname("HRUTIKA");
//
//        Student s5 = new Student();
//        s5.setSname("RANJANA");
//
////        entityManager.persist(s1);
////        entityManager.persist(s2);
////        entityManager.persist(s3);
////        entityManager.persist(s4);
////        entityManager.persist(s5);
//

        ///criteria

        Session session = entityManager.unwrap(Session.class);// it returns session object
        Transaction transaction = session.beginTransaction();//start session with begin transcation

        //with ALL DATA
//
//        Criteria criteria = session.createCriteria(Student.class);//it get as select query
//
//        List<Student> list = criteria.list();
//
//        for ( Student ob: list) {
//
//            System.out.println(ob.getSname());
//
//        }
//        System.out.println(list.size());

        //WITH RESTRICATION 1


        Criteria criteria = session.createCriteria(Student.class);
//        criteria.add(Restrictions.eq("sname","KIYANSH"))
//                .add(Restrictions.ge("id",1));
//
//        List<Student> list = criteria.list();
//
//         for ( Student ob: list) {
//
//            System.out.println(ob.getSname());
//
//        }
//         System.out.println(list.size());


        //with restrication 2

         criteria.add(Restrictions.eq("sname","KIA"))
                 .add(Restrictions.eq("id",1));

        List<Student> list1 = criteria.list();

        for ( Student ob1:list1) {

            System.out.println(ob1.getSname());

        }

        transaction.commit();
        session.close();


       // entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();



    }
}
