package DAO;
import model.laptop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public ArrayList<laptop> getLaptop() throws SQLException

    {
        ArrayList<laptop> laptop = new ArrayList<>();
            String sql = "SELECT TOP (1000) [id]\n"
                + "      ,[name]\n"
                + "      ,[price]\n"
                + "      ,[color]\n"
                + "  FROM [Laptop].[dbo].[Laptop]";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            laptop l = new laptop();
            l.setId(rs.getInt("id"));
            l.setName(rs.getString("name"));
            l.setPrice(rs.getInt("price"));
            l.setColor(rs.getString("color"));
            laptop.add(l);
            
            
            
            }
        return laptop;
        }
}
