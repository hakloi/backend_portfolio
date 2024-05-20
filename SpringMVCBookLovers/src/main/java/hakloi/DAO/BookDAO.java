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
        books.add(new Book(++id, "Грозовой Перевал", "Скандальный роман", "Эмили Бронте"));
        books.add(new Book(++id, "Джейн Эйер", "Роман о сильной духом девушке", "Шарлотта Бронте"));
    }

    public List<Book> index(){
        return books;
    }

    public Book show(int id){
        return books.stream().filter(book -> book.getId() == id).findAny().orElse(null);
    }
}
