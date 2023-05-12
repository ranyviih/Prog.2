import java.util.Scanner;
public class DDD {

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int ddd = 0;
        ddd = lerDDD(ddd);

        String Destino = Cidade(ddd);

        imprimirCidade(Destino);
    }
    public static int lerDDD(int ddd){
        ddd = LER.nextInt();
        return ddd;
    }
    public static String Cidade(int ddd) {
        String Destino;

        switch(ddd){
            case 61:
            Destino = "Brasilia";
            break;
            case 71:
            Destino = "Salvador";
            break;
            case 11:
            Destino = "Sao Paulo";
            break;
            case 21:
            Destino = "Rio de Janeiro";
            break;
            case 32:
            Destino = "Juiz de Fora";
            break;
            case 19:
            Destino = "Campinas";
            break;
            case 27:
            Destino = "Vitoria";
            break;
            case 31:
            Destino = "Belo Horizonte";
            break;
            default:
            Destino = "DDD nao cadastrado";
            break;
        }
        return Destino;
    }
    public static void imprimirCidade(String Destino) {
        System.out.printf("%s%n",Destino);
    }
    
}

