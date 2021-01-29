import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String[] args){
        int n=4;

            //A & B
            for(int i=1;i<=n;i++){
                //Part A
                for(int j=1;j<=n;j++){
                    int value = n - (i < j ? i : j) + 1; 
                    System.out.print(value+" ");
                }
                //Part B
                for(int j=n-1;j>=1;j--){
                    int value = n - (i < j ? i : j) + 1;
                    System.out.print(value+" ");
                }
                System.out.println("");
            }
            // C & D
            for(int i=n-1;i>=1;i--){
                //c
                for(int j=1;j<n;j++){
                    int value = n - (i < j ? i : j) + 1;
                    System.out.print(value+" ");
                }
                //D
                for(int j=n;j>=1;j--){
                    int value = n - (i < j ? i : j) + 1;
                    System.out.print(value+" ");
                }
                System.out.println("");
            }

    }
}
