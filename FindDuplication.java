import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class FindDuplication {
    public static void main(String args[]) {
     /*int N;
     Scanner sc = new Scanner(System.in);
     N = sc.nextInt();
     int[] arr = new int[N];
     for(int i=0;i<N;i++){
         arr[i] = sc.nextInt();
     }*/
     System.out.println("-----Normal loops----");
     int[] arr = {3,7,8,7,5,6,6,3};
     for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
            if(arr[i] == arr[j]){
                System.out.println("Dup : "+arr[i]);
            }             
         }
     }
     //Set
     System.out.println("---Set Interface-----");
     Set<Integer> ss = new HashSet<Integer>();
     for(int kk : arr){
         if(ss.add(kk) == false){
             System.out.println("Dup : "+kk);
         }
     }
     //HashTable
     System.out.println("----Hash Table----");
     Hashtable<Integer,Integer> ht = new Hashtable<>();
     Integer count = 0;
     for(int kk : arr){
         count = ht.get(kk);
         //System.out.println(count);
         if(count == null){
             ht.put(kk,1);
         }else{
             ht.put(kk,++count);
         }
     }
     Set<Entry<Integer, Integer>> entrySet = ht.entrySet();
     for(Entry<Integer,Integer> enen : entrySet){
         if(enen.getValue() > 1){
             System.out.println(" Dup : "+enen);
         }
     }
    }
}
