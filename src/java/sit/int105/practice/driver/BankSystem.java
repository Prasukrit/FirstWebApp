/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sit.int105.practice.driver;

import java.util.Scanner;
import sit.int105.practice.exception.BankAccountException;
import sit.int105.practice.model.BankAccount;

/**
 *
 * @author Prasukrit
 */
public class BankSystem {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice = 0;
        do{

                choice = menu();
                switch (choice){
                    case 0 : break;
                    case 1 : openNewAccount();break;
                    case 2 : deposit();break;
                    case 3 : withdraw();break;
                    case 4 : update();break;
                }


        }while(choice>0);
        
    }
    private static int menu(){
        System.out.println("------------SIT BANK-----------");
        System.out.println("--------------------------------");
        System.out.println("1-Open new account");
        System.out.println("2-Deposit");
        System.out.println("3-Withdraw");
        System.out.println("4-Update");
        System.out.println("--------------------------------");
        System.out.println("0-Exit");
        System.out.println("\n\n");
        System.out.println("Your choice");
        int choice = sc.nextInt();
        return choice;
    }
    
    private static void  openNewAccount(){
        sc.reset();
            BankAccount ba = new BankAccount();
            try{
                long id = 0;
                String name = null;
                double amount = 0;
                System.out.println("Open New Account");
                System.out.println("---------------------------");
                System.out.println("Create new Account id : ");
                id = sc.nextLong();
                System.out.println("Create new Account name : ");
                name = sc.next();
                System.out.println("Add balance : ");
                amount = sc.nextDouble();
                ba.setAccountId(id);
                ba.setAccountName(name);
                ba.deposit(amount);
                ba.update(true);
            }catch (BankAccountException ex){
                System.err.println(ex);
            }
            
    }
    private static void deposit(){
        BankAccount ba = new BankAccount();
        try{
            long id = 0;
            double amount = 0;
            System.out.println("Deposti Menu");
            System.out.println("--------------------");
            System.out.println("Enter Account id : ");
            id = sc.nextLong();
            sc.reset();
            ba = BankAccount.findById(id);
            if(ba!=null){
                System.out.println("Account id:"+ba.getAccountId()+"\nAccount name:"+ba.getAccountName()+"\nBalance:"+ba.getBalance());
                System.out.println("Input money : ");
                amount = sc.nextDouble();
                ba.deposit(amount);
                ba.update();
            }else{
                System.out.println("Not found id:"+id);
            }
            
        }catch(BankAccountException ex){
            System.err.println(ex);
        }
    }
    
    private static void withdraw(){
        sc.reset();
        BankAccount ba = new BankAccount();
        try{
            long id = 0;
            double amount = 0;
            System.out.println("Withdraw Menu");
            System.out.println("--------------------");
            System.out.println("Enter Account id : ");
            id = sc.nextLong();
            ba = BankAccount.findById(id);
            if(ba!=null){
                System.out.println("Account id:"+ba.getAccountId()+"\nAccount name:"+ba.getAccountName()+"\nBalance:"+ba.getBalance());
                System.out.println("Input money : ");
                amount = sc.nextDouble();
                ba.withdraw(amount);
                ba.update();
            }else{
                System.out.println("Not found id:"+id);
            }
             
        }catch(BankAccountException ex){
            System.err.println(ex);
        }
    }
    private static void update(){
        BankAccount ba = new BankAccount();
        long id = 0;
        String name=null;
            System.out.println("Update Account");
            System.out.println("-----------------------");
            System.out.println("Your account id:");
            id = sc.nextLong();
            ba = BankAccount.findById(id);
            if(ba!=null){
                System.out.println("Account id:"+ba.getAccountId()+"\nAccount name:"+ba.getAccountName()+"\nBalance:"+ba.getBalance());
                System.out.println("New Account name:");
                name=sc.next();
                ba.setAccountName(name);
                ba.update();
            }else{
                System.out.println("Not found id:"+id);
            }

        
    }
}
