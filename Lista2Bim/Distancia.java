import java.util.Scanner;
public class Main {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int p1 = 0;
        int c1 = 0;
        int p2 = 0;
        int c2 = 0;

        p1 = lerP1();
        c1 = lerC1();
        p2 = lerP2();
        c2 = lerC2();
        
        equilibrioGangorra(p1, c1, c2, p2);
    
    }
    public static int lerP1() {
        int p1 = 0;
        p1 = LER.nextInt();
        return p1;
    }
    public static int lerC1() {
        int c1 = 0;
        c1 = LER.nextInt();
        return c1;
    }
    public static int lerP2() {
        int p2 = 0;
        p2 = LER.nextInt();
        return p2;
    }
    public static int lerC2() {
        int c2 = 0;
        c2 = LER.nextInt();
        return c2;
    }
    public static void equilibrioGangorra(int p1, int c1, int p2, int c2) {

        int ladoEsquerdo = p1 * c1;
        int ladoDireito = p2 * c2;

        if (ladoEsquerdo == ladoDireito) {
            System.out.println("0"); 
        } else if (ladoEsquerdo > ladoDireito) {
            System.out.println("-1"); 
        } else {
            System.out.println("1"); 
        }
    }
}
