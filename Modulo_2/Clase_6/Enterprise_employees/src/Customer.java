public class Customer extends Person {
    //atributes
    private String numberPhone;

    //cpnstructor
    public Customer(String name, Integer age, String numberPhone) {
        super(name, age);
        this.numberPhone = numberPhone;
    }

    //getter
    public String getNumberPhone() {
        return numberPhone;
    }

    @Override
    public void showInfomation() {
        System.out.printf("El cliente %s de %d anios, con numero de telefono: %s%n", 
        getName(), getAge(), getNumberPhone());
    }

    @Override
    public String toString() {
        return String.format("El cliente %s de %d anios, con numero de telefono: %s%n", 
        getName(), getAge(), getNumberPhone());
    }

    
}
