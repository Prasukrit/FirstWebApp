/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sit.int105.practice.exception;

/**
 *
 * @author Prasukrit
 */
public class BankAccountException extends Exception{

    public BankAccountException() {
        super("Unknow");
    }

    public BankAccountException(String message) {
        super(message);
    }
    
    
    
}
