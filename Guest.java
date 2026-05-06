/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.UUID;

/**
 *
 * @author omar
 */
public class Guest {
    
        // Private fields for encapsulation
        private String guestId;
        private String fullname;
      
        private String email;
        private String phoneNumber;
        hotel h;
          

        // Constructor
        public Guest(String fullname, String email, String phoneNumber, hotel h) {
            // Generate a unique ID automatically
            this.guestId = UUID.randomUUID().toString().substring(0, 6);
            setFullName(fullname);
            setEmail(email);
            setPhoneNumber(phoneNumber);
            this.h=h;
            h.addUser(this);

        }

        // Setters
        public void setFullName(String fullname) 
        {
            //Conditions to guarantee the user input name correctly
        int required_lenth=5;
         if(fullname.length()<required_lenth){System.out.println("The name must be at least "+required_lenth+" letters");return;}
         if(fullname.isBlank()) {System.out.println("The name mustn't be empty");return;}
         if(!fullname.matches(".*[A-Z].*")&&!fullname.matches(".*[a-z].*")){System.out.println("The name must contain letters");return;}    
         if(fullname.matches(".*[0-9].*")||fullname.matches(".*[~!@#$%^&*()_+-/|{}].*")){System.out.println("The name mustn't be contain numbers or special cases");return;}    

         else {this.fullname=fullname; System.out.println("The name Set succesfully");}
        }
        
        public void setEmail(String email) {
            //Conditions to guarantee the user input email correctly
            if(email.isBlank()) {System.out.println("The email mustn't be empty");return;}
            if(email.contains(" ")) {System.out.println("The email mustn't be contain spaces");return;}
            if(!email.contains("@")){System.out.println("The email must contain '@'");return;}

             else {this.email=email; System.out.println("The email set successfully"); } 
        }
        
        public void setPhoneNumber(String phoneNumber) 
        {
            //Conditions to guarantee the user input phonenumber correctly
         if(phoneNumber.isBlank()){System.out.println("The phone mustn't be empty");return;}
         if(phoneNumber.contains(" ")){System.out.println("The phone mustn't be contain spaces");return;}
         if(!phoneNumber.matches(".*[0-9].*")){System.out.println("The phone must be contain integer numbers");return;}
         if(phoneNumber.matches(".*[A-Z].*")||phoneNumber.matches(".*[a-z].*")||phoneNumber.matches(".*[~!@#$%^&*()_+-/|{}].*")){System.out.println("The phone mustn't be contain letters or special cases");return;}
     
         else {this.phoneNumber= phoneNumber; System.out.println("The phone number set successfully");}
         
        }
        
        //Getters
        public String getFullname() {
            return fullname;
        }
        public String getGuestId() {
            return guestId;
        }
        public String getEmail() {
            return email;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }

        



        // A helper method to display guest info easily
        @Override
        public String toString() {
//            h.guests.add(guestId);
            return String.format("Guest [ID: %s | Name: %s | Email: %s | Phone %s]",
                    guestId, fullname, email,phoneNumber);
        }
    }
    

