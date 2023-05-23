package com.example.demo3.repository;
import com.example.demo3.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IBookRespository  extends JpaRepository<Book, Long>{
}
