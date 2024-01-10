package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

public class DBContext {

    public Connection connection;

    public DBContext() {
        try {
            //Change the username password and url to connect your own database
            String username = "sa";
            String password = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Laptop";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Student> getstudent() throws SQLException {
        ArrayList<Student> student = new ArrayList<>();
        String sql = "SELECT TOP (1000) [RollCode]\n"
                + "      ,[FullName]\n"
                + "      ,[DoB]\n"
                + "      ,[Gender]\n"
                + "  FROM [Students].[dbo].[Student]";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            Student s = new Student();
            
        }
        return student;
    }
}
