import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
    
        try{
            int contador = calcula(n1, n2);
            for (int i = 1; i <= contador; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        }catch(ParametrosInvalidosException e) {
            e.mensagem();
        }
    }

    static int calcula(int n1, int n2) throws ParametrosInvalidosException {
        if(n2 < n1)
            throw new ParametrosInvalidosException();
        int contador = n2 - n1;
        return contador;
    }
}
