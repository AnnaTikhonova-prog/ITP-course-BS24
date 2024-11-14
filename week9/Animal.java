public class Animal {
    protected float weight;
    protected float height;
    protected String color;

    public Animal(float weight, float height, String color) {
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    protected void sleep(){
        System.out.println("Sleeping...");
    }

    protected void eat(){
        System.out.println("Eating...");
    }

    protected void makeSound(){
        System.out.println("Making Sound...");
    }

    public String toString(){
        return this.getClass().getSimpleName() + "{" + "height=" + height + ", weight=" + weight + ", color='" + color + '\'' + '}';
    }
}
