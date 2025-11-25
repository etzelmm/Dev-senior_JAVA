public class Truck extends Vehicle {
    //atributes
    private Double loadCapacity;

    //constructor
    public Truck(String brand, String model, Integer year, Double loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    //getter
    public Double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.printf("capacidad de carga: %f]%n", getLoadCapacity());
    }

    @Override
    public void move() {
        System.out.println("El camion se esta moviendo lentamente");
    }
    
}
