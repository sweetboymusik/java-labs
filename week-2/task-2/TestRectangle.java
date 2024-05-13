public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(1.5f, 3.2f);
        Rectangle rect2 = new Rectangle(4.6f, 2.7f);

        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());
        System.out.println(rect2.getArea());
        System.out.println(rect2.getPerimeter());
    }
}
