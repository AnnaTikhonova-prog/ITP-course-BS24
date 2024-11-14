public class Dog extends Animal{

    public Dog(float height, float weight, String color) {
        super(height, weight, color);
    }

    protected void eat() {
        System.out.println("The Dog is eating");
    }

    protected void sleep() {
        System.out.println("The Dog is sleeping");
    }

    protected void makeSound() {
        System.out.println("Huv!");
    }
}
