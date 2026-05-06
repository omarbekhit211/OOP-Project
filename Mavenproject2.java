package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.UUID;

   public class Mavenproject2{
     static void main(String[] args) {
         hotel h = new hotel();
         h.addroom();
         h.addroom(999);
         h.removerooms(177);
           
         // guest out
         Guest g=new Guest("Ahmed hamdy","ahmed@gmail.com","01112425",h);


         g.setEmail("....@gmail");
         g.setFullName("Fathy Ahmed");
         g.setPhoneNumber("011");
         g.getEmail();
         g.getFullname();
         g.getGuestId();
         g.getPhoneNumber();
         System.out.println(g.toString());
         //-----------------------


     // room out
         DoubleRoom r=new DoubleRoom(78,1000,1,h) ;
         r.setRoomNumber(78);
         r.getRoomNumber();
         SingleRoom sr=new SingleRoom(78,1000,1,h);
         sr.setNumberOfPersons(1);
         sr.getNumberOfPersons();
         sr.setPricePerNight(1000);
         sr.displayRoomInfo();
         //----------------------------


         // booking out
         Booking b=new Booking();
         Booking b2=new Booking("a b",78,3,1000,"single",h);
         b.setCustomerName("a b");
         b.getCustomerName();
         b.setRoomNumber(78);
         b.getRoomNumber();
         b.setDays(3);
         b.getDays();
         b.setRoomtype("single");
         b.getRoomType();
         b.setPhonenumber("011");
         b.getPhonenumber();
         // payment out
         Payment p=new Payment(32,59,1000,250,"visa",b,h);
         p.printInvoice();
         p.calculateFinalAmount();
         p.showInvoice();
         //----------------

         // reviews out
         Reviews rv=new Reviews();
         
         rv.rev(10);
         rv.comment("زي الفل");

         h.removerooms(78);
     }
    }