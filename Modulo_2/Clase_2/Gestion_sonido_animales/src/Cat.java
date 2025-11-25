public class Cat extends Animal implements CanJump{
    //atributes
    private String breed;

    //constructor
    public Cat(String name, Integer age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    //getter
    public String getBreed() {
        return breed;
    }
    
    @Override
    public void makeNoise() {
        System.out.println("EL gato maulla");
    }

    @Override
    public void jump() {
        System.out.println("El gato salta");
    }
    
}
