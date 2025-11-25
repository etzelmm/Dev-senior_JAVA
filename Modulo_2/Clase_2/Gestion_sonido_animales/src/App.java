public class App {
    public static void main(String[] args) throws Exception {
        Animal animal1 = new Cow("Lola", 6);
        animal1.makeNoise();

        var animal2 = new Cow("Eto", 7);
        animal2.order();

        CanJump animal3 = new Dog("Eco", 5, "Pitbull");
        animal3.jump();

        var animal4 = new Dog("Bethoven", 9, "Pastor");
        animal4.jump();
        animal4.makeNoise();

        CanJump animal5 = new Cat("PIT", 9, "Egipcio");
        animal5.jump();

        var animal6 = new Cat("Luna", 3, "Cruzado");
        animal6.makeNoise();
    }
}
