import java.util.Scanner;
public class Basquete{
   
    final static Scanner LER = new Scanner(System.in);
 
    public static void main(String[] args){
   
     int D = 0;

        D = lerD(D);

        int pontos = ClassificarCesta(D);

        ImprimirCesta(pontos);

    }
    public static int lerD(int D){
        D = LER.nextInt();
        return D;

    }public static int ClassificarCesta(int D){
        int pontos;

        if(D <= 800){
            pontos = 1;
        }else if(D > 800 && D <= 1400){
            pontos = 2;
        }else{
            pontos = 3;
        }
        return pontos;
    }public static void ImprimirCesta(int pontos){
        System.out.println(pontos);
     
    }
 
}
