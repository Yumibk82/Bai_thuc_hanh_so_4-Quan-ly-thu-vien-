package Views;

import Behaviors.BookManagement;
import Behaviors.CardManagement;
import Behaviors.StudentManagement;
import Entities.Book;
import Entities.Card;
import Entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    static CardManagement cardManagement = new CardManagement();
    static BookManagement bookManagement = new BookManagement();
    static StudentManagement studentManagement = new StudentManagement();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        startMenu:
        do {
            System.out.println("1. STUDENT MANAGEMENT");
            System.out.println("2. BOOK MANAGEMENT");
            System.out.println("3. CARD MANAGEMENT");
            try {
                int choiceMainMenu = Integer.parseInt(input.nextLine());
                if (choiceMainMenu == 1) {
                    do {
                        System.out.println("-----Student Management-----");
                        System.out.println("1. Add student");
                        System.out.println("2. Update student");
                        System.out.println("3. Delete student");
                        System.out.println("4. Show student information");
                        System.out.println("0. Back main menu");

                        try {
                            int choiceExtraMenuStudent = Integer.parseInt(input.nextLine());
                            switch (choiceExtraMenuStudent) {
                                case 1:
                                    Student studentAdd = Menu.getStudentInfo();
                                    studentManagement.addStudent(studentAdd);
                                    break;
                                case 2:
                                    Student studentUpdate = Menu.getStudentInfo();
                                    studentManagement.updateStudent(studentUpdate);
                                    break;
                                case 3:
                                    System.out.println("Enter Student's code to delete");
                                    int studentCodeDelete = Integer.parseInt(input.nextLine());
                                    studentManagement.removeStudent(studentCodeDelete);
                                    break;
                                case 4:
                                    System.out.println("Student list");
                                    studentManagement.showStudentInfo();
                                    break;
                                case 0:
                                    continue startMenu;
                            }

                        } catch (Exception e) {
                        }
                    } while (true);
                } else if (choiceMainMenu == 2) {
                    do {
                        System.out.println("1. Add book");
                        System.out.println("2. Update book");
                        System.out.println("3. Delete book");
                        System.out.println("4. Show book");
                        System.out.println("0. Back main menu");

                        try {
                            int choiceExtraMenuBook = Integer.parseInt(input.nextLine());
                            switch (choiceExtraMenuBook) {
                                case 1:
                                    Book bookAdd = Menu.getBookInfo();
                                    bookManagement.addBook(bookAdd);
                                    break;
                                case 2:
                                    Book bookUpdate = Menu.getBookInfo();
                                    bookManagement.updateBook(bookUpdate);
                                    break;
                                case 3:
                                    System.out.println("Enter your book's id to delete");
                                    int idBookRemove = Integer.parseInt(input.nextLine());
                                    bookManagement.removeBook(idBookRemove);
                                    break;
                                case 4:
                                    bookManagement.showBookInfo();
                                    break;
                                case 0:
                                    continue startMenu;
                            }
                        } catch (Exception e) {
                        }
                    } while (true);
                } else {
                    System.out.println("1. Show card list");
                    System.out.println("2. Add card");
                    System.out.println("0. Return Main Menu");
                    try {
                        int choiceMenuCard = Integer.parseInt(input.nextLine());
                        if (choiceMenuCard == 1) {
                            cardManagement.showCardInfo();
                        } else if(choiceMenuCard == 2) {
                            Card card = new Card();
                            ArrayList<Book> books = new ArrayList<>();
                            System.out.println("Enter Student's code");
                            int studentCode = Integer.parseInt(input.nextLine());
                            Student student = studentManagement.getStudentByCode(studentCode);
                            System.out.println("Enter Card's code number");
                            String cardCodeNo = input.nextLine();
                            card.setCardNo(cardCodeNo);
                            card.setStudent(student);
                            System.out.println("Enter quantity book to borrow");
                            int quantityBook = Integer.parseInt(input.nextLine());
                            for (int i = 0; i < quantityBook; i++) {
                                System.out.println("Enter book's code");
                                int codeNo = Integer.parseInt(input.nextLine());
                                Book book = bookManagement.getBookById(codeNo);
                                books.add(book);
                            }
                            card.setBookList(books);
                            cardManagement.addCard(card);
                        }
                        else{
                            continue startMenu;
                        }
                    } catch (Exception e) {}
                }
            } catch (Exception e) {
            }
        } while (true);
    }
}
