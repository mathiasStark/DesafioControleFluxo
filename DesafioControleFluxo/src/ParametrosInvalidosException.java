import java.util.Scanner;

public class ParametrosInvalidosException extends Exception{
    public void mensagem() {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }

}
