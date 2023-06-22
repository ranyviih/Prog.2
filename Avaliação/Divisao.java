import java.util.Scanner;

public class Divisao {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) { // criando variaveis e metodos
        // numero de consultas
        int k = 0;

        // coordenadas do ponto divisor
        int n = 0;
        int m = 0;

        // coordenada da residencia
        int x = 0;
        int y = 0;

        while (true) { // pedir infinitamente, ate que digite um 0 para finalizar 
            k = lerK(k);
            if(k == 0){
                break;
            }
            
            n = lerN(n);
            m = lerM(m);

            for (int i = 0; i < k; i++) {
                x = lerX(x);
                y = lerY(y);
                CasosDivisao(x, y, n, m);
            }

            //imprimirResposta(k);
        }
    }

    // leitura das variaveis
    public static int lerK(int k) {
        k = LER.nextInt();
        return k;
    }

    public static int lerN(int n) {
        n = LER.nextInt();
        return n;
    }

    public static int lerM(int m) {
        m = LER.nextInt();
        return m;
    }

    public static int lerX(int x) {
        x = LER.nextInt();
        return x;
    }

    public static int lerY(int y) {
        y = LER.nextInt();
        return y;
    }

    // definindo as entreadas e saidas
    public static void CasosDivisao(int x, int y, int n, int m) {
        if (x == n || y == m) { // residência encontra-se em cima de uma das linhas divisorias
            System.out.println("divisa");

        } else if (x < n && y > m) { // NO se a residência encontra-se na Nlogônia do Noroeste;
            System.out.println("NO");

        } else if (x > n && y > m) { // NE se a residência encontra-se na Nlogônia do Nordeste;
            System.out.println("NE");

        } else if (x > n && y < m) { // SE se a residência encontra-se na Nlogônia do Sudeste;
            System.out.println("SE");

        } else { // caso nenhuma das anteriores o SO encontra-se na residência na Nlogônia do
                 // Sudoeste.
            System.out.println("SO");
        }
    }

    /*public static void imprimirResposta(int k) {
        System.out.println(k);
    }*/

}
