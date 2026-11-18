/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

/**
 *
 * @author admin
 */
public class doublyLinkedList {
     class Node{
        
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
            
        }
        
    }
    
    Node head;
    
    void add(int data){
        Node newNode= new Node(data);
        if (head == null){
            head= newNode;
            return;
            
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next= newNode;
    }
            void display(){
                Node current= head;
                
                while (current !=null){
                    System.out.println(current.data + " -> ");
                    current = current.next;
                }
                System.out.println("null");
       
            }
            void displaynodes(){
                Node current=head;
                while(current !=null){
                   System.out.println("data: "+ current.data);
                    System.out.print("I current pointers: "+ current);
                     System.out.print("I next");
                     
                     if (current.next != null){
                       System.out.println(current.next);   
                     }else{
                          System.out.println("null");
                     } 
                     current=current.next;
                     }
                }
            public static void main (String[]args){
               doublyLinkedList list =new doublyLinkedList();
                
                list.add(10);
                list.add(20);
                list.add(30);
                
                list.display();
                list.displaynodes();
            }
            }
    


    

