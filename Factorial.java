import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String[] args){
        int fact=1,i,n; //t(x) = 1
        System.out.println("Enter N : "); //t(x) = 1
        Scanner sc = new Scanner(System.in); // t(x) = 1
        n = sc.nextInt(); // t(x) = 1
        for(i=1;i<=n;i++){ //t(x) = n+1
            fact = fact * i; //t(x) = n
        }
        System.out.println("Fact Normal loop : "+fact+" Time Complexity : O(n)"); //t(x) = 1
        
    }
}
