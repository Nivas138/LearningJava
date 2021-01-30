import java.io.*;
import java.util.*;
import java.lang.*;

class Node{
    int data;
    Node next;
}
public class MyClass {
    Node head;
    
    public void addNodeLast(int value){
        
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        
        if(head == null){
            head = newNode;
        }else{
            Node lastNode = head;
            
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            
            lastNode.next = newNode;
        }
    }
    
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println("--Elemet : "+temp.data);
            temp = temp.next;
        }
    }
    
    public static void main(String[] args){
        MyClass singlyLinkedlist = new MyClass();
        System.out.println("---LinkedList---");
        singlyLinkedlist.addNodeLast(10);
        singlyLinkedlist.addNodeLast(20);
        singlyLinkedlist.addNodeLast(40);
        singlyLinkedlist.addNodeLast(30);
        singlyLinkedlist.addNodeLast(15);
        singlyLinkedlist.printList();
    }
}
