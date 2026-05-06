/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author omar
 */

    public class Booking {
        // DATA
        boolean b = false;
        private String customerName;
        private int roomNumber;
        private int days;
        private int pricePerNight;
        private String roomtype;
        private String phonenumber;
        // Empty Constructor
        public Booking() {
        }

        // Parameterized Constructor
        public Booking(String customerName, int roomNumber, int days, int pricePerNight, String roomtype, hotel h) {
            for (int i = 0; i < h.rooms.size(); i++) {
                if (h.rooms.get(i) == roomNumber) {
                    this.roomNumber = roomNumber;
                    b = true;
                }
            }
            
            
            if (roomtype.equalsIgnoreCase("single") || roomtype.equalsIgnoreCase("double")) {
                this.roomtype = roomtype;
            } else {
                System.out.println("wrong type");
            }
            this.days = days;
            this.pricePerNight = pricePerNight;
            this.customerName = customerName;
        }
        
        //setter
        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

         public void setDays(int days) {
            this.days = days;
        }
          public void setRoomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
        } 
          public void setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
        }
          public void setPricePerNight(int pricePerNight) {
            this.pricePerNight = pricePerNight;
        }
          public void setRoomtype(String rt) {
            if (rt.equalsIgnoreCase("single") || rt.equalsIgnoreCase("double")) {
                this.roomtype = rt;
            } else {
                System.out.println("wrong room type");
            }
        }
          //Getter
        public String getCustomerName() {
            return this.customerName;
        }
        
        public int getRoomNumber() {
             return roomNumber;
        }

        public int getDays() {
            return this.days;
        }
        
        public String getPhonenumber(){
            return phonenumber;
        }
        

        public int getPricePerNight() {
            return this.pricePerNight;
        }
        

        public String getRoomType() {
            return roomtype;
        }
    
}
