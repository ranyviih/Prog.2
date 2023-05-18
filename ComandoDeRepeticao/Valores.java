import java.util.Scanner;
public class Valores {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
    
        float x = 0f;

        int contarPositivos = 0;
        int contarNegativos = 0;

        imprimirPares();
        imprimirImpares();
        imprimirPositivos(contarPositivos, x);
        imprimirNegativos(contarNegativos, x);
        
    }

    //pares
    public static void imprimirPares() {
        for (int m = 1; m < 5; m++) {
    		if (m % 2 == 0)
            System.out.println(m + " valor(es) par(es)");
    	}
    } 

    //negativo
    public static void imprimirImpares() {
        for (int a = 1; a < 5; a++) {
    		if (a % 2 == 1)
            System.out.println(a + " valor(es) impar(es)");
    	}
    } 

    //positivos
    public static void imprimirPositivos(int contarPositivos, float x) {
        for(int b = 0; b < 5; b++ ){
            x = LER.nextFloat();
            if (x > 0) contarPositivos++;
        } 
        System.out.println(contarPositivos + " valor(es) positivo(s)");  
    }

    //negativo
    public static void imprimirNegativos(int contarNegativos, float x) {
        for(int i = 0; i < 5; i++ ){
            x = LER.nextFloat();
            if (x < 0) contarNegativos++;
        } 
        System.out.println(contarNegativos + " valor(es) negativo(s)");  
    }
}
