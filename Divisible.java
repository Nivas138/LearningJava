import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String[] args){
        int[] arr;
        String numberFormed = "";
        arr = new int[]{34,5,20,13};
        System.out.println("--Normal loop---Time complxity : O(n)");
        for(int arv : arr){
            int lastnum = arv % 10;
            numberFormed = numberFormed + lastnum;
        }
        System.out.println("Last Num : "+numberFormed);
        if(Integer.parseInt(numberFormed) % 10 == 0){
            System.out.println("Number Formed is divisible ");
        }else{
            System.out.println("Number Formed is not divisible");
        }
        System.out.println("--Condition Check---Time complxity : O(1)");
        if(arr[arr.length-1] % 10 == 0){
            System.out.print("Number Formed will be divisible by 10");
        }else{
            System.out.print("Number formed will not be divisible by 10");
        }
    }
}
