/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author omar
 */

     public class DoubleRoom extends Room {
        //inheritance 2
        public DoubleRoom(int roomNumber, double pricePerNight,String status ,int numberOfPersons, hotel h) {
            super(roomNumber, pricePerNight,status, numberOfPersons,h);
            for (int i = 0; i < h.rooms.size(); i++) {
                if (h.rooms.get(i).getRoomNumber() == roomNumber) {
                    this.roomNumber = roomNumber;
                } else {
                    System.out.println("room not found");
                }
            }
            // check limit
            if (numberOfPersons > 2) {
                System.out.println("Warning: Double Room max is 2 persons.");
                this.numberOfPersons = 2;
            }
        }

   
        

//        @Override
//        public void displayRoomInfo() {
//            System.out.println("Double Room");
//            super.displayRoomInfo();
//        }
    }
    

