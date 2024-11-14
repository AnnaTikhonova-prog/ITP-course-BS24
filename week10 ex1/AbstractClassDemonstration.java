public class AbstractClassDemonstration {

    public static void main(String[] args) {
        Creature[] creatures = new Creature[3];

        Creature human = new Human();
        creatures[0] = human;

        Creature dog = new Dog();
        creatures[1] = dog;

        Creature alien = new Alien();
        creatures[2] = alien;

        for (Creature creature : creatures) {
                creature.bear();
                creature.die();
                System.out.print(creature.getName());
                System.out.println();
        }
    }
}
