import java.util.Scanner;
public class Main {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        a = lerA();
        b = lerB();
        
        jogoCartas(a,b);
    }
    public static int lerA() {
        int a = 0;
        a = LER.nextInt();
        return a;
    }
    public static int lerB() {
        int b = 0;
        b = LER.nextInt();
        return b;
    }
    public static void jogoCartas(int a, int b) {
        int x = 0;

        if (a == b){
            x = a;
        }else if (a > b){
            x = a;
        }else{
            x = b;
        }
        System.out.println(x);
    }
}
