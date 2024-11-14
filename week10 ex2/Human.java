public class Human extends Animal{

    @Override
    public void bear() {
        this.setAlive(true);
        this.setName("George");
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
}
