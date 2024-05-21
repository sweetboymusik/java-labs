public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circ1 = new MyCircle(new MyPoint(10, 20), 5);
        MyCircle circ2 = new MyCircle();

        System.out.println(circ1.getCenterXY());
        System.out.println(circ1.getRadius());
        System.out.println(circ1.getCenter());

        circ1.setCenter(new MyPoint(5, 6));
        circ1.setRadius(7);
        circ1.setCenterY(2);

        System.out.println(circ1.getArea());
        System.out.println(circ1.circumference());
        System.out.println(circ1.distance(circ2));

        System.out.println(circ1);
    }
}
