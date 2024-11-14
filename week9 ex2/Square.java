public class Square extends Shape {

    private double side;

    public Square(double length) {
        this.side = length;
    }

    @Override
    protected double calculatePerimeter() {
        return side * 4;
    }

    @Override
    protected double calculateArea() {
        return Math.pow(side, 2);
    }

}
