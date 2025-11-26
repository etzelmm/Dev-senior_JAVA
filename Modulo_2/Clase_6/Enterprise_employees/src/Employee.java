public class Employee extends Person {
    //atributes
    private Double salsary;

    //constructor
    public Employee(String name, Integer age, Double salsary) {
        super(name, age);
        this.salsary = salsary;
    }

    //getter
    public Double getSalsary() {
        return salsary;
    }

    @Override
    public void showInfomation() {
        System.out.printf("El empleado %s tiene %d anios y gana %.2f pesos%n",getName(), getAge(), getSalsary());
    }

    @Override
    public String toString() {
        return String.format("El empleado %s tiene %d anios y gana %.2f pesos%n",getName(), getAge(), getSalsary());
    }
    
}
