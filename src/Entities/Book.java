package Entities;

public class Book {
    private int id;
    private String bookName;
    private String bookCode;

    public Book(){

    }

    public Book(int id, String bookName, String bookCode) {
        this.id = id;
        this.bookName = bookName;
        this.bookCode = bookCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookCode='" + bookCode + '\'' +
                '}';
    }
}
