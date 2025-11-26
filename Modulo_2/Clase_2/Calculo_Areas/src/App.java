public class App {
    public static void main(String[] args) throws Exception {

            Figure figura1 = new Circle("Rojo", 9.5);
            System.out.printf("EL area de la figura es de: %f",figura1.calculateArea());
            System.err.println("");

            figura1 = new Rectangle("Rojo", 5.0, 2.0);
            System.out.printf("EL area de la figura es de: %f",figura1.calculateArea());
            System.err.println("");


    }
}
