package Behaviors;

import Entities.Book;

import java.util.ArrayList;

public class BookManagement {
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        books.add(book);
    }
    public void updateBook(Book book){
        for (Book eBook: books) {
            if(eBook.getId()==book.getId()){
                eBook.setBookName(book.getBookName());
                eBook.setBookCode(book.getBookCode());
            }
        }
    }
    public void removeBook(int id){
        for (Book eBook: books) {
            if(eBook.getId()==id){
                books.remove(eBook);
            }
        }
    }
    public void showBookInfo(){
        for (Book book: books) {
            System.out.println(book.toString());
        }
    }
    public Book getBookById(int id){
        Book book = new Book();
        for (Book eBook: books) {
            if(eBook.getId()==id){
                book = eBook;
            }
        }
        return book;
    }
}
