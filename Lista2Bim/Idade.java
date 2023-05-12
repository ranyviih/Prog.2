import java.util.Scanner;
public class Idade {

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int M = 0;
        int A = 0;
        int B = 0;

        M = lerM(M);
        A = lerA(A);
        B = lerB(B);

        int F = idade(M, A, B);

        imprimirResposta(F);
    }
    public static int lerM(int M) {
        M = LER.nextInt();
        return M;
    }
    public static int lerA(int A) {
        A = LER.nextInt();
        return A;
    }
    public static int lerB(int B) {
        B = LER.nextInt();
        return B;
    }
    public static int idade(int M, int A, int B) {
        int F = M - A - B;
       
        if (F > A && F > B){
        System.out.println(F);

        }else if (A > B && A > F){
        System.out.println(A);

        }else{
        System.out.println(B);
        }
        return 0;
    }
    public static void imprimirResposta(int F) {
        System.out.printf("%.1f\n",F);

    }
}
