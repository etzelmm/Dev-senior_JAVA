import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        var book1 = new Book();
        var book2 = new Book("Programacion en java", "Alberto Murillo", 460);
        var book3 = new Book("Aprende ingles", "english op", 300,
         LocalDate.of(2015, 10, 5), "English university", "Aprendizaje");
        
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        var persona1 = new Person("Etzel", "Molina", "etzelmm@gmail.com", "3204659781");
        var persona2 = new Person();

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }
}
