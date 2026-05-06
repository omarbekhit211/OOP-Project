/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author omar
 */
public class Payment {
        // Instance fields
        private int paymentId;
        private int bookingId;
        private double roomCharge;
        private double serviceCharge;
        private double taxAmount;
        private double finalAmount;
        private String paymentMethod;
        private double subtotal;
        hotel h;
        Booking booking;

        // Constructor
        public Payment(int paymentId, int bookingId, double roomCharge, double serviceCharge, String paymentMethod,Booking booking ,hotel h) {
            this.paymentId = paymentId;
            this.bookingId = bookingId;
            this.roomCharge = roomCharge;
            this.serviceCharge = serviceCharge;
            this.paymentMethod = paymentMethod;
            this.booking= booking;
            this.h=h;
        }

        // to calculateFinalAmount

        public void calculateFinalAmount() {
            double subtotal = this.roomCharge + this.serviceCharge;
            this.taxAmount = subtotal * 0.14;
            this.finalAmount = subtotal + this.taxAmount;
        }

        // method to read final result
        public void showInvoice() {
            System.out.println("Payment Id:" + paymentId);

            System.out.println("Total Price :" + finalAmount);

        }
        public void printInvoice() {
            System.out.println("======= Invoice =======");
            System.out.println("Customer " + booking.getCustomerName());
            System.out.println("guest id: " + h.guests.get(0));
            System.out.println("phone: " + booking.getPhonenumber());
            System.out.println("Room Number: " + booking.getRoomNumber());
            System.out.println("Room type: :" + booking.getRoomType());
            System.out.println("The period: " + booking.getDays() + " Days");
            System.out.println("==========================");
        }
    }
    

