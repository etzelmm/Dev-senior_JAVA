public class Circle extends Figure {
    //atribute
    private Double radio;

    //constructor
    public Circle(String color, Double radio) {
        super(color);
        this.radio = radio;
    }

    //getter
    public Double getRadio() {
        return radio;
    }

    //Area
    @Override
    public double calculateArea() {
        return Math.pow((3.14 * getRadio()),2);
    }

}
