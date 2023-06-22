import java.util.Scanner;

public class Leilao {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) { // criação das variaveis e metodos

        String nome = "";
        int valor = 0;

        String c = ""; //nome da pessoa que fez o lance
        int v = 0; //valor do lance


        int n = 0; // numero de lances

        for (int i = 0; i < n; i++) {

            c = lerC(c);
            v = lerV(v);

            if (v > valor) { 
                nome = c;
                valor = v;
            }
        }

        n = lerN(n);
        imprimir(nome, valor);
    }

    //leitura das variaveis
    public static String lerC(String c) {
        c = LER.next();
        return c;
    }

    public static int lerV(int v) {
        v = LER.nextInt();
        return v;
    }

    public static int lerN(int n) {
        n = LER.nextInt();
        return n;
    }

    //resposta imprimida
    public static void imprimir(String nome, int valor){
        System.out.println(nome);
        System.out.println(valor);

    }
    
}

