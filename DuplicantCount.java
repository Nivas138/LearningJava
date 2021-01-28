import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class MyClass {
    public static void main(String args[]) {
        int[] arr = {2, 5, 1, 2, 7, 5};
        System.out.println("---Normal---");
        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count += 1;
                    System.out.println(arr[j]+" :: "+count);
                }
            }
        }
        System.out.println("----Hash Table----");
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        for(int p : arr){
           Integer cc = ht.get(p);
           if( cc == null ){
               ht.put(p,1);
           }else{
               ht.put(p,++cc);
           }
        }
        System.out.println("---Print Hash---");
        Set<Entry<Integer,Integer>> setss = ht.entrySet();
        for(Entry<Integer,Integer> kk : setss){
            if(kk.getValue() > 1){
                System.out.println();
            }
        }
    }
}
