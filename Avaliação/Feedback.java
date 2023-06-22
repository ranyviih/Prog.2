import java.util.Scanner;

public class Feedback {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) { // criação das variaveis e metodos
        int n = 0;
        int k = 0;
        int f = 0;

        n = lerN(n);

        for (int i = 0; i < n; i++) {
            k = lerK(k);

            for (int x = 0; x < k; x++) { // pedir novamente o caso de teste
                f = lerF(f);
                casosNum(f);
                imprimirResposta(f);
            }
        }
    }

    // leitura das varaveis
    public static int lerN(int n) {
        n = LER.nextInt();
        return n;
    }

    public static int lerK(int k) {
        k = LER.nextInt();
        return k;
    }

    public static int lerF(int f) {
        f = LER.nextInt();
        return f;
    }

    // metodo para definir a entrada e saida
    public static void casosNum(int n) {
        if (n == 1) {
            System.out.println("Rolien");

        } else if (n == 2) {
            System.out.println("Naej");

        } else if (n == 3) {
            System.out.println("Elehcim");

        } else {
            System.out.println("Odranoel");
        }

    }

    // imprimindo a saida
    public static void imprimirResposta(int n) {
        System.out.println(n);
    }

}