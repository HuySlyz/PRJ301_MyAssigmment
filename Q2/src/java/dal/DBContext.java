/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import dto.ObjDTO;
import dto.ObjDetailDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Huy
 */
public class DBContext {
    protected Connection connection;

    public DBContext() throws SQLException, ClassNotFoundException {
        String url = "jdbc:sqlserver://localhost\\MSSQL01:1433;databaseName=PRJ30X_PE_SPRING2023;encrypt=false;";
        String username = "sa";
        String password = "sa";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        connection = DriverManager.getConnection(url, username, password);
    }

    public ArrayList<ObjDTO> getAllObjByRole(String role) throws SQLException {
        ArrayList<ObjDTO> lst_objs = new ArrayList<>();
        String sql = null;
        if (role.equals("can")) {
            sql = "select c.cid, c.cname, c.gender, c.dob, g.gname from CandidateTBL c join GroupTBL g on c.gid = g.gid";
        }else{
            sql = "select m.mid, m.mname, m.gender, m.dob, g.gname from MemberTBL m join GroupTBL g on m.gid = g.gid";
        }
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            Boolean gender = rs.getBoolean(3);
            Date dob = rs.getDate(4);
            String groupname = rs.getString(5);
            ObjDTO obj = new ObjDTO(id, name, gender, dob, groupname);
            lst_objs.add(obj);
        }
        return lst_objs;
    }
    
    public ObjDetailDTO getObjDetailById(String role, int idObj) throws SQLException {
        ObjDetailDTO obj = null;
        String sql = null;
        if (role.equals("can")) {
            sql = "select c.cid, c.cname, c.gender, c.dob, g.gname, u.username from CandidateTBL c join GroupTBL g on c.gid = g.gid join UserTBL u on c.created_by = u.username where c.cid = ?";
        }else{
            sql = "select m.mid, m.mname, m.gender, m.dob, g.gname, u.username from MemberTBL m join GroupTBL g on m.gid = g.gid join UserTBL u on m.created_by = u.username where m.mid = ?";
        }
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idObj);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            Boolean gender = rs.getBoolean(3);
            Date dob = rs.getDate(4);
            String groupname = rs.getString(5);
            String usercreate = rs.getString(6);
            obj = new ObjDetailDTO(usercreate, id, name, gender, dob, groupname);
        }
        return obj;
    }
    
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DBContext db = new DBContext();
        System.out.println(db.getAllObjByRole("can"));
        System.out.println(db.getObjDetailById("can", 1));
    }
}
