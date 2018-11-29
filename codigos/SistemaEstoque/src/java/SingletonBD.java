
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class SingletonBD {
    private static Connection conn=null;
    
    public static Connection getConexao() throws ClassNotFoundException, SQLException{
        if(conn==null){
            Class.forName("com.mysql.jdbc.driver");
            conn=DriverManager.getConnection(
                    "jdbc:mysql://localhost/lp3?useTimezone=true&serverTimezone=UTC&useSSL=false",
                    "root","root");
        }
        return conn;
    }
    
}
