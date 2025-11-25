public class Rectangle  extends Figure{
    //atributes
    private Double base;
    private Double higth;

    //constrcutor
    public Rectangle(String color, Double base, Double higth) {
        super(color);
        this.base = base;
        this.higth = higth;
    }

    //getters
    public Double getBase() {
        return base;
    }

    public Double getHigth() {
        return higth;
    }

    //setter
    public void setBase(Double base) {
        this.base = base;
    }

    public void setHigth(Double higth) {
        this.higth = higth;
    }

    @Override
    public double calculateArea() {
        return getBase() * getHigth();
    }
    
}
