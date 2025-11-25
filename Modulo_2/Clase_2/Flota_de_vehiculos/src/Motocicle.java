public class Motocicle extends Vehicle implements Startable {
    //atributes
    private Integer engineDisplacement;

    //constructor
    public Motocicle(String brand, String model, Integer year, Integer engineDisplacement) {
        super(brand, model, year);
        this.engineDisplacement = engineDisplacement;
    }

    //getter
    public Integer getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.printf("cilindraje: %d]%n", getEngineDisplacement());
    }    
    
    @Override
    public void move() {
        System.out.println("La moto acelera");
    }

    @Override
    public void start() {
        System.out.println("Moto encendida");
    }
}