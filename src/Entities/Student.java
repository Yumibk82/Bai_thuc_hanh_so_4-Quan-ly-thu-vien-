package Entities;

public class Student {
    private String name;
    private int studentCode;
    private String DOB;
    private String className;

    public Student(){

    }

    public Student(String name, int studentCode, String DOB, String className) {
        this.name = name;
        this.studentCode = studentCode;
        this.DOB = DOB;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentCode='" + studentCode + '\'' +
                ", DOB='" + DOB + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
