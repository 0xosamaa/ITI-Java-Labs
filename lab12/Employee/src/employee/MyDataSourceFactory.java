/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;

/**
 *
 * @author ITI
 */
class MyDataSourceFactory {
        public static DataSource getMySQLDataSource() {
        Properties prop = new Properties();
        FileInputStream file = null;
        MysqlDataSource mysqlDS = null;

        try {
            file = new FileInputStream("db.properties");
            prop.load(file);
            mysqlDS = new MysqlDataSource();
            mysqlDS.setURL(("jdbc:mysql://localhost:3306/lab10"));
            mysqlDS.setUser(("root"));
            mysqlDS.setPassword(("root")); 
           
        } catch (IOException io) {
            io.printStackTrace();
        }
        return  mysqlDS;
    }
}
