public class App {
    public static void main(String[] args) throws Exception {
        var point = new Point(1.0, 3.0);
        point.movePoint(4.0, 2.0);
        point.showCoordinate();
        System.out.println(point.calculateDistanceFromOrigin());
    }
}
