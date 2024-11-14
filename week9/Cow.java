public class Cow extends Animal {
    public Cow(float height, float weight, String color) {
        super(height, weight, color);
    }

    protected void eat() {
        System.out.println("The Cow is eating");
    }

    protected void sleep() {
        System.out.println("The Cow is sleeping");
    }

    protected void makeSound() {
        System.out.println("Muuu!");
    }
}
