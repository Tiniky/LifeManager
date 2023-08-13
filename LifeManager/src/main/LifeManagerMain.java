package main;

import database.SQLConnection;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author tiniky
 */
public class LifeManagerMain {

    public static void main(String[] args) {
        try{
            Connection connection = SQLConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM users");
            while(results.next()){
                System.out.println(results.getInt("id") + " " + results.getString("username"));
            }
            
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
