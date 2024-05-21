public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle tri1 = new MyTriangle(new MyPoint(0, 0), new MyPoint(23, 13), new MyPoint(34, 10));

        System.out.println(tri1);
        System.out.println(tri1.getPerimiter());
        System.out.println(tri1.getType());
    }
}
