/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Huy
 */
public class Major {

    int RollCode;

    String major;

    public Major() {
    }

    public Major(int RollCode, String major) {
        this.RollCode = RollCode;
        this.major = major;
    }

    public int getRollCode() {
        return RollCode;
    }

    public void setRollCode(int RollCode) {
        this.RollCode = RollCode;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Major{" + "RollCode=" + RollCode + ", major=" + major + '}';
    }
    
}
