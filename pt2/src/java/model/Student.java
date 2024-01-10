package model;

public class Student {
   String name,rollno; float mark;

    public Student() {
    }

    public Student(String name, String rollno, float mark) {
        this.name = name;
        this.rollno = rollno;
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getRollno() {
        return rollno;
    }

    public float getMark() {
        return mark;
    }
   
}
