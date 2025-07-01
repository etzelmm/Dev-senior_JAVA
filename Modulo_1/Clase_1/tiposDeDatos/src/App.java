import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

       /**Mediante Scanner:
        *
        //Definiedo variables
        byte numero = 127;
        float estatura = 1.76f;
        double salario = 4.000;
        int edad;
        char letra;
        String nombre;

        //Entrada por conosola
        Scanner entrada = new Scanner(System.in);

        //Salida por consola 
        System.out.print("Digite su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();                     //Limpiar buffer para evitar eeror, se pone antes de donde da el error
        System.out.print("Digite nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Digite estatura: ");
        estatura = entrada.nextFloat();
        System.out.print("Digite letra: ");
        letra = entrada.next().charAt(0);

        System.out.println("La edad es: " + edad + " anios");
        System.out.println(nombre);
        System.out.println(estatura);
        System.out.println(letra);
        */ 

        //Mediante Joptions

        String nombre = JOptionPane.showInputDialog("Digite su nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
        float estatura = Float.parseFloat(JOptionPane.showInputDialog("Digite su estatura"));
        char letra = JOptionPane.showInputDialog("Digite su letra").charAt(0);

        JOptionPane.showMessageDialog(null, "su nombre es " + nombre);
        JOptionPane.showMessageDialog(null, "su edad es " + edad);
        JOptionPane.showMessageDialog(null, "su estatura es " + estatura);
        JOptionPane.showMessageDialog(null, "su letra es " + letra);

    }
}
