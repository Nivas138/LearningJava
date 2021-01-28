import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    int N=10;
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    for(int i=1;i<=N;i++){
        if(N % i == 0){
            System.out.print(" "+i);
        }
    }
}
}
