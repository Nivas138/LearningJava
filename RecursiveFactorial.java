import java.io.*;
import java.util.*;
public class MyClass {
    public static int factorial(int n){//s=1
        return (n == 0 || n == 1) ? 1 : n*factorial(n-1);//t = n
    }
    public static void main(String[] args){//s(x) = n
        int fact,n;  //t(x) = 1 //s = 2
        System.out.println("Enter N : "); //t=1
        Scanner sc = new Scanner(System.in);//t=1
        n = sc.nextInt();//t=1
        fact = factorial(n);//t=1
        System.out.println("Factorial : "+fact);//t=1
    }
}
