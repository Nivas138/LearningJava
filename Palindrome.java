import java.io.*;
import java.util.*;
import java.lang.*;
public class MyClass {
    public static void main(String args[]) {
        String ip = "madam",op="";
        StringBuilder sb = new StringBuilder(ip);
        System.out.println("--Reverse Concept--");
        for(int i=0;i<ip.length();i++){
            op = op+ip.charAt(ip.length()-i-1);
        }
        System.out.println("Palindrome Check");
        if(ip.contentEquals(op)){
            System.out.println("Palindrome");
        }
        System.out.println("---Collections--");
        sb.reverse();
        if(sb.toString().contentEquals(ip)){
            System.out.println("Palindrrome");
        }
    }
}
