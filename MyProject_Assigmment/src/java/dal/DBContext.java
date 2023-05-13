/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

/**
 *
 * @author Huy
 */
public class DBContext {
        private final String serverName = "localhost\\MSSQLSERVER01";
    private final String dbName = "master";
    private final String portNumber = "1433";
    private final String userID = "s2";
    private final String password = "123";

    public static void main(String[] args) {
        try {
            new DBContext().getConnection();
            System.out.println("thanh cong");
        } catch (Exception e) {
            System.out.println("that bai " + e.getMessage());
        }
    }
}

