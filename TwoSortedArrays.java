public class MyClass {
    public static void main(String args[]) {
        int[] sortedarr1 = {2,4,6,8,9,10,12};
        int[] sortedarr2 = {2,4,6,8,10,12};
        for(int i=0;i<sortedarr2.length;i++){
            if(sortedarr1[i] != sortedarr2[i]){
                System.out.println("Difference Position is : "+(i));
                break;
            }
        }
    }
}
