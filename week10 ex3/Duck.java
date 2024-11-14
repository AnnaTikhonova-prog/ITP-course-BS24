public class Duck implements Living, Swimmable, Flyable{

    boolean isSwimming = false;
    boolean isFlying = false;

    @Override
    public void swim() {
        isSwimming = true;
        System.out.println("The " + this.getClass().getSimpleName() + " is swimming");
    }

    @Override
    public void stopSwimming() {
        isSwimming = false;
        System.out.println("The " + this.getClass().getSimpleName() + " stopped swimming");

    }

    @Override
    public void fly() {
        isFlying = true;
        System.out.println("The " + this.getClass().getSimpleName() + " is flying");
    }

    @Override
    public void stopFlying() {
        isFlying = false;
        System.out.println("The " + this.getClass().getSimpleName() + " stopped flying");
    }
}
