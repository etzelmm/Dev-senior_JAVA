public class Car {
    //atributes
    private String brand;
    private String model;
    private Integer fabricateYear;
    private Double currentspeed;
    private Boolean switchMotor;
    
    //constructor
    public Car(String brand, String model, Integer fabricateYear){
        this.brand = brand;
        this.model = model;
        this.fabricateYear = fabricateYear;
        currentspeed = 0.0;
        switchMotor = false;
    }

    public Car(String brand, String model) {
        this(brand, model, 2025);
    }

    //getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getFabricateYear() {
        return fabricateYear;
    }

    public Double getCurrentspeed() {
        return currentspeed;
    }

    public Boolean getSwitchMotor() {
        return switchMotor;
    }

    //methods
    public void switchOnMotor() {
        if (!switchMotor) {
            switchMotor = true;
        } else {
            System.out.println("Motor ya encendido");
        }
    }

    public void switchOffMotor() {
        if (switchMotor && currentspeed == 0) {
            switchMotor = false;
        } else {
            System.out.println("No es posible apagar el motor");
        }
    }

    public void accelerate(Double aceleration) {
        if (switchMotor && aceleration > 0) {
            currentspeed = currentspeed + aceleration;
        } else {
            System.out.println("No es posible acelerar");
        }
    }

    public void brake(Double deceleration) {
        if (switchMotor && deceleration > 0 && deceleration <= currentspeed) {
            currentspeed = currentspeed - deceleration;
        }   else {
            System.out.println("No es posible frenar");
        }
    }

    public void seeState() {
        System.out.println(String.format(
            "Carro= [marca: %s, modelo: %s, anio de fabricacion: %s, velocidad actual: %s, motor encendido: %s]", 
            brand, model, fabricateYear.toString(), currentspeed.toString(), switchMotor.toString()));
    }

}
