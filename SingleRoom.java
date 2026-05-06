/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author omar
 */

    public class SingleRoom extends Room {
        // inheritance 1
        public SingleRoom(int roomNumber, double pricePerNight,String status, int numberOfPersons, hotel h) {
            super(roomNumber, pricePerNight, status, numberOfPersons,h);
            for (int i = 0; i < h.rooms.size(); i++) {
                if (h.rooms.get(i).getRoomNumber() == roomNumber) {
                    this.roomNumber = roomNumber;
                    isAvailable = true;
                }
            }
            // check limit
            if (numberOfPersons > 1) {
                System.out.println("Warning: Single Room max is 1 person.");
                this.numberOfPersons = 1;
            }
        }

//        @Override
//        public void displayRoomInfo() {
//            System.out.println("Single Room");
//            super.displayRoomInfo();
//        }
    }
