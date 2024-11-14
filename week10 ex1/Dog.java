public class Dog extends Creature{

    @Override
    public void bear() {
        this.setAlive(true);
        this.setName("Rex");
        this.setPlanet("Earth");
        System.out.println("The " + this.getClass().getSimpleName() + " " + getName() + " from" + getPlanet());
    }

    @Override
    public void die() {
        this.setAlive(false);
        this.setName(null);
        this.setPlanet(null);
        System.out.println("The " + this.getClass().getSimpleName() + " " + getName() + " from" + getPlanet() + " has died");
    }

    public void bark() {
        System.out.println("Huv!");
    }
}
