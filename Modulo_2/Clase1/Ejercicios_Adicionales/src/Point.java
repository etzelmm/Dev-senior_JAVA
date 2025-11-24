public class Point {
    //atributes
    private Double x;
    private Double y;

    //constructors
    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    //getters
    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    //setters
    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    //methods
    public void movePoint(Double moveX, Double moveY) {
        this.x = x + moveX;
        this.y = y + moveY;
    }  

    public Double calculateDistanceFromOrigin() {
        //var distance = Math.sqrt( (Math.pow(this.x, 2)) + (Math.pow(this.y, 2)) );
        var distance = Math.hypot(this.x, this.y);
        return distance;
    }

    public void showCoordinate() {
        System.out.println(String.format("La cordenada del punto es: %s en x, %s en y.", x.toString(), y.toString()));
    }
}
