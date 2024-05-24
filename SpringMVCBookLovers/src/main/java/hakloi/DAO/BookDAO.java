package hakloi.DAO;

import hakloi.model.Book;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Component
public class BookDAO {
    private static int id;

    private static final String URL = "jdbc:postgresql://localhost:5432/first_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "1608";

    private static Connection connection1;
    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            connection1 = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Book> index(){
        List<Book> books = new ArrayList<>();
        try {
            Statement statement = connection1.createStatement();
            String SQL = "SELECT * FROM Book";
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()){
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setName(resultSet.getString("name"));
                book.setAuthor(resultSet.getString("author"));
                book.setDescr(resultSet.getString("descr"));

                books.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return books;
    }

    public Book show(int id){
//        return books.stream().filter(book -> book.getId() == id).findAny().orElse(null);
        return null;
    }

    public void save(Book book){
//        book.setId(++id);
//        books.add(book);
    }

    public void update(int id, Book updatedBook){
//        Book bookToBeUpdated = show(id);
//
//        bookToBeUpdated.setName(updatedBook.getName());
//        bookToBeUpdated.setAuthor(updatedBook.getAuthor());
//        bookToBeUpdated.setDescr(updatedBook.getDescr());
    }

    public void delete(int id){
//        books.removeIf(b -> b.getId() == id);
    }
}
