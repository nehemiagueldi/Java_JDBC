package Repository.generic;

import java.util.List;

// T untuk class
// K untuk primary key
public interface IGenericRepository<T, K> {
  public List<T> get();
  public T get(K id);
  public Boolean post(T model);
  public Boolean put(T model, K id);
  public Boolean delete(K id);
}
