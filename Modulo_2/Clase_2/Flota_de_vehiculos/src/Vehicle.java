public class Vehicle {
    //atributes
    private String brand;
    private String model;
    private Integer year;

    //constrcutor
    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //getters
    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public Integer getYear() {
        return year;
    }

    //show all information of vehicle
    public void showInformation() {
        System.err.printf("Vehiculo= [marca: %s %nmodelo: %s %nanio: %d%n", getBrand(), getModel(), getYear());
    }

    //print messege of movement
    public void move() {
        System.out.println("EL vehiculo se esta moviendo");
    }
}
