package hakloi.model;

public class Book {
    private int id;
    private String name;
    private String descr;
    private String author;

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
