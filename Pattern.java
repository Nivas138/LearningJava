import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String[] args){                                                             
        int n=4;   //t(x) =1                                                                               
            //A & B
            for(int i=1;i<=n;i++){  //t(x) = n+1
                //Part A
                for(int j=1;j<=n;j++){  // t(x) = n*(n+1)
                    int value = n - (i < j ? i : j) + 1; // t(x) = n*n
                    System.out.print(value+" ");  //t(x) = n*n
                }
                //Part B
                for(int j=n-1;j>=1;j--){  // t(x) = n*(n+1)
                    int value = n - (i < j ? i : j) + 1; // t(x) = n*n
                    System.out.print(value+" "); // t(x) = n*n
                }
                System.out.println(""); //t(x) = n
            }
            // C & D
            for(int i=n-1;i>=1;i--){  //t(x) = n+1 
                //c
                for(int j=1;j<n;j++){  // t(x) = n*(n+1)
                    int value = n - (i < j ? i : j) + 1; //t(x) = n*n
                    System.out.print(value+" "); //t(x) = n*n
                }
                //D
                for(int j=n;j>=1;j--){ // t(x) = n*(n+1)
                    int value = n - (i < j ? i : j) + 1; //t(x) = n*n
                    System.out.print(value+" "); //t(x) = n*n
                }
                System.out.println(""); //t(x) = n
            }

    }
}
