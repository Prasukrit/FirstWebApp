/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sit.int105.practice.model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sit.int105.practice.datasource.ConnectionBuilder;

/**
 *
 * @author Prasukrit
 */
public class Transaction implements Serializable{
    public static final Map<String,String> transactionDescription = new HashMap<String, String>();
    static {
        transactionDescription.put("OPA", "OpenAccount");
        transactionDescription.put("CSD", "Cash deposit");
        transactionDescription.put("CSW", "Cash withdraw");
        transactionDescription.put("UAC","Update");
        
    }
    public enum TransactionCode{
        OPA,CSD,CSW,UAC;
    }
    
    public long transactionId;
    public TransactionCode transacionCode;
    public Date transactionDateTime;
    public double amount;

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionCode getTransacionCode() {
        return transacionCode;
    }

    public void setTransacionCode(TransactionCode transacionCode) {
        this.transacionCode = transacionCode;
    }

    public Date getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(Date transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionDescription() {
        return transactionDescription.get(transacionCode.name());
    }
    
    public static List<Transaction> getTransaction(long acid){
        List<Transaction> transactions = new ArrayList<Transaction>();
        try{
            Connection conn = ConnectionBuilder.getConnection();
            Transaction t = null;
            String sql = "SELECT * FROM transactions WHERE account_id = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setLong(1, acid);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                t = new Transaction();
                orm(rs , t);
                transactions.add(t);
            }
            conn.close();
        }catch(SQLException ex){
            System.err.println(ex);
        }
        return transactions;
    }
    private static void orm(ResultSet rs , Transaction t)throws SQLException{
        t.setAmount(rs.getDouble("amount"));
        t.setTransacionCode(TransactionCode.valueOf(rs.getString("transaction_code")));
        t.setTransactionDateTime(rs.getDate("transaction_date"));
        t.setTransactionId(rs.getLong("transaction_id"));
    }
    
    public boolean writeTransaction(long acid){
        int x = 0;
        try{
            Connection conn = ConnectionBuilder.getConnection();
            String sql = "INSERT INTO transactions (account_id,transaction_code,transaction_date,amount) VALUES (?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setLong(1, acid);
            pstm.setString(2, transacionCode.name());
            pstm.setDate(3, new java.sql.Date(System.currentTimeMillis()));
            pstm.setDouble(4, amount);
            x = pstm.executeUpdate();
            conn.close();
        }catch (SQLException ex){
            System.err.println(ex);
        }
        return x>0;
    }
    
    
}
