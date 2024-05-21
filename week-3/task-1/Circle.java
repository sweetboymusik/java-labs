public class Circle {
    private double radius;
    private String color;

    public static final float PI = 3.14f;

    // constructors
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double r) {
        this.radius = r;
    }

    public Circle(String color) {
        this.color = color;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // copy constructor
    public Circle(Circle obj) {
        this.radius = obj.radius;
        this.color = obj.color;
    }

    public void display() {
        System.out.println(this.color + " " + this.radius);
    }

    // getters + setters
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return (PI * this.radius * this.radius);
    }

    public String toString() {
        return "color = " + this.color + ", " + "radius = " + this.radius;
    }

    public static void main(String[] args) {
        Circle circ1 = new Circle(1.4f);
        Circle circ2 = new Circle(5.2f);

        System.out.println(circ1.getArea());
        System.out.println(circ2.getArea());

        // Circle.PI = 10.f;
        // build fails
    }
}
