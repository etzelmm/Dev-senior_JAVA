import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        final Scanner SCANNER = new Scanner(System.in);
        
        System.out.print("Ingrese los celcius: ");
        var celcius = SCANNER.nextDouble();
        System.out.println("""
                INGRESE A QUE LO QUIERE CONVERTIR:
                [1] FAHRENHEIT
                [2] KELVIN
                """);
        var option = SCANNER.nextInt();

        if (option == 1) {
            var fahrenheit = celcius * 9/5 + 32;
            System.out.printf("%.2f celcius convertido a grados fahreinheit son: %.2f%n", celcius, fahrenheit);
        }else if (option == 2) {
            var kelvin = celcius + 273.15;
            System.out.printf("%.2f celcius convertido a grados kelvin son: %.2f%n", celcius, kelvin);
        }else {
            System.out.println("""
                ERORR.....
                INGRESE UNA OPCION VALIDA 
            """);
        }

        SCANNER.close();
    }
}
