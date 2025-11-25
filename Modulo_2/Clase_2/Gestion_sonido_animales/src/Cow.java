public class Cow extends Animal {
    //constructor
    public Cow(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("La vaca hace MUUUUUUUU");
    }

    //order the cow
    public void order() {
        System.out.println("La vaca se ha ordeniado");
    }
    
}
