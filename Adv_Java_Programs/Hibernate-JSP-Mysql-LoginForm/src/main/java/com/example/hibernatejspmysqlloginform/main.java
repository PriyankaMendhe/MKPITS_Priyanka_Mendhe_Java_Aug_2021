package com.example.hibernatejspmysqlloginform;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
        entityManager.getTransaction().begin();

        User ob1 = new User();
        ob1.setFirstname("Priyanka");
        ob1.setLastname("Mendhe");
        ob1.setPassword("45622");
        ob1.setUsername("Priya12");



        entityManager.persist(ob1);
        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();




    }
}
