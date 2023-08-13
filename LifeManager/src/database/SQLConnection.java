package database;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author tiniky
 */
public class SQLConnection {

    private static MysqlConnectionPoolDataSource connection;

    private SQLConnection() {}
    
    public static Connection getConnection() throws SQLException{
        if(connection == null){
            connection = new MysqlConnectionPoolDataSource();
            connection.setServerName("localhost");
            connection.setPort(3306);
            connection.setDatabaseName("lifemanager");
            connection.setUser("root");
            connection.setPassword("");
        }
        
        return connection.getPooledConnection().getConnection();
    }
}
