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
import java.util.List;
import sit.int105.practice.datasource.ConnectionBuilder;
import sit.int105.practice.exception.BankAccountException;

/**
 *
 * @author Prasukrit
 */
public class BankAccount implements Serializable{

    public static List<BankAccount> findByName(String accountName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private long accountId;
    private String accountName;
    private double balance;
    public List<Transaction> transactions;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    public void deposit(double amount) throws BankAccountException{
        if(amount>0){
            setBalance(this.balance+amount);
            Transaction t = new Transaction();
            t.setAmount(amount);
            t.setTransacionCode(Transaction.TransactionCode.CSD);
            t.setTransactionDateTime(new Date(System.currentTimeMillis()));
            addTransaction(t);
            
        }else{
            throw new BankAccountException();
        }
    }
    
    public void withdraw(double amount) throws BankAccountException{
        if(this.balance-amount<0){
            throw new BankAccountException();
        }else if(amount>0){
            setBalance(this.balance-amount);
            Transaction t = new Transaction();
            t.setAmount(amount);
            t.setTransacionCode(Transaction.TransactionCode.CSD);
            t.setTransactionDateTime(new Date(System.currentTimeMillis()));
            addTransaction(t);
            
        }else{
            throw new BankAccountException();
        }
    }
    
    public BankAccount findById(){
        return findById(this.accountId);
    }

    public static BankAccount findById(long id) {
        BankAccount ba = null;
        try{
            Connection conn = ConnectionBuilder.getConnection();
            String sql = "SELECT * FROM BankAccount WHERE account_id=?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setLong(1, id);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                ba = new BankAccount();
                orm(rs , ba);
            }conn.close();
        }catch (SQLException ex){
            System.err.println(ex);
        }
        return ba;
        
    }
    
    private static void orm(ResultSet rs , BankAccount ba) throws SQLException{
        ba.setAccountId(rs.getLong("account_id"));
        ba.setAccountName(rs.getString("account_name"));
        ba.setBalance(rs.getDouble("balance"));
        ba.setTransactions(Transaction.getTransaction(ba.getAccountId()));
    }
    
    public void update(){
        update(false);
    }

    public void update(boolean isNew) {
        
        try{
            Connection conn = ConnectionBuilder.getConnection();
            String sql = null;
            if(isNew){
                sql = "INSERT INTO BankAccount (account_name,balance,account_id) VALUES (?,?,?)";
                Transaction t = new Transaction();
                t.setAmount(0);
                t.setTransacionCode(Transaction.TransactionCode.OPA);
                t.setTransactionDateTime(new Date(System.currentTimeMillis()));
                addTransaction(0,t);
            }else{
                sql = "UPDATE BankAccount SET account_name=?,balance=? WHERE account_id=?";
            }
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, accountName);
            pstm.setDouble(2, balance);
            pstm.setLong(3, accountId);
            
            int row = pstm.executeUpdate();
            conn.close();
            if(getTransactions()!=null){
                for(Transaction t : getTransactions()){
                    if(t.getTransactionId()==0){
                        t.writeTransaction(accountId);
                    }
                }transactions.clear();
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }
    private void addTransaction(Transaction t){
        if(transactions==null){
            transactions = new ArrayList<Transaction>();
        }
        transactions.add(t);
    }
    
    private void addTransaction(int x ,Transaction t){
        if(transactions==null){
            transactions = new ArrayList<Transaction>();
        }
        transactions.add(x,t);
    }
}
