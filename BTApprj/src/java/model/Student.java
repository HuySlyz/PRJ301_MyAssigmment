/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Huy
 */
public class Student {
    String name;
    int id;
    String Gender;
    Date DoB;

    public Student() {
    }

    public Student(String name, int id, String Gender, Date DoB) {
        this.name = name;
        this.id = id;
        this.Gender = Gender;
        this.DoB = DoB;
    }

    public Student(int i, String nguyen, String string, String male) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Date getDoB() {
        return DoB;
    }

    public void setDoB(Date DoB) {
        this.DoB = DoB;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", Gender=" + Gender + ", DoB=" + DoB + '}';
    }
    
}
