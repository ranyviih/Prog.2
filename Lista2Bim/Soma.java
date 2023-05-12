import java.util.Scanner;

public class Soma {
   
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int soma = 0;

        a = LER.nextInt();
        b = LER.nextInt();
        soma = a + b;
        System.out.println("SOMA = "+soma);

        LER.close();

    }
}
    /* 
    public static int lerA(int a) {
        a = LER.nextInt();
        return a;  
    }
    public static int lerB(int b) {
        b = LER.nextInt();
        return b;  
    }

    public static int iSoma(int a, int b, int soma) {
        soma = a + b;
        return soma; 
    }

    public static void imprimirResposta(int soma){
        System.out.printf("SOMA = %.4f\n", soma);
    }
}
*/