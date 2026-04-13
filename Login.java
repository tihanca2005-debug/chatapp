/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickchatapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Student ST10519525 Tihanca Leeu
 */
class Login {
     
    
    //Method to validate the username
    boolean checkuserName(String username){
        return username.contains("_")&& username.length()<=5;
    }
    
    //Method to validate the cellphone number
    boolean checkCellphoneNumber(String cellphoneNumber){
        //Declare a variable to store the pattern
        String regex = "^(\\+27|0)[6-8][0-9]{8}$";
        
        //Pattern object to compile my regex pattern
        Pattern pattern = Pattern.compile(regex);
        
        //Matcher object to compare the cellphone number to the pattern
        Matcher matcher = pattern.matcher(cellphoneNumber);
        
        //Return true if cellphone number matches the pattern
        return matcher.matches();
    }
    
    //Method to validate password
    boolean checkPasswordComplexity(String password){
        //Declare a variable to store a pattern
        String regex="^(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}$";
        
        //Pattern object to compile my regex pattern
        Pattern pattern = Pattern.compile(regex);
        
        //Matcher object to compare the password to the pattern
        Matcher matcher = pattern.matcher(password);
        
        //Return true if password matches the pattern
        return matcher.matches();
        
    }
    
    
    //Method to return registration status
    String registerUser(String name, String surname, String username, String password, String cellphoneNumber){
      if (checkuserName(username)&&checkCellphoneNumber(cellphoneNumber)&&checkPasswordComplexity(password)){
          return "User successfully registered.";
      }else{
          System.out.println("Username, password or cellphone number incorrectly formatted; registration unsuccessful.");
          System.exit(0);
          return null;
      }
        
    }  
    
    //Method to check login credentials
    boolean loginUser(String username, String password, String loginUsername, String loginPassword){
        return username.equals(loginUsername) && password.equals(loginPassword);
    }
    
    //Method to return login status
    String returnLoginStatus(String name, String surname, String username, String password, String loginUsername, String loginPassword){
        
        if (loginUser(username, password, loginUsername, loginPassword)){
            return "Welcome " + name + " " + surname + ", it is great to see you again";
        }else{
            return "Username or password incorrect, please try again.";   
    }
}
}
