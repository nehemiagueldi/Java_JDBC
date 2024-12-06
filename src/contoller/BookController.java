package contoller;

import Repository.implement.BookRepository;
import model.Book;
import utils.DbConnection;

public class BookController {
  BookRepository bookRepository = new BookRepository(DbConnection.getConnection());

  // get
  public void get(){
    for (Book book : bookRepository.get()){
      System.out.println("\nID: " + book.getId());
      System.out.println("Book Name: " + book.getTitle());
    }
  }

  // post
  public void post(){
    Book book = new Book();
    book.setId(0);
    book.setTitle("Filosofi Air");
    book.setYear(2006);
    book.setPrice(82000);
    book.setCount(60);
    book.setPublisher_id(3);
    book.setAuthor_id(2);

    Boolean result = bookRepository.post(book);
    if (result) {
      System.out.println("Success insert data!");
    } else {
      System.out.println("Failed insert data");
    }
  }

  // update
  public void update(){
    Book book = new Book();
    book.setId(10);
    book.setTitle("Filosofi Tanah");
    
    Boolean result = bookRepository.update(book);
    if (result) {
      System.out.println("Success update data!");
    } else {
      System.out.println("Failed update data!");
    }
  }

  // delete
  public void delete(){
    Book book = new Book();
    book.setId(11);

    Boolean result = bookRepository.delete(book);
    if (result) {
      System.out.println("Success delete data!");
    } else {
      System.out.println("Failed delete data!");
    }
  }

  // getbyid
  public void getById(){
    Book book = bookRepository.getById(2);

    System.out.println("\nID: " + book.getId());
    System.out.println("Book Name: " + book.getTitle());
    System.out.println("Book Year: " + book.getYear());
    System.out.println("Book Price: " + book.getPrice());
    System.out.println("Book Stock: " + book.getCount());
  }
}
