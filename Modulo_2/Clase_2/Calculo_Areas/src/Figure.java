public abstract class Figure {
    //atributes
    private String color;

    //constructor
    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Area
    public abstract double calculateArea(); 
    
}
