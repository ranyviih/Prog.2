import java.util.Scanner;
public class Lanche {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String args[]) {
        int codigo = 0; 
		int quantidade = 0;
        int total = 0;

        codigo = lerCodigo(codigo);
        quantidade = lerQuantidade(quantidade);

        total = lerTotal(codigo, quantidade, total);

        imprimirResposta(codigo, total);   
    }

    public static int lerCodigo(int codigo) {
        codigo = LER.nextInt();
        return codigo;
    }
    public static int lerQuantidade(int quantidade) {
        quantidade = LER.nextInt();
        return quantidade;
    }
    public static int lerTotal(int quantidade, int codigo, double total){
        switch (codigo) {
            case 1:
            total = quantidade * 4.00;
                break;
            case 2:
            total = quantidade * 4.50;
                break;
            case 3:
            total = quantidade * 5.00;
                break;
            case 4:
            total = quantidade * 2.00;
                break;
            case 5:
            total = quantidade * 1.50;
                break;
            default:
                System.out.println("Código inválido");
            break;
        }
        return codigo;
    }
	 	
    public static void imprimirResposta(int codigo, double total){
        System.out.println(String.format("Total: R$ %.2f", total));
    }
}
