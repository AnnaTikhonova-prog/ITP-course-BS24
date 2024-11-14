public class Alien extends Creature{

    @Override
    public void bear() {
        this.setAlive(true);
        this.setName("Allan");
        this.setPlanet("Alpha");
        System.out.println("The " + this.getClass().getSimpleName() + " " + getName() + " from" + getPlanet());
    }

    @Override
    public void die() {
        this.setAlive(false);
        this.setName(null);
        this.setPlanet(null);
        System.out.println("The " + this.getClass().getSimpleName() + " " + getName() + " from" + getPlanet() + " was killed");
    }
}
