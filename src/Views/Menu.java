package Views;

import Entities.Book;
import Entities.Student;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static Student getStudentInfo(){
        Student student = new Student();
        System.out.println("Enter Student's name");
            String studentName = input.nextLine();
            student.setName(studentName);
        System.out.println("Enter Student's code");
            int studentCode = Integer.parseInt(input.nextLine());
            student.setStudentCode(studentCode);
        System.out.println("Enter Student's date of birth");
            String studentDOB = input.nextLine();
            student.setDOB(studentDOB);
        System.out.println("Enter Student's class name");
            String studentClassName = input.nextLine();
            student.setClassName(studentClassName);
        return student;
    }

    public static Book getBookInfo(){
        Book book = new Book();
        System.out.println("Enter book's identity");
            int bookId = Integer.parseInt(input.nextLine());
            book.setId(bookId);
        System.out.println("Enter book's name");
            String bookName = input.nextLine();
            book.setBookName(bookName);
        System.out.println("Enter book's code");
            String bookCode = input.nextLine();
            book.setBookCode(bookCode);
        return book;
    }
}
