import java.io.*;
import java.util.*;
import java.lang.*;

class Node{
    int data;
    Node next;
}
public class MyClass {
    Node head;
    
    public void addNodeFirst(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = head; 
        head = newNode;
    }
    
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
    
    public int getLinkedlistLength(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            ++count;
            temp = temp.next;
        }
        return count;
    }
    
    public void searchMiddle(){
        Node search = head;
        int lengthOfList = getLinkedlistLength();
        System.out.println("--LinkedList Count : "+lengthOfList);
        if(lengthOfList != 0){
            int middle = (lengthOfList/2)+1; 
            System.out.println("Length of list "+middle);
            while(middle > 0 && search != null){
                if(middle == 1 || (middle == 2 && (lengthOfList % 2) == 0 )){
                    System.out.println(middle+"-->Middle Elemet : "+search.data);
                    search = search.next;
                    middle--;
                }else{
                    search = search.next;
                    middle--;
                }
            }
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
        singlyLinkedlist.addNodeFirst(10);
        singlyLinkedlist.addNodeFirst(20);
        singlyLinkedlist.addNodeFirst(40);
        singlyLinkedlist.addNodeLast(30);
        singlyLinkedlist.addNodeLast(15);
        singlyLinkedlist.addNodeLast(34);
        singlyLinkedlist.addNodeLast(38);
        singlyLinkedlist.printList();
        singlyLinkedlist.searchMiddle();
    }
}
