package com.example.mywebapp;


import com.example.mywebapp.user.User;
import com.example.mywebapp.user.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired private UserRepository repo;

    @Test
    public void testAddNew()
    {
        User user = new User();
        user.setEmail("xyz@gmail.com");
        user.setFirstname("Kiyansh ");
        user.setLastname("Karwade");
        user.setPassword("abc@123");

        User savedUser = repo.save(user);

       // Assertions.assertThat(savedUser).isNotNull();
        //Assertions.assertThat(savedUser.getId()).isGreaterThan(0);


    }


    @Test
    public void testListAll()
    {
         Iterable<User> all = repo.findAll();

        for (User user: all) {

            System.out.println(user);

        }
    }


    @Test
    public void testUpdate()
    {
        Integer userId =1;

        Optional<User> optionalUser = repo.findById(userId);

        User user = optionalUser.get();

        user.setPassword("hello2022");

        repo.save(user);

       // User updateUser = repo.findById(userId).get();

    }

    @Test
    public void testGet()
    {
        Integer userId =2;

        Optional<User> optionalUser = repo.findById(userId);

        final boolean present = optionalUser.isPresent();

        System.out.println(present);
        System.out.println(optionalUser.get());


    }

    @Test
    public void testDeleteByID()
    {

        Integer userId =2;

        repo.deleteById(userId);

        Optional<User> optionalUser = repo.findById(userId);

        final boolean present = optionalUser.isPresent();

        System.out.println(present);




    }


}
