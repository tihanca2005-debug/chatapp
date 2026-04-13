/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.quickchatapp;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student ST10519525 Tihanca Leeu
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
 

    /**
     * Test of checkuserName method, of class Login.
     */
    @Test
    public void testCheckuserName() {
        System.out.println("checkuserName");
        String username = "Lee_u";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkuserName(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkCellphoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellphoneNumber() {
        System.out.println("checkCellphoneNumber");
        String cellphoneNumber = "124545";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellphoneNumber(cellphoneNumber);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "1544za";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String name = "Zanele";
        String surname = "Leeu";
        String username = "Lee_u";
        String password = "Zanele05*";
        String cellphoneNumber = "0734568912";
        Login instance = new Login();
        String expResult = "User successfully registered.";
        String result = instance.registerUser(name, surname, username, password, cellphoneNumber);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "Leeu";
        String password = "Zanel";
        String loginUsername = "leeu.";
        String loginPassword = "zanel";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(username, password, loginUsername, loginPassword);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String name = "Zanele";
        String surname = "Leeu";
        String username = "Lee_u";
        String password = "Zanele05*";
        String loginUsername = "Lee_u";
        String loginPassword = "Zanele05*";
        Login instance = new Login();
        String expResult = "Welcome " + name + " " + surname + ", it is great to see you again";
        String result = instance.returnLoginStatus(name, surname, username, password, loginUsername, loginPassword);
        assertEquals(expResult, result);
       
    }
    
}
