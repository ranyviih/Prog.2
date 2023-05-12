import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        Scanner LER = new Scanner(System.in);

		double A = 0; 
		double B = 0; 
		double C = 0; 

        A = lerA(A);
        B = lerB(B);
        C = lerC(C);

        double x = 0;
		
        x = calcX(x);

        imprimirResposta(x);
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

    public static void calcX(double A, double B, double C, double x){
        if (B > A && B > C) {
			x = A;
			A = B;
			B = x;
		} else if (C > A) {
			x = A;
			A = C;
			C = x;
		}    
		
		if (A >= (B + C)) { 
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (A*A == (B*B) + (C*C)) System.out.println("TRIANGULO RETANGULO");
			if (A*A > (B*B) + (C*C)) System.out.println("TRIANGULO OBTUSANGULO");
			if (A*A < (B*B) + (C*C)) System.out.println("TRIANGULO ACUTANGULO");
			if (A == B && A == C) System.out.println("TRIANGULO EQUILATERO");
			if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) System.out.println("TRIANGULO ISOSCELES");
		}
	}
	
}