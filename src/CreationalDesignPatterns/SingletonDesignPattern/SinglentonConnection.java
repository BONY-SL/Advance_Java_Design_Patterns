package CreationalDesignPatterns.SingletonDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SinglentonConnection {

    private static SinglentonConnection instance=null;

    private static Connection con=null;
    final String DB_URL = "jdbc:mysql://localhost:3306/newStudent";
    final String USER = "root";
    final String PASS = "";
    private SinglentonConnection(){

    }

    public static SinglentonConnection getInstance() {
        if (instance != null) {
            return instance;
        } else {
            instance = new SinglentonConnection();
            return instance;
        }
    }

    public  Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newStudent","root", "");
            System.out.println("Connected");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }


}
