package Behaviors;

import Entities.Student;

import java.util.ArrayList;

public class StudentManagement {

    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student){
        students.add(student);
    }
    public void updateStudent(Student student){
        for (Student eStudent: students) {
            if(eStudent.getStudentCode()==student.getStudentCode()){
                eStudent.setName(student.getName());
                eStudent.setDOB(student.getDOB());
                eStudent.setClassName(student.getClassName());
            }
        }
    }
    public void removeStudent(int studentCode){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getStudentCode() == studentCode){
                students.remove(students.get(i));
            }
        }
    }

    public void showStudentInfo(){
        for (Student student: students) {
            System.out.println(student.toString());
        }
    }
    public Student getStudentByCode(int studentCode){
        Student student = new Student();
        for (Student eStudent: students) {
            if(student.getStudentCode()==studentCode){
                student = eStudent;
            }
        }
        return student;
    }
}
