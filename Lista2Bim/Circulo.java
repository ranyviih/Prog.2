import java.util.Scanner;

public class Main {
   
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        double raio=0d;
        final double pi = 3.14159;
        double area = 0d;

        raio = lerRaio(raio);

        area = calcArea(raio, pi , area);

        imprimirResposta(area);
    }
    public static double lerRaio(double raio){
        raio = LER.nextDouble();
        return raio;

    }
    public static double calcArea(double raio, double pi, double area){
       
        area = pi * Math.pow(raio,2);
       
        return area;
    }

    public static void imprimirResposta(double area){
        System.out.printf("A=%.4f\n", area);
    }
}
