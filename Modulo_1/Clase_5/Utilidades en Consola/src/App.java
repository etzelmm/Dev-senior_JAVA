import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        int opc, opc2;

        do {
            // Mostrando menu y obteniedo respuesta por consola
            System.out.println("""
                    \n********* UTILIDADES CONSOLA *********
                    [1]. Calcular Área de una Figura
                    [2]. Calcular Edad Futura.
                    [3]. Verificar si un Número es Primo.
                    [0]. Salir del programa.
                    """);
            System.out.print("Eliga una opcion valida: ");
            opc = entrada.nextInt();

            // Realizando funcionalidad segun opcion elegida
            switch (opc) {
                case 1:
                    do{
                        //menu para elegir figura
                        System.out.println("""
                                ELIJA EL AREA DE LA FIGURA QUE QUIERE CLACULAR:
                                [1]. CIRCULO
                                [2]. RECTANGULO
                                [0]. VOLVER AL MENU ANTERIOR
                                """);
                                System.out.print("Elija una opcion: ");
                                opc2 = entrada.nextInt();

                                switch (opc2){
                                    // Area del circulo
                                    case 1:
                                        //obteniedo datos para calcular area
                                        System.out.print("Ingrese el radio del circulo: ");
                                        var r_cir = entrada.nextDouble();

                                        var a_cir = Math.pow(r_cir, 2) * 3.1416;    // se mantiene pi como constante
                                        System.out.printf("%nEl area del circulo con radio %.2f es igual a: %.2f %n", r_cir, a_cir);     // Se muestra formateado
                                        opc2 = 0;   // opc2 se iguala a 0 para que salga del while
                                        break;      // se para la ejecucion sel switch case

                                    // Area del rectangulo
                                    case 2:
                                        //obteniendo datos para aclcular el area
                                        System.out.print("Ingrese la base del rectagulo: ");
                                        var b_rectangulo = entrada.nextDouble();
                                        System.out.print("Ingrese la altura del rectangulo: ");
                                        var h_rectangulo = entrada.nextDouble();

                                        var a_rectangulo = b_rectangulo * h_rectangulo;     //Formula para sacar area
                                        //Se muestra formateado el resultado
                                        System.out.printf("%n El area del rectangulo con base %.2f y altuta %.2f es igual a: %.2f %n", b_rectangulo, h_rectangulo, a_rectangulo);
                                        opc2 = 0;   // opc2 se iguala a 0 para que salga del while
                                        break;      // se para la ejecucion sel switch case

                                    //Volver al menu
                                    case 0:
                                        opc2 = 0; // opc2 se iguala a 0 para que salga del while
                                        break;

                                    // Caso de opcion incorrecta
                                    default:
                                        System.out.println("ERROR: Ingrese una opcion correcta");
                                        continue; // se indica continuar a la siguioente iteracion del while para que vuelva a mostrar el menu
                                }
                    }while (opc2 != 0);
                    break;
                
                //edad futura    
                case 2:
                    //obteniendo datos necesarios del usuario
                    System.out.print("Ingrese su anio de nacimiento: ");
                    var anio_nacimiento = entrada.nextInt();
                    System.out.print("\nIngrese el anio futuro: ");
                    var anio_futuro = entrada.nextInt();

                    // validando data correcta
                    if (anio_futuro <= anio_nacimiento){
                        System.out.println("ERROR: El anio futuro no puede ser menor o igual a su anio de nacimiento");
                        break;
                    }else{
                        //calculando edad segun fechas
                        var edad = anio_futuro - anio_nacimiento;

                        //mostrando formateado
                        System.out.printf("La edad que tendra en el anio %d es de %d %n", anio_futuro, edad);
                    break;
                    }

                //vereficar numero primo    
                case 3:
                    //obteniendo datos necesarios del usuario
                    System.out.print("Ingrese un numero entero mayor a uno: ");
                    var num = entrada.nextInt();

                    //validando que el numero sea mayor a 1
                    if (num <= 1){
                        System.out.println("ERORR: el valor ingresado es menor o igual a 1");
                        break;
                    }else if (num == 2){
                        System.out.println("El numero dos es un numero primo");
                        break;
                    }


                    //Validando que el numeor sea primo
                    for (int i=2; i<num; i++){      // El cilo pasa por todos los numero del 2 al numero y si el modulo es 0 para
                        if (num % i == 0){
                            System.out.printf("el numero %d no es un numero primo %n", num);
                            break;
                        }else {
                            System.out.printf("El numero %d si es un numero primo %n", num);
                            break;
                        }
                    }
                    break;

                // salir del programa    
                case 0:
                    opc = 0;  // se iguala a 0 para cumplir la condicion del ciclo
                    break;
                default:
                    System.out.println("ERROR: ingrese una opcion valida");
                    break;
            }
        } while (opc != 0);


    }
}
