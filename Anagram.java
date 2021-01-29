import java.io.*;
import java.util.*;
public class MyClass {
    
    public static boolean bubbleSort(String ip,String op){
        ip = ip.toLowerCase();
        op = op.toLowerCase();
        char[] st = op.toCharArray();
        char[] ar = ip.toCharArray();
        System.out.println("---Bubble Sort---");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length-1-i;j++){
                if(ar[j] > ar[j+1]){
                    char t = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = t;
                }
            }
        }
        for(int i=0;i<st.length;i++){
            for(int j=0;j<st.length-1-i;j++){
                if(st[j] > st[j+1]){
                    char t = st[j];
                    st[j] = st[j+1];
                    st[j+1] = t;
                }
            }
        }
        printArray(ar,st);
        if((new String(ar)).contentEquals((new String(st)))){
            return true;
        }
        return false;
    }
    public static void printArray(char[] ar,char[] st){
        try{
        System.out.println("--Print Array--");
        for(char c : ar){
            System.out.print(c+",");
        }
        System.out.println("--string 2--");
        for(char c : st){
            System.out.print(c+",");
        }
        }catch(Exception e){
             System.out.println(e);
        }
    }
    public static boolean inbuiltsort(String ip,String op){
        System.out.println("---In build Sort---");
        char[] st = op.toLowerCase().toCharArray();
        char[] ar = ip.toLowerCase().toCharArray();
        Arrays.sort(st);
        Arrays.sort(ar);
        printArray(ar,st);
        if((new String(ar)).contentEquals(new String(st))){
            return true;
        }
        return false;
    }
    public static boolean hashtable(String ip,String op){
        System.out.println("--Hash Table--");
        Hashtable<String,Integer> ht = new Hashtable<>();
        Hashtable<String,Integer> hh = new Hashtable<>();
        char[] st = op.toLowerCase().toCharArray();
        char[] ar = ip.toLowerCase().toCharArray();
        for(char c : st){
            Integer count = ht.get(c);
            if(count == null){
                ht.put((Character.toString(c)),1);
            }else{
                ht.put((Character.toString(c)),++count);
            }
        }
        for(char c : ar){
            Integer counts = hh.get(c);
            if(counts == null){
                hh.put((Character.toString(c)),1);
            }else{
                hh.put((Character.toString(c)),++counts);
            }
        }
        int flag = 0;
        for(char c : ar){
            if(ht.get((Character.toString(c))) != hh.get((Character.toString(c)))){
                flag = 1;
                break;
            }
        }
        if(flag==1){
            return false;
        }
        return true;
    }
    public static void main(String args[]) {
        String ip = "Army",op="Mary";
        boolean anagram = false;
        if(ip.length() == op.length()){
            anagram = bubbleSort(ip,op);
            anagram = inbuiltsort(ip,op);
            anagram = hashtable(ip,op);
        }
        if(anagram){
           System.out.println("Yes Anagram"); 
        }else{
           System.out.println("Not Anagram"); 
        }
    }
}
