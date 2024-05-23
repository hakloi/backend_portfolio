package hakloi.DAO;

import hakloi.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BookDAO {
    private static int id;
    private List<Book> books;

    {
        books = new ArrayList<>();
        books.add(new Book(++id, "Wuthering Heights", "Her only novel is the story of inseparable soulmates Heathcliff and Catherine Earnshaw and how betrayal, revenge and brutality led them down a dark path.", "Emily Brontë."));
        books.add(new Book(++id, "Jane Eyre", "The novel focuses on the titular character as she comes of age, finds her way into the social class, and finds love and happiness with her brooding master.", "Charlotte Brontë"));
    }

    public List<Book> index(){
        return books;
    }

    public Book show(int id){
        return books.stream().filter(book -> book.getId() == id).findAny().orElse(null);
    }

    public void save(Book book){
        book.setId(++id);
        books.add(book);
    }

    public void update(int id, Book updatedBook){
        Book bookToBeUpdated = show(id);

        bookToBeUpdated.setName(updatedBook.getName());
        bookToBeUpdated.setAuthor(updatedBook.getAuthor());
        bookToBeUpdated.setDescr(updatedBook.getDescr());
    }

    public void delete(int id){
        books.removeIf(b -> b.getId() == id);
    }
}
