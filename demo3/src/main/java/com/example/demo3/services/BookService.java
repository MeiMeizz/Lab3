package com.example.demo3.services;
import  com.example.demo3.entity.Book;
import  com.example.demo3.repository.IBookRespository;
import com.sun.source.tree.LambdaExpressionTree;
import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Service;
import  java.util.List;
@Service
public class BookService {
    @Autowired
    private IBookRespository bookRespository;

    public List<Book> getAllBook(){
        return bookRespository.findAll();
    }
    public Book getBookById(Long id){
        return  bookRespository.findById(id).orElse(null);
    }
    public void addBook (Book book){
        bookRespository.save(book);
    }
    public void deleteBook (Long id){
        bookRespository.deleteById(id);
    }
    public void updateBook(Book book){
        bookRespository.save(book);
    }
}
