import java.util.Scanner;
public class Cinco {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int x = 0;
        int contar = 0;

        imprimirPares(x, contar);
    }
    public static void imprimirPares(int x, int contar) {
        for (int i = 0; i < 5; i++) {
        	x = LER.nextInt();
        	if (x % 2 == 0 ) contar++;
        }
        System.out.println(contar + " valores pares");
    }
}