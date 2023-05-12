import java.util.Scanner;

public class Cartas {

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args){
        int A = LER.nextInt();
        int B = LER.nextInt();
        int C;
        if (A == B) C = A;
        else if (A > B) C = A;
        else C = B;
        System.out.println(C);
    }
}

