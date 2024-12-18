package model;

import model.dto.AutPubDTO;

public class Book {
  private int id;
  private String title;
  private int year;
  private int price;
  private int count;
  // private int publisher_id;
  // private int author_id;
  private Publisher publisher;
  private Author author;

  public Book() {
    super();
  }

  public Book(AutPubDTO autpub) {
    this.id = autpub.getBookId();
    this.title = autpub.getBookTitle();
    this.count = autpub.getBookCount();
    setPublisher(new Publisher(autpub.getNamePublisher()));
    setAuthor(new Author(autpub.getNameAuthor()));
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public int getCount() {
    return count;
  }
  public void setCount(int count) {
    this.count = count;
  }
  // public int getPublisher_id() {
  //   return publisher_id;
  // }
  // public void setPublisher_id(int publisher_id) {
  //   this.publisher_id = publisher_id;
  // }
  // public int getAuthor_id() {
  //   return author_id;
  // }
  // public void setAuthor_id(int author_id) {
  //   this.author_id = author_id;
  // }
  public Publisher getPublisher() {
    return publisher;
  }
  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }
  public Author getAuthor() {
    return author;
  }
  public void setAuthor(Author author) {
    this.author = author;
  }
}
