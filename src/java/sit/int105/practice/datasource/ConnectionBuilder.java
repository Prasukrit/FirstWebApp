/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int105.practice.datasource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khaitong
 */
public class ConnectionBuilder {

    public static void main(String[] args) throws SQLException {
        // เอาไว้ใช้สำหรับการทดสอบ ว่า เราสามารถเชื่อมต่อกับฐานข้อมูล ได้หรือไม่
        Connection conn = getConnection();
        
        try {
            Statement stm = conn.createStatement();
            String qryCmd = "select ba.account_id, account_name, balance, transaction_code, transaction_date, amount "+
                    " from bankaccount ba, transactions t where ba.account_id = t.account_id";
            ResultSet rs = stm.executeQuery(qryCmd);
            while (rs.next()) {
                System.out.printf("%11d %-25s %15.2f %3s %-10s %12.2f \n",
                        rs.getLong("account_id"), rs.getString("account_name"), rs.getDouble("balance"), 
                        rs.getString("transaction_code"), rs.getString("transaction_date"), rs.getDouble("amount"));
                // System.out.println(rs.getLong("account_id")+ " "+ rs.getString("account_name")+ ", "+ rs.getString("balance")+ ", "+
                //        rs.getString("transaction_code")+ " "+
              //          rs.getString("transaction_date")+ " "+ rs.getString("amount"));
            }
            conn.close();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    public static Connection getConnection() throws SQLException{
        Connection con = null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sitbank","app","app");
            
        }catch (ClassNotFoundException ex){
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE,null,ex);
        }catch (SQLException ex){
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE,null,ex);
        }
        return con;
    }
    
    public static Connection getConnectionxxx() {
        Connection conn = null;

        try {
            Properties props = new Properties();
            FileInputStream fis = null;
            
            fis = new FileInputStream("db.properties");
            props.load(fis);
            
            org.apache.derby.jdbc.ClientDataSource ds = new apache.derby.jdbc.ClientDataSource();
            
            ds.setServerName(props.getProperty("DERBY_SERVER_NAME"));
            ds.setPortNumber(Integer.parseInt(props.getProperty("DERBY_SERVER_PORT")));
            ds.setDatabaseName(props.getProperty("DERBY_DB_NAME"));
            ds.setUser(props.getProperty("DERBY_DB_USERNAME"));
            ds.setPassword(props.getProperty("DERBY_DB_PASSWORD"));

            conn = ds.getConnection();

        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
        return conn;
    }
}
