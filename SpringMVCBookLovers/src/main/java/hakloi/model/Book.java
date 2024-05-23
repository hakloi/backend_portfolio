package hakloi.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min=1, max=30, message = "Name should be between 1 and 30 symbols")
    private String name;

    private String descr;

    @NotEmpty(message = "Book can not have the author")
    private String author;

    public Book(){

    }
    public Book(int id, String name, String descr, String author){
        this.id = id;
        this.name = name;
        this.descr = descr;
        this.author = author;
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

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
