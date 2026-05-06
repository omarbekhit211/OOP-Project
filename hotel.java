/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;

/**
 *
 * @author omar
 */
public class hotel {
    
    //من اول هنا lists للبيانات اللي بتقول الاوض المتاحه و النزلاء
    ArrayList<Integer> rooms = new ArrayList<>();
    // الليسته دي مربوطه ي كلاس guest بحيث مجرد يظهر الid بتعها يتخزن هنا فورا
    ArrayList<String> guests = new ArrayList<>();
    boolean b = false;

    

    
    //  من اول هنا methods نضيف و نشيل بيانات في كل ليسته اكن عندما داتا بيز حقيقيه و overloading
    void addroom() {
        for (int i = 0; i < 200; i++) {
            rooms.add(i);
        }
    }

    public void addroom(int r) {
        rooms.add(r);
    }

    public void removerooms(int r) {
        rooms.remove(r);
    }

    // see avaliablity of rooms
    public void findroom(int r) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i) == r) {
                System.out.println("rooms is available");
                b = true;
                break;
            }
        }
    }
}
        
    


