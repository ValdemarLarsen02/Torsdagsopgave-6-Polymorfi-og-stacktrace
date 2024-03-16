package Task4;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5); // Radius 5
        Shape square = new Square(4); // Sidens længde 4

        ShapeBuilder builder = new ShapeBuilder();
        builder.addShape(circle);
        builder.addShape(square);

        System.out.println("Total area: " + builder.getTotalArea());
    }
}
