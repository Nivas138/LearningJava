import java.io.*;
import java.util.*;
public class MyClass {
    
    public static void main(String args[]) {
        String ip = "",op = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        ip = sc.nextLine();
        System.out.println("Enter String 2 : ");
        op = sc.nextLine(); 
        char[] carr = op.toCharArray();
        Set<String> stsr = new HashSet<String>();
        for(char cc : carr){
            stsr.add(Character.toString(cc));
        }
        char[] carr1 = ip.toCharArray();
        for(int i=0;i<carr1.length;i++){
            if(stsr.contains(Character.toString(carr1[i]))){
                carr1[i] = ' ';
            }
        }
        System.out.println("Output : "+(new String(carr1)).replaceAll("\\s",""));
    }
    
}
