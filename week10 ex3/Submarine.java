public class Submarine implements Swimmable{

    boolean isSwimming = false;

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
}
