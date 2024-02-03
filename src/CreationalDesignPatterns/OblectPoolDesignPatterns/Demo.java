package CreationalDesignPatterns.OblectPoolDesignPatterns;

import java.sql.Connection;

public class Demo {
    public static void main(String[] args) {


        JDBCConnectionPool pool = new JDBCConnectionPool("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/newStudent", "root", "");

        Connection con = pool.checkOut();

        // Use the connection
        // Return the connection:
        pool.checkIn(con);
    }
}
