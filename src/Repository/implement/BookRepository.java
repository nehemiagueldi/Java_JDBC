package Repository.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Repository.IBookRepository;
import model.Book;

public class BookRepository implements IBookRepository {
  private Connection connection;

  public BookRepository(Connection connection) {
    this.connection = connection;
  }

  @Override
  public List<Book> get() {
    List<Book> books = new ArrayList<>();
    String query = "SELECT * FROM tb_book";
    try {
      ResultSet resultSet = connection.prepareStatement(query).executeQuery();
      while (resultSet.next()) {
        Book book = new Book();
        book.setId(resultSet.getInt(1));
        book.setTitle(resultSet.getString(2));
        books.add(book);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return books;
  }

  @Override
  public Boolean post(Book book) {
    String query = "INSERT INTO tb_book (id, title, year, price, count, publisher_id, author_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(query);
      preparedStatement.setInt(1, book.getId());
      preparedStatement.setString(2, book.getTitle());
      preparedStatement.setInt(3, book.getYear());
      preparedStatement.setInt(4, book.getPrice());
      preparedStatement.setInt(5, book.getCount());
      preparedStatement.setInt(6, book.getPublisher_id());
      preparedStatement.setInt(7, book.getAuthor_id());
      int result = preparedStatement.executeUpdate();
      return result > 0;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  @Override
  public Boolean update(Book book) {
    String query = "UPDATE tb_book SET title = ? WHERE id = ?";
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(query);
      preparedStatement.setString(1, book.getTitle());
      preparedStatement.setInt(2, book.getId());
      int result = preparedStatement.executeUpdate();
      return result > 0;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  @Override
  public Boolean delete(Book book) {
    String query = "DELETE FROM tb_book WHERE id = ?";
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(query);
      preparedStatement.setInt(1, book.getId());
      int result = preparedStatement.executeUpdate();
      return result > 0;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  @Override
  public Book getById(int id) {
    String query = "SELECT * FROM tb_book WHERE id = ?";
    Book book = new Book();
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(query);
      preparedStatement.setInt(1, id);

      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        book.setId(resultSet.getInt(1));
        book.setTitle(resultSet.getString(2));
        book.setYear(resultSet.getInt(3));
        book.setPrice(resultSet.getInt(4));
        book.setCount(resultSet.getInt(5));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return book;
  }
}
