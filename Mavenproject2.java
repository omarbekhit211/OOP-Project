package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.UUID;

   public class Mavenproject2{
     static void main(String[] args) {
         hotel h = new hotel();
//         h.addroom();
            SingleRoom room = new SingleRoom(0, 0,"availble" ,0, h);
            SingleRoom room2 = new SingleRoom(0, 0,"availble" ,0, h);
            DoubleRoom room3 = new DoubleRoom(0, 0, "available",0, h);
            DoubleRoom room4 = new DoubleRoom(0, 0, "available",0, h);
           h.addroom(room);
         h.addroom(room2);
         h.addroom(room3);
         h.addroom(room4);
         h.removeroom(room);
           
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
         DoubleRoom r=new DoubleRoom(78,1000,"available",1,h) ;
         r.setRoomNumber(78);
         r.getRoomNumber();
         SingleRoom sr=new SingleRoom(78,1000,"available",1,h);
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

         h.removeroom(room2);
         System.out.println(h.getAllRoom_String());
         System.out.println(h.getAllUsers_String());
     }
    }
