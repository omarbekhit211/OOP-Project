/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;
import javax.accessibility.AccessibleRole;

/**
 *
 * @author omar
 */
public class hotel {
    
    //من اول هنا lists للبيانات اللي بتقول الاوض المتاحه و النزلاء
    ArrayList<Room> rooms = new ArrayList<>();
    // الليسته دي مربوطه ي كلاس guest بحيث مجرد يظهر الid بتعها يتخزن هنا فورا
    ArrayList<Guest> guests = new ArrayList<>();
    boolean b = false;

    

    
    //  من اول هنا methods نضيف و نشيل بيانات في كل ليسته اكن عندما داتا بيز حقيقيه و overloading
//    void addroom() {
//        for (int i = 0; i < 200; i++) {
//            rooms.add(i);
//        }
//    }
    public void addUser(Guest guest){guests.add(guest);}
    public void removeUser(Guest guest){guests.remove(guest);}

    public void addroom(Room room) {
        rooms.add(room);
    }

    public void removeroom(Room room) {
        rooms.remove(room);
    }

    // see avaliablity of rooms
    public void findroom(int numberOfPerson) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).numberOfPersons >= numberOfPerson && rooms.get(i).toString().equalsIgnoreCase("Available") ) {
                System.out.println("rooms is available");
                b = true;
                break;
            }
        }
    }
    
    public String getAllRoom_String(){return rooms.toString();}
    public String getAllUsers_String(){return guests.toString();}
}
        
    


