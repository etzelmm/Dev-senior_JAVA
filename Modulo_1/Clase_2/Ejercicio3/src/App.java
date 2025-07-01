import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int estrato;
        double precio;


        Scanner entrada = new Scanner(System.in);

        System.out.print("digite su estrato: ");
        estrato = entrada.nextInt();
        System.out.print("Digite el precio de la vivienda:");
        precio = entrada.nextDouble();

        if (estrato > 6 || estrato < 0) {
            System.out.println("ERROR");
        } else if (estrato == 0) {
            precio -= 5000000;
            System.out.println("el precio de la vivienda queda en: " + precio);
        } else if (estrato == 1) {
            precio -= 3500000;
            System.out.println("el precio de la vivienda queda en: " + precio);
        }else if (estrato == 2) {
            precio -= 2500000;
            System.out.println("el precio de la vivienda queda en: " + precio);
        }else if (estrato == 3) {
            precio -= 1000000;
            System.out.println("el precio de la vivienda queda en: " + precio);
        }else if (estrato == 4) {
            System.out.println("el precio de la vivienda queda en: " + precio);
        }else if (estrato == 5) {
            precio += 2500000;
            System.out.println("el precio de la vivienda queda en: " + precio);
        }else {
            precio += 5000000;
            System.out.println("el precio de la vivienda queda en: " + precio);
        }

    }
}
