public class ShapeCreator {

    public static void main(String[] args) {
        Shape shapes[] = new Shape [5];

        Shape circle = new Circle(5);
        shapes[0] = circle;

        Shape square = new Square(4);
        shapes[1] = square;

        Shape rectangle = new Rectangle(8, 2);
        shapes[2] = rectangle;

        Shape ellipse = new Ellipse(3, 3);
        shapes[3] = ellipse;

        Shape triangle = new Triangle(3, 4, 5, 60);
        shapes[4] = triangle;

        displayShape(shapes);
    }

    private static void displayShape(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area is " + shape.calculateArea() + ", " + shape.getClass().getSimpleName() + " perimeter is " + shape.calculatePerimeter());
        }
    }

}
