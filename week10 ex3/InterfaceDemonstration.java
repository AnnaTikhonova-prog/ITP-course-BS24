public class InterfaceDemonstration {
    public static void main(String[] args) {
        Living[] livings = new Living[2];

        Duck duck = new Duck();
        livings[0] = duck;

        Penguin penguin = new Penguin();
        livings[1] = penguin;

        for (Living living : livings) {
            living.live();
        }
    }
}
