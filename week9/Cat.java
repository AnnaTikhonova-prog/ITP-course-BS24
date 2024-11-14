public class Cat extends Animal{

    public Cat(float height, float weight, String color) {
        super(height, weight, color);
    }

    protected void eat() {
        System.out.println("The Cat is eating");
    }

    protected void sleep() {
        System.out.println("The Cat is sleeping");
    }

    protected void makeSound() {
        System.out.println("Meow!");
    }
}
