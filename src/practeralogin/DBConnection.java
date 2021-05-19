/*
 * Programmer: Alfredo Pozos Nicolau
 * Created on: 
 * Edit history: 
 */
package practeralogin;
import java.sql.*;
/**
 *
 * @author Alfredo Pozos Nicolau
 */
public class DBConnection {

     public static Connection connectDB(){
         Connection conn = null;
         try{
             //register jdb driver
             Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            
            conn = DriverManager.getConnection
                ("jdbc:mysql://localhost/practeraapp", "root", "asd123");
            return conn;
         }catch(Exception ex){
             System.out.println("There were errors while connecting to database");
             return null;
         }
     }
}
