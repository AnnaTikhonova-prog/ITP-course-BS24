public class Rectangle extends Shape{

    private double firstSide;
    private double secondSide;

    public Rectangle(double fLength, double sLength) {
        this.firstSide = fLength;
        this.secondSide = sLength;
    }

    @Override
    protected double calculatePerimeter() {
        return firstSide * 2 + secondSide * 2;
    }

    @Override
    protected double calculateArea() {
        return firstSide * secondSide;
    }
}
