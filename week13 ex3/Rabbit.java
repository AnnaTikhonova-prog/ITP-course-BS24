class Rabbit extends Animal {
    private double earLength;

    public Rabbit(int id, String nickname, Owner owner, double earLength) {
        super(id, nickname, owner);
        this.earLength = earLength;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ear Length: " + earLength;
    }
}
