
package feladatok;

import java.util.Random;
import java.util.Scanner;

public class Nedairisz_DobasCsillaggal {
    
    /* A felhasználó adja meg, h mennyit akar dobni 2 kockával.
       A dobésok statisztikáját jelenítsük meg csillagokból álló vízszintes oszlopdiagrammal.
       2 ****(4 db)*/
    
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
        final int DB = hanyszor;
        
        final int oldalakSzama = 13;
        int[] szamlalo = new int [oldalakSzama];
        
        for (int i = 0; i < hanyszor; i++) {
            int veletlen = rnd.nextInt(2, 13);
            szamlalo[veletlen]++;
        }
    
        for (int i = 2; i < szamlalo.length; i++) {
            System.out.println(i+ ": " + szamlalo[i] + "alkalommal");
        }
        
        int max =0;
        for (int i = 0; i < szamlalo.length; i++) {
           if (szamlalo[i]>max){
               max=szamlalo[i];
           }
        }
        
        for (int i = 2; i < szamlalo.length; i++) {
            System.out.print(i+": ");
            int csillagokSzama= (int) ((double)szamlalo[i])/max*40;
            for (int j = 0; j < csillagokSzama; j++) {
                System.out.print("*");
            }
            System.out.println("(" + szamlalo[i] +" db)");
        }
    }
    
}
