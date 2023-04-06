package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;


public class Employee {
    
    private static void Employee() throws SQLException{
        DataSource ds =  MyDataSourceFactory.getMySQLDataSource();
        Connection con = null;
        Statement state = null;
        ResultSet rs = null;
       
        con = ds.getConnection();
        state = (Statement) con.createStatement();

        /**Create New Table Named Employee*/ 
        String CreateTable = "CREATE TABLE Employee (" +
                            "  ID INT NOT NULL," +
                            "  Fname VARCHAR(20) NOT NULL," +
                            "  Lname VARCHAR(20) DEFAULT NULL," +
                            "  Gender VARCHAR(20) DEFAULT NULL," +
                            "  Age INT DEFAULT NULL," +
                            "  Address VARCHAR(20) DEFAULT NULL," +
                            "  Phone_Number VARCHAR(20) DEFAULT NULL," +
                            "  Vacation_Balance INT DEFAULT 30)";
              
        
        state.executeUpdate(CreateTable);
      
        con.setAutoCommit(false);

        /**Fill Employee Table*/
        String SQL = "INSERT INTO Employee(ID,Fname,Lname,Gender,Age,Address,Phone_Number,Vacation_Balance)"
                      + "VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement pstate = con.prepareStatement(SQL);
        
        pstate.setInt(1, 1);
        pstate.setString(2,"Sara");
        pstate.setString(3,"Ahmed");
        pstate.setString(4,"Female");
        pstate.setInt(5, 30);
        pstate.setString(6,"Mansoura");
        pstate.setString(7,"012557689948");
        pstate.setInt(8, 30);
        pstate.addBatch();
        
        pstate.setInt(1, 2);
        pstate.setString(2,"Youssef");
        pstate.setString(3,"Joe");
        pstate.setString(4,"Male");
        pstate.setInt(5, 26);
        pstate.setString(6,"Cairo");
        pstate.setString(7,"011537642948");
        pstate.setInt(8, 30);
        pstate.addBatch();
        
        pstate.setInt(1, 3);
        pstate.setString(2,"Mohammad");
        pstate.setString(3,"Osama");
        pstate.setString(4,"Male");
        pstate.setInt(5, 50);
        pstate.setString(6,"Mansoura");
        pstate.setString(7,"01091101387");
        pstate.setInt(8, 30);
        pstate.addBatch();
        
        pstate.setInt(1, 4);
        pstate.setString(2,"Hana");
        pstate.setString(3,"Mont");
        pstate.setString(4,"Female");
        pstate.setInt(5, 25);
        pstate.setString(6,"Maadi");
        pstate.setString(7,"01115433548");
        pstate.setInt(8, 30);
        pstate.addBatch();
        
        pstate.setInt(1, 5);
        pstate.setString(2,"Arwa");
        pstate.setString(3,"Marwan");
        pstate.setString(4,"Female");
        pstate.setInt(5, 46);
        pstate.setString(6,"Zagazig");
        pstate.setString(7,"01101227111");
        pstate.setInt(8, 30);
        pstate.addBatch();
        
        int [] Count = pstate.executeBatch();
        con.commit();
       
        rs = state.executeQuery("select * from Employee");
         while(rs.next())
         {
                   System.out.println("ID: "+rs.getInt(1) + " , " +"Name: " + rs.getString(2)+ " " +rs.getString(3)+ " , " + " Gender: " +rs.getString(4)+ " , " +"Age: "+ rs.getInt(5)+" , " +"Address: "+ rs.getString(6)+" , " +"Phone Number: " +rs.getString(7)+" , " +"Vacation Balance: " +rs.getString(8));
         }
        
    }
    
    
   
    public static void main(String[] args) {
        try {
            Employee();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
