import java.util.Scanner;
public class Media {

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        double A = 0;
        double B = 0;
        double C = 0; 
        

        A = lerA(A);
        B = lerB(B);
        C = lerC(C);
        
        
        double media=0;
       
        media = calcMedia(A, B, C);

        imprimirResposta(media);
        
    }
    public static double lerA(double A){
        A = LER.nextDouble();
        return A;
    }
    public static double lerB(double B){
        B = LER.nextDouble();
        return B;
    }
    public static double lerC(double C){
        C = LER.nextDouble();
        return C;
    }
    public static double calcMedia(double A, double B, double C){
       double media = ((A*2) + (B*3) + (C*5))/10;
        return media;
    }
    public static void imprimirResposta(double media) {
        System.out.printf("MEDIA = %.1f\n",media);

    }
}