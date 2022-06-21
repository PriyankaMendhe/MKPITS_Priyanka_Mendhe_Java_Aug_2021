package com.example.springcrud2.Repository;

import com.example.springcrud2.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {


}
