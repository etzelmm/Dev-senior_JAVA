public class App {
    public static void main(String[] args) throws Exception {
        var vehiculo1 = new Motocicle("mazda", "3", 2025, 600);
        vehiculo1.showInformation();
        vehiculo1.move();
        vehiculo1.start();

        Startable vehiculo2 = new Car("Chvrolet", "GI", 2021, 4);
        vehiculo2.start();
        
    }
}
