package CreationalDesignPatterns.OblectPoolDesignPatterns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionPool extends ObjectPool<Connection>{

    private String dns,user,pwd;

    public JDBCConnectionPool(String driver,String dns, String user, String pwd) {

        super();
            try {
                Class.forName(driver).newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            this.dns = dns;
            this.user = user;
            this.pwd = pwd;
        }
    @Override
    protected Connection create() {
        try {
            return (DriverManager.getConnection(dns,user,pwd));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean validate(Connection o) {
        try {
            return (!((Connection) o).isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    @Override
    public void expire(Connection o) {
        try {
            ((Connection) o).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
