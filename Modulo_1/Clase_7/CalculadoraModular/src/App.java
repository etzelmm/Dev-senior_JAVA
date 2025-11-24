import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var input = new Scanner(System.in); 

        mostrarMenu(input);

        input.close();

    }

    private static void mostrarMenu(Scanner sc) {
        int opc;
        do {
            System.out.println("""
                    \n********** BIENVENIDO A LA CALCULADORA **********
                    ==================================================
                    1. SUMAR
                    2. RESTAS
                    3. MULTIPLICAR
                    4. DIVIDIR
                    5. RESIDUO DE DIVISION
                    0. SALIR
                    """);
            opc = leerEntero(sc, "Elija una opcion del menu: ");

            switch (opc) {
                case 1:
                    suma(sc);
                    continue;
                case 2:
                    resta(sc);
                    continue;
                case 3:
                    multiplicacion(sc);
                    continue;
                case 4:
                    division(sc);
                    continue;
                case 5:
                    modulo(sc);
                    continue;
                case 0:
                    opc = 0;
                    break;
                default:
                    System.out.println("ERROR: INGRESE UNA OPCION CORRECTA");
                    break;
            }

        } while ( opc != 0);
    }


    private static int leerEntero(Scanner input, String mensaje) {
        System.out.print(mensaje);
        var entrada = input.nextInt();
        input.nextLine();
        return entrada;
    }

    private static Double leerDouble (Scanner input, String mensaje) {
        System.out.print(mensaje);
        var entrada = input.nextDouble();
        input.nextLine();
        return entrada;
    }

    private static void suma (Scanner input) {
        System.out.println(":::: SUMA ::::");
        var num1 = leerDouble(input, "Ingrese el valor 1: ");
        var num2 = leerDouble(input, "Ingrese el valor 2: ");

        var resultado = num1 + num2;
        System.out.printf("%nEl resultado de la suma de %.2f y %.2f es igual a: %.2f%n", num1, num2, resultado);
    }

    private static void resta(Scanner input) {
        System.out.println(":::: RESTA ::::");
        var num1 = leerDouble(input, "Ingrese el valor 1: ");
        var num2 = leerDouble(input, "Ingrese el valor 2: ");

        var resultado = num1 - num2;
        System.out.printf("%nEl resultado de la resta de %.2f y %.2f es igual a: %.2f%n", num1, num2, resultado);
    }

    private static void multiplicacion(Scanner input) {
        System.out.println(":::: MULTIPLICACION ::::");
        var num1 = leerDouble(input, "Ingrese el valor 1: ");
        var num2 = leerDouble(input, "Ingrese el valor 2: ");

        var resultado = num1 * num2;
        System.out.printf("%nEl resultado de la multiplicacion de %.2f y %.2f es igual a: %.2f%n", num1, num2, resultado);
    }

    private static void division(Scanner input) {
        System.out.println(":::: DIVISION ::::");
        var num1 = leerDouble(input, "Ingrese el valor 1: ");
        var num2 = leerDouble(input, "Ingrese el valor 2: ");

        var resultado = num1 / num2;
        System.out.printf("%nEl resultado de la division de %.2f y %.2f es igual a: %.2f%n", num1, num2, resultado);
    }

    private static void modulo(Scanner input) {
        System.out.println(":::: MODULO ::::");
        var num1 = leerDouble(input, "Ingrese el valor 1: ");
        var num2 = leerDouble(input, "Ingrese el valor 2: ");

        var resultado = num1 % num2;
        System.out.printf("%nEl resultado del modulo de %.2f y %.2f es igual a: %.2f%n", num1, num2, resultado); 
    }
}
