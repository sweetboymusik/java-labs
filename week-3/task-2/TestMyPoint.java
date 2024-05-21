public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(10, 23);
        MyPoint point2 = new MyPoint(5, 4);

        System.out.println(point1.getX());
        System.out.println(point1.getY());

        point1.setXY(6, 22);

        System.out.println(point1.distance());
        System.out.println(point1.distance(2, 27));
        System.out.println(point1.distance(point2));

        System.out.println(point1);
    }

}
