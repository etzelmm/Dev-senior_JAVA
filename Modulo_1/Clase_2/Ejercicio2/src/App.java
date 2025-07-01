import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite un numero: ");
        numero = entrada.nextInt();

        if (numero == 0){
            System.out.println("numero es nulo");
        }else if (numero > 0){
            System.out.println("numero es positivo");
        }else {
            System.out.println("numero es negativo");
        }

    }
}
