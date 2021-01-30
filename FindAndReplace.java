import java.io.*;
import java.util.*;
import java.lang.*;
public class MyClass {
    
    static Set<String> vowels = new HashSet<String>();
    
    public static int SIZE = 5;

    static{
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
    }
    
    static char[] stcks = new char[SIZE];
    int top = -1;
    
    public void push(char c){
        ++top;
        stcks[top] = c;
    }
    
    public char pop(){
        if(top == -1){
            return 'n';
        }else {
            return stcks[top--];
        }
    }
    
    public static void main(String[] args){
        MyClass st = new MyClass();
        String ip;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        ip = sc.nextLine();
        ip = ip.toLowerCase();
        for(int i=0;i<ip.length();i++){
            if(vowels.contains(Character.toString(ip.charAt(i)))){
                SIZE = ip.length();
                st.push(ip.charAt(i));
            }
        }
        System.out.println("--Array : "+new String(stcks));
        char[] cArr = ip.toCharArray();
        for(int i=0;i<cArr.length;i++){
            if(vowels.contains(Character.toString(cArr[i]))){
                cArr[i] = st.pop();
            }
        }
        System.out.println("-- Answer : "+new String(cArr));
    }
}
