/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author omar
 */
public class Reviews {
    
        private int rate;
        private String comment;

        public void rev(int rate) {
            System.out.println("rate ur experience from 0 to 10: " + (int)rate);
            // loop so it wont stop until rate >0 , <10
            while (true) {
                if (rate > 10 || rate < 0) {
                    System.out.println("rate ur experience from 0 to 10: " + rate);
                }
                if (rate > 0 || rate < 10) {
                    System.out.println("thanks for rating");
                    this.rate = rate;
                    break;
                }
            }
        }

        public void comment(String comment) {
            System.out.println("enter comment on ur experience: " + comment);
        }
    }

