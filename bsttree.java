
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        data = val;
        left = null;
        right = null;
    }
}
public class MyClass {
	Node root;
    
    public Node bstTreeInsert(Node root,int value){
        if(root == null){
            return new Node(value);
        }else if(root.data < value){
        	root.right = bstTreeInsert(root.right,value);
        }else if(root.data > value){
        	root.left =  bstTreeInsert(root.left,value);
        }
        return root;
    }
   public void printTree(Node root){
	   if(root == null) {
		   return;
	   }
	   printTree(root.left);
	   System.out.println(root.data+" ");
	   printTree(root.right);
   }
    public static void main(String args[]) {
        MyClass mt = new MyClass();
        mt.root = mt.bstTreeInsert(mt.root,100);
        mt.root = mt.bstTreeInsert(mt.root,10);
        mt.root = mt.bstTreeInsert(mt.root,90);
        mt.root = mt.bstTreeInsert(mt.root,200);
        mt.root = mt.bstTreeInsert(mt.root,150);
        mt.printTree(mt.root);
    }
}
