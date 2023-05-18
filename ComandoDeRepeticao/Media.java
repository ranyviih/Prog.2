import java.util.Scanner;
public class Media {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int contar = 0;
        double media = 0d;
        double x = 0d;

        imprimirPositivo(contar, media, x);
        //imprimirMedia(media, contar);
    }

    public static void imprimirPositivo(int contar, double media, double x) {
        for(int i = 0; i < 6; i++ ){
            x = LER.nextFloat();

            if (x > 0){
                contar++;
                media += x;
                media = media / contar;
            }
        }
        System.out.println(contar + " valores positivos"); 
        System.out.printf("%.1f\n", media); 
    }

   /*  public static void imprimirMedia(double media, int contar) {
        media = media / contar;
        System.out.println( media);
    }*/
}
