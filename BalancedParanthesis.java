import java.io.*;
import java.util.*;
public class MyClass {
    
    static int SIZE = 10;
    
    char[] stack = new char[SIZE];
    
    int top = -1;
    
    public void push(char c){
        ++top;
        stack[top] = c;
    }
    
    public char pop(){
        if(top != -1){
            return stack[top--]; 
        }
        return 'n';
    }
    
    public static void main(String args[]) {
        String ip = "";int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        ip = sc.nextLine();
        char[] charr = ip.toCharArray();
        SIZE = charr.length;
        MyClass st = new MyClass();
        for(char ch : charr){
            flag = 0;
            if(ch == '{' || ch == '[' || ch == '('){
                st.push(ch);
            }else{
                if((ch == ')' && st.pop() == '(') || (ch == '}' && st.pop() == '{') || (ch == ']' && st.pop() == '[')){
                   flag = 1; 
                }else{
                   flag = 0; 
                }
            }
        }
        if(flag==1){
            System.out.println("Balanced");
        }else{
            System.out.println("Unbalanced");
        }
    }
}
