package model;
import java.util.*;
import java.sql.*;
/**
 *
 * @author admin
 */
public class StudentDAO extends MyDAO {
  public List<Student> getStudents() {
    List<Student> t = new ArrayList<>();
    xSql = "select * from Student";
    try {
      ps = con.prepareStatement(xSql);
      rs = ps.executeQuery();
      String xRollno,xName; float xMark;
      Student x;
      while(rs.next()) {
        xRollno = rs.getString("rollno");  
        xName = rs.getString("name");  
        xMark = rs.getFloat("mark");
        x = new Student(xRollno,xName,xMark);
        t.add(x);
      }
      rs.close();
      ps.close();
     }
     catch(Exception e) {
        e.printStackTrace();
     }
    return(t);
  }
  public Student getStudent(String xxRollno) {
    Student x = null;
    xSql = "select * from Student where rollno = ?";
    try {
      ps = con.prepareStatement(xSql);
      ps.setString(1, xxRollno);
      rs = ps.executeQuery();
      String xName; float xMark;
      while(rs.next()) {
        xName = rs.getString("name");  
        xMark = rs.getFloat("mark");
        x = new Student(xxRollno,xName,xMark);
      }
      rs.close();
      ps.close();
     }
     catch(Exception e) {
        e.printStackTrace();
     }
    return(x);
  }

  public List<Student> getStudents(String xxName) {
    List<Student> t = new ArrayList<>();
    xSql = "select * from Student where name like '%" + xxName + "%'";
    try {
      ps = con.prepareStatement(xSql);
      rs = ps.executeQuery();
      String xRollno,xName; float xMark;
      Student x;
      while(rs.next()) {
        xRollno = rs.getString("rollno");  
        xName = rs.getString("name");  
        xMark = rs.getFloat("mark");
        x = new Student(xRollno,xName,xMark);
        t.add(x);
      }
      rs.close();
      ps.close();
     }
     catch(Exception e) {
        e.printStackTrace();
     }
    return(t);
  }
  
  public void insert(Student x) {
     xSql = "insert into Student (rollno,name,mark) values (?,?,?)"; 
     try {
      ps = con.prepareStatement(xSql);
      ps.setString(1, x.getRollno());
      ps.setString(2, x.getName());
      ps.setFloat(3, x.getMark());
      ps.executeUpdate();
      ps.close();
     }     
     catch(Exception e) {
        e.printStackTrace();
     }
  }  
}
