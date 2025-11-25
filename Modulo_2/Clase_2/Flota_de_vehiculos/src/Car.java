public class Car extends Vehicle implements Startable {
    //atributes
    private Integer numberDoors;

    //constructor
    public Car(String brand, String model, Integer year, Integer numberDoors) {
        super(brand, model, year);
        this.numberDoors = numberDoors;
    }
    
    //getter
    public Integer getNumberDoors() {
        return numberDoors;
    }
    
    @Override
    public void showInformation() {
        super.showInformation();
        System.out.printf("numero de puerta: %d]%n", getNumberDoors());
    }

    @Override
    public void move() {
        System.out.println("EL carro avanza");
    }

    //start the car
    @Override
    public void start() {
        System.out.println("Carro encendido");
    }
}
