package model.dto;

public class AutPubDTO {
  private int bookId;
  private String bookTitle;
  private int bookCount;
  private String namePublisher;
  private String nameAuthor;

  public AutPubDTO() {
    super();
  }

  public AutPubDTO(int bookId, String bookTitle, int bookCount, String namePublisher, String nameAuthor) {
    this.bookId = bookId;
    this.bookTitle = bookTitle;
    this.bookCount = bookCount;
    this.namePublisher = namePublisher;
    this.nameAuthor = nameAuthor;
  }

  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }

  public String getBookTitle() {
    return bookTitle;
  }

  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  public int getBookCount() {
    return bookCount;
  }

  public void setBookCount(int bookCount) {
    this.bookCount = bookCount;
  }

  public String getNamePublisher() {
    return namePublisher;
  }

  public void setNamePublisher(String namePublisher) {
    this.namePublisher = namePublisher;
  }

  public String getNameAuthor() {
    return nameAuthor;
  }

  public void setNameAuthor(String nameAuthor) {
    this.nameAuthor = nameAuthor;
  }

}
