
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author Huy
 */
public class Student {

    int RollCode;

    String FullName;

    Date Dob;

    String Gender;

    Major typeMajor;

    public Student() {
    }

    public Student(int RollCode, String FullName, Date Dob, String Gender, Major typeMajor) {
        this.RollCode = RollCode;
        this.FullName = FullName;
        this.Dob = Dob;
        this.Gender = Gender;
        this.typeMajor = typeMajor;
    }

    public int getRollCode() {
        return RollCode;
    }

    public void setRollCode(int RollCode) {
        this.RollCode = RollCode;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date Dob) {
        this.Dob = Dob;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Major getTypeMajor() {
        return typeMajor;
    }

    public void setTypeMajor(Major typeMajor) {
        this.typeMajor = typeMajor;
    }

    @Override
    public String toString() {
        return "Student{" + "RollCode=" + RollCode + ", FullName=" + FullName + ", Dob=" + Dob + ", Gender=" + Gender + ", typeMajor=" + typeMajor + '}';
    }



}
