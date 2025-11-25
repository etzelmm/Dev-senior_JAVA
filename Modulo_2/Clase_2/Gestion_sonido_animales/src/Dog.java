public class Dog extends Animal implements CanJump {
    //atributes
    private String breed;

    //constructor
    public Dog(String name, Integer age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    //getter
    public String getBreed() {
        return breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("El perro ladra");
    }

    @Override
    public void jump() {
        System.out.println("El perro salta");
    }
    

}
