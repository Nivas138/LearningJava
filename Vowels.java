import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String[] args){
        String ip = "Nivas";
        char[] carr = ip.toLowerCase().toCharArray();
        int vcount=0,ccount=0;
        for(char c : carr){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
               vcount += 1; 
            }else{
               ccount += 1;
            }
        }
        System.out.println("Vowles--"+vcount+",---ccount--"+ccount);
    }
}
