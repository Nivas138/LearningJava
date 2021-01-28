import java.io.*;
import java.util.*;
public class ReverseString {
    public static void main(String args[]) {
     
     int N;
     Scanner sc = new Scanner(System.in);
     N = sc.nextInt();
     int[] arr = new int[N];
     //Array Method
     for(int i=0;i<N;i++){
         System.out.print("Enter : ");
         arr[i] = sc.nextInt();
     }
     for(int j=0;j<N;j++){
         System.out.print(arr[N-j-1]+" ");
     }
    //Collections
     Integer[] ar = Arrays.stream(arr).boxed().toArray(Integer[]::new);
     Collections.reverse(Arrays.asList(ar));
     System.out.println("Collections Reverse : "+Arrays.asList(ar));
     
     //Swaping
     //int arr2[] = new int[N];
     for(int i=0;i<N/2;i++){
        int t = arr[i];
        arr[i] = arr[N-i-1];
        arr[N-i-1] = t;
     }
     for(int j=0;j<N;j++){
         System.out.print(arr[N-j-1]+" ");
     }
    }
}
