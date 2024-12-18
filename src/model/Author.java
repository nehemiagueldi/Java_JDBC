package model;

public class Author {
  private int id;
  private String name;
  private String email;

  public Author() {
    super();
  }

  public Author(String name) {
    this.name = name;
  }
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
}
