/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.validation;

import com.example.demo.model.Trainer;

/**
 *
 * @author karat
 */
public class Validation {

    public  boolean validTrainer (Trainer trainer) {
       String firstname = trainer.getFirstname();
       String lastname = trainer.getLastname();
    
      
       //firstname == null || lastname == null && 
    if (firstname.trim().equals("") || firstname.length() < 3 || !firstname.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$")) {

      return(false);
      
   
    }else if(lastname.length()< 3 || lastname.trim().equals("") || !lastname.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$")){
        return(false);
    } 
 
    return (true);
  
}
}
