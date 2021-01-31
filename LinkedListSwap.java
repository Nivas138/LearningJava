class Node{
    int data;
    Node next;
}

public class MyClass {
    Node head;
    
    public void push(int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;
        head = newNode;
    }
    
    public void swap(int x , int y){
        Node prev_x , prev_y , curr_x , curr_y;
        if(x == y){
            return;
        }else{
            prev_x = null;
            curr_x = head;
            while(curr_x != null && curr_x.data != x){
                prev_x = curr_x;
                curr_x = curr_x.next;
            }
            prev_y = null;
            curr_y = head;
            while(curr_y != null && curr_y.data != y){
                prev_y = curr_y;
                curr_y = curr_y.next;
            }
            if(curr_x == null || curr_x == null){
                return;
            }
            System.out.println("Prev_x : "+prev_x.data);
            System.out.println("Prev_y : "+prev_y.data);
            if(prev_x != null){
                prev_x.next = curr_y;
            }else{
              head = curr_y;
            }
            if(prev_y != null){
                prev_y.next = curr_x;
            }else{
              head = curr_x;
            }
            
            System.out.println("Curr_x : "+curr_x.data);
            System.out.println("Curr_y : "+curr_y.data);
            Node temp = curr_x.next; //point to 35
            curr_x.next = curr_y.next; // point to 40->45
            curr_y.next = temp; //point to 30->35
        }
    }
    
    public void print(){
        Node temp =  head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    
    public static void main(String args[]) {
        MyClass mct = new MyClass();
        mct.push(10);
        mct.push(20);
        mct.push(40);
        mct.push(35);
        mct.push(30);
        mct.push(45);
        mct.print();
        mct.swap(30,40);
        mct.print();
    }
}
