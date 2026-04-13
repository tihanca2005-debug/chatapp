 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quickchatapp;

import java.util.Scanner;

/**
 *
 * @author Student ST10519525 Tihanca Leeu
 */
public class QuickchatApp {

    public static void main(String[] args) {
     //Create an object for the Scanner class   
      Scanner input=new Scanner(System.in);  
        
     //Create login object to allow input validation
      Login login = new Login();
      
   //Declare variables     
   String name,surname,username,password,cellphoneNumber;     
        
   //Ask user to input their details     
  System.out.print("Enter your name : ");
   name = input.nextLine();
   
  System.out.print("Enter your surname : ");      
   surname = input.nextLine();
   
  System.out.print("Enter your username : ");
   username = input.nextLine();
   
   //Validate
   if(login.checkuserName(username)){
       System.out.println("Username successfully captured.");
   }else{
       System.out.println("Username not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
   }
   
  System.out.print("Enter your password : ");
   password = input.nextLine();
   
   //Validate
   if(login.checkPasswordComplexity(password)){
       System.out.println("Password successfully captured.");
   }else{
       System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
   }
   
  System.out.print("Enter your cellphone number : ");
   cellphoneNumber = input.nextLine();
        
   //Validate
   
     if(login.checkCellphoneNumber(cellphoneNumber)){
       System.out.println("Cell phone number successfully added.");
     }else{
       System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
     } 
     
     //Display the registration status
     System.out.println(login.registerUser(name, surname, username, password, cellphoneNumber));

    //Declare temporary variables to allow user to login
    String loginUsername, loginPassword;
    
    System.out.println("***********LOGIN***********");
    
    System.out.println("Please enter your login username : ");
    loginUsername = input.nextLine();
    
    System.out.println("Please enter your login password : ");
    loginPassword = input.nextLine();
    
    System.out.println(login.returnLoginStatus(name, surname, username, password, loginUsername, loginPassword));
    
    }
}
