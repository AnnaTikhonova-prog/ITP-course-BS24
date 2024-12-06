class Cat extends Animal {
    private int purrLoudness;

    public Cat(int id, String nickname, Owner owner, int purrLoudness) {
        super(id, nickname, owner);
        this.purrLoudness = purrLoudness;
    }

    @Override
    public String toString() {
        return super.toString() + ", Purr Loudness: " + purrLoudness;
    }
}