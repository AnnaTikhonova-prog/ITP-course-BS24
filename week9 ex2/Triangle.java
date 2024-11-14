public class Triangle extends Shape{

    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double angle;

    public Triangle(double fLength, double sLength, double tLength, double angle) {
        this.firstSide = fLength;
        this.secondSide = sLength;
        this.thirdSide = tLength;
        this.angle = angle;
    }

    @Override
    protected double calculatePerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    protected double calculateArea() {
        return 0.5 * firstSide * secondSide
                * Math.sin(Math.toRadians(angle));
    }
}
