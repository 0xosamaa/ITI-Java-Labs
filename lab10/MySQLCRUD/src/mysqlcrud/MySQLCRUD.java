/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlcrud;
import java.sql.* ;
/**
 *
 * @author m7md
 */
public class MySQLCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            DriverManager.registerDriver(new
            com.mysql.cj.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab10", "root","root");
            Statement stmt = con.createStatement() ;
            String queryString = new String("select * from employees");
            ResultSet rs = stmt.executeQuery(queryString) ;
            while(rs.next())
            {
                System.out.print(rs.getString(1)+" ");
                System.out.print(rs.getString(2)+" ");
                System.out.print(rs.getString(3));
                System.out.println();
            }
            System.out.println("#######################");
            
            queryString = new String("insert into employees(name, salary) values ('Sayed',1000000)");
            int affectedRows = stmt.executeUpdate(queryString);
            System.out.println(affectedRows);
            System.out.println("#######################");
            
            queryString = new String("select * from employees;");
            rs = stmt.executeQuery(queryString) ;
            while(rs.next())
            {
                System.out.print(rs.getString(1)+" ");
                System.out.print(rs.getString(2)+" ");
                System.out.print(rs.getString(3));
                System.out.println();
            }
            
            System.out.println("#######################");
            queryString = new String("update employees set name='Ahmed' where name='Sayed'");
            affectedRows = stmt.executeUpdate(queryString);
            System.out.println(affectedRows);
            System.out.println("#######################");
            
            queryString = new String("select * from employees");
            rs = stmt.executeQuery(queryString) ;
            while(rs.next())
            {
                System.out.print(rs.getString(1)+" ");
                System.out.print(rs.getString(2)+" ");
                System.out.print(rs.getString(3));
                System.out.println();
            }
            
            System.out.println("#######################");
            queryString = new String("delete from employees where name='Ahmed'");
            affectedRows = stmt.executeUpdate(queryString);
            System.out.println(affectedRows);
            System.out.println("#######################");
            
            queryString = new String("select * from employees");
            rs = stmt.executeQuery(queryString) ;
            while(rs.next())
            {
                System.out.print(rs.getString(1)+" ");
                System.out.print(rs.getString(2)+" ");
                System.out.print(rs.getString(3));
                System.out.println();
            }
            
            
            
                stmt.close();
                con.close();
            }
            catch(SQLException ex)
            {
                ex.printStackTrace();
            }
    }
}
