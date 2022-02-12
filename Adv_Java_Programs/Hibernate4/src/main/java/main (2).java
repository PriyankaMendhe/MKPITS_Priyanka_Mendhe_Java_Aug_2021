import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();

        ProductEntry ob=new ProductEntry();


 //to add data
//        ob.setPid("p14544");
//        ob.setPname("Mouse2");
//        ob.setpValue(550);
//        ob.setPinfo1("intex com");
//        ob.setDos(new Date());
//        ob.setDot(new Date());
//        ob.setDos1(new Date());
//        ob.setPdesc("abnddvdvd brgergerrrrrrrrrrrrrrgvdcdc ");
//
//        ob.setPid("p1454434");
//        ob.setPname("Mouse2");
//        ob.setpValue(550);
//        ob.setPinfo1("intex com");
//        ob.setDos(new Date());
//        ob.setDot(new Date());
//        ob.setDos1(new Date());
//        ob.setPdesc("abnddvdvd brgergerrrrrrrrrrrrrrgvdcdc ");
//
//        System.out.println("Saving product to Database");
//
//        entityManager.persist(ob);
        entityManager.getTransaction().commit();

        //to Search Data

        ProductEntry p1 = entityManager.find(ProductEntry.class,1l);
        System.out.println(p1.getPname()+""+p1.getPid()+""+p1.getpSupply());

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();

    }
}
