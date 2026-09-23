/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
public class arrayList1 {
    public static void main(String[] args){
        
        ArrayList <String> names = new ArrayList<>();
        
        names.add("Angela");
        names.add(" Ysay");
        
        System.out.println(names);
        
        for(int i= 0; i<names.size(); i++){
            System.out.println(names.get(i) + " ");
        }
    }
    
}
