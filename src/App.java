import controller.BookController;
import utils.DbConnection;

public class App {
    public static void main(String[] args) throws Exception {
        // DbConnection connection = new DbConnection();
        // connection.getConnection();
        BookController bookController = new BookController();
        // bookController.get();
        // bookController.post();
        // bookController.update();
        // bookController.delete();
        // bookController.getById();
        bookController.getDetailBook();
    }
}
