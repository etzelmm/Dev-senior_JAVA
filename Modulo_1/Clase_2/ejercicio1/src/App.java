import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        /* 
        float p_origonal = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio original del producto"));
        float porcentaje_des = Float.parseFloat(JOptionPane.showInputDialog("ingrese el porcentaje de descuento"));

        float valor_descuento = (p_origonal / 100) * porcentaje_des;
        float p_final = p_origonal - valor_descuento; 

        System.out.println("El precio original es: " + p_origonal);
        System.out.println("El porcentaje de descuento es: " + porcentaje_des);
        System.out.println("El valor del descuento es: " + valor_descuento);
        System.out.println("El valor final es: " + p_final);
        */

        float notaF;
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota 1"));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota 2"));
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota 3"));

        nota1 *= 0.35;
        nota2 *= 0.25;
        nota3 *= 0.40;
        notaF = nota1 + nota2 + nota3;
        
        System.out.println("el porcentaje de su nota 1 es: " + nota1);
        System.out.println("el procentaje de nota su 2 es: " + nota2);
        System.out.println("el procentaje de su nota 3 es: " + nota3);
        System.out.println("Su nota final es: " + notaF);


    }
}
