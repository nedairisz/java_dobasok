
package feladatok;

import java.util.Random;
import java.util.Scanner;

public class Dobasok {
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in, "latin2");
    
    public static void main(String[] args) {
        
        System.out.print("Hányszor akar dobni?: ");
        int hanyszor =sc.nextInt();
        while (hanyszor < 1){
            System.out.println("Pozitív számot adjon meg!");
            System.out.print("Hányszor akar dobni?: ");
            hanyszor =sc.nextInt();
        } 
        
//        int sz1=0;
//        int sz2=0;
//        int sz3=0;
//        int sz4=0;
//        int sz5=0;
//        int sz6=0;
        
        
//        final int DB = hanyszor;
//        int[] veletlenek = new int [DB];
//        for (int i = 0; i < DB; i++) {
//            int veletlen = rnd.nextInt(1,7);
//            veletlenek[i]=veletlen;
//            //System.out.print(veletlenek[i] + " ");
//        }
        
        final int oldalakSzama = 7;
        int[] szamlalo = new int [oldalakSzama];
        for (int i = 0; i < hanyszor; i++) {
            int veletlen;
            veletlen = rnd.nextInt(1, 7);
        }
       
    }
}
