package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Human;
import model.HumanType;

public class DBContext {
    public Connection connection;
    public DBContext()
    {
        try {
            //Change the username password and url to connect your own database
            String username = "sa";
            String password = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=demodataprj";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Human> getHumans(){
        ArrayList<Human> humans= new ArrayList<>();
        try{
            String sql="Select h.humanid,h,humanname,h.humandob,h.humangender,ht.typeid,ht.typename+"
                    + "FROM Human h INNER JOIN HumanType ht ON h.typeid=ht.typeid";
            PreparedStatement statement  =connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                Human h = new  Human();
                h.setID(rs.getInt("humanid"));
                h.setName(rs.getString("humanname"));
                h.setDob(rs.getDate("humandob"));
                h.setGender(rs.getBoolean("humangender"));
                
                HumanType ht =new HumanType();
                ht.setTypeid(rs.getInt("typeid"));
                ht.setName(rs.getString("typename"));
                h.setType(ht);
                humans.add(h);
            }
            
        }catch (SQLException e){
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null,ex);
            
        }
        return humans;
    }
    
}
