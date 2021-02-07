package Entities;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private String cardNo;
    private Student student;
    private List<Book> bookList;

    public Card(){

    }

    public Card(String cardNo, Student student, List<Book> bookList) {
        this.cardNo = cardNo;
        this.student = student;
        this.bookList = bookList;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNo='" + cardNo + '\'' +
                ", student=" + student +
                ", bookList=" + bookList +
                '}';
    }
}
