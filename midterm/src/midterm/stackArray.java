/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

/**
 *
 * @author admin
 */
public class stackArray {
    private int [] stack;
    private int top;
    private int capacity;
    
    public stackArray(int capacity){
        this.capacity = capacity;
        stack = new int [capacity];
        top = -1;
    }
    
    public static void main (String[] args){
        
        stackArray stack = new stackArray(5);
        
        stack.push (10);
        stack.push (20);
        stack.push (30);
        stack.push (40);
    }
    public void push (int value){
        if(isFull()){
            System.out.println(" Stack Overflow! Stack is full");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println("Pushed at " + top + ": " + value);
    }
    public int peek (){
        if (isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        return stack[top];
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow! Stack is empty. ");
            return -1;
        }
        int value = stack[top];
        top--;
        return value;
    }
     public boolean isEmpty(){
         return top == -1;
     }
    public boolean isFull(){
        return top == capacity -1;
    }
    
    public void display(){
        if (isEmpty ()){
            System.out.println("Stack elements: ");
            for (int i = top ; i >=0 ; i++){
                System.out.println(stack[1]);
            }
        }
    }
}
       
        
               
        
    


