package Repository;

import java.util.List;

import model.Book;

public interface IBookRepository {
  List<Book> get();
  Boolean post(Book book);
  Boolean update(Book book);
  Boolean delete(Book book);
  Book getById(int id);
  List<Book> getDetailBook();
}
