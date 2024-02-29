package feladatok;

public class Keveres {
    
    public static void main(String[] args) {
        
        final int M =9;
        char[] betuk =new char [M];
        
        
        for (int i = 0; i < M; i++) {
            char betu = (char)(i+97);
            betuk[i] = betu;
        }
      
        System.out.println("3*3-as mátrix, rendezve");
        for (int i = 0; i < M; i++) {
            if(i%3==0){
                System.out.println(" ");
            }
            System.out.print(betuk[i] + " ");
        }
        
        System.out.println("3*3-as mátrix, fix-keverve");
        int[] sorrend = {7,8,3,2,4,6,5,0,1};
        for (int i = 0; i < M; i++) {
            if(i%3==0){
                System.out.println(" ");
            }
            System.out.print(betuk[sorrend[i]] + " ");
        }
        System.out.println("");
        
        
        System.out.println("3*3-as mátrix, din-keverve");
        for (int i = 0; i < M; i++) {
            sorrend[i]=i; //{0,1,2,3,4,5,6,7,8}
        }
        for (int i = 0; i < M; i++) {
            //csere:
            int t = (int) (Math.random()*M);
            int tmp =sorrend[i];
            sorrend[i]=sorrend[t];
            sorrend[t]=tmp;
        }
        for (int i = 0; i < M; i++) {
            if(i%3==0){
                System.out.println(" ");
            }
            System.out.print(betuk[sorrend[i]] + " ");
        }
        System.out.println("");
        
        
        
    }
    
}
