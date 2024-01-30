package CreationalDesignPatterns.SingletonDesignPattern;

import java.sql.Connection;

public class DemoSingleton {
    public static void main(String[] args) {


        SinglentonConnection jdbc=SinglentonConnection.getInstance();
        Connection con= jdbc.getConnection();

    }
}
