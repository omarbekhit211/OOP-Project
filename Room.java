/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author omar
 */
public abstract class Room {
    

        // basic info
        protected int roomNumber;
        protected double pricePerNight;
        protected boolean isAvailable;
        protected int numberOfPersons;
        hotel h;

        // constructor
        public Room(int roomNumber, double pricePerNight, int numberOfPersons, hotel h) {
            this.pricePerNight = pricePerNight;
            this.numberOfPersons = numberOfPersons;
            this.isAvailable = false;
            this.h=h;
            for (int i = 0; i < h.rooms.size(); i++) {
                if (h.rooms.get(i) == roomNumber) {
                    this.isAvailable = true;
                    this.roomNumber = roomNumber;
                    break;
                }
            }
        }

        // getter room number
        public int getRoomNumber() {
            return roomNumber;
        }

        // setter room number
        public void setRoomNumber(int roomNumber) {
            for (int i = 0; i < h.rooms.size(); i++) {
                if (h.rooms.get(i) == roomNumber) {
                    this.isAvailable = true;
                    this.roomNumber = roomNumber;
                    break;
                }
            }
        }
        
        

        

        // getter price
        public double getPricePerNight() {
            return pricePerNight;
        }

        // setter price
        public void setPricePerNight(double pricePerNight) {
            this.pricePerNight = pricePerNight;
        }

        // getter persons
        public int getNumberOfPersons() {
            return numberOfPersons;
        }

        // setter persons
        public void setNumberOfPersons(int numberOfPersons) {
            this.numberOfPersons = numberOfPersons;
        }

        // display info
        public void displayRoomInfo() {
            System.out.println("Room Number: " + roomNumber);
            System.out.println("Price Per Night: " + pricePerNight);
            System.out.println("Number Of Persons: " + numberOfPersons);
            System.out.println("Available: " + isAvailable);
        }
    }

    

