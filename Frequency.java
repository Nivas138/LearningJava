import java.util.*;
class Node{
    int data;
    Node next;
}
public class MyClass {
    Node front = null , rear = null;
    public void enqueue(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        if(front == null && rear == null){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    public int search(int freq){
        Node temp = front;
        int frequency = 0;
        while(temp != null){
            if(temp.data == freq){
                frequency += 1;
            }
            temp = temp.next;
        }
        return frequency;
    }
    public static void main(String args[]) {
        MyClass mt = new MyClass();
        int[] N = {1, 5, 3, 6, 5, 8, 1, 9, 7};
        int[] M = {1, 3, 2, 7, 4};
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        for(int k : N){
            mt.enqueue(k);
        }
        for(int j : M){
            int count = 0;
            Integer cc = ht.get(j);
            count = mt.search(j);
            ht.put(j,count);
        }
        for(Integer kk : ht.keySet()){
           System.out.println(kk+" : "+ht.get(kk)); 
        }
    }
}
