package model;

public class Book {
  private int id;
  private String title;
  private int year;
  private int price;
  private int count;
  private int publisher_id;
  private int author_id;

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
  public int getPublisher_id() {
    return publisher_id;
  }
  public void setPublisher_id(int publisher_id) {
    this.publisher_id = publisher_id;
  }
  public int getAuthor_id() {
    return author_id;
  }
  public void setAuthor_id(int author_id) {
    this.author_id = author_id;
  }
}
