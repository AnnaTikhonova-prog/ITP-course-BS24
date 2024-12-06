class Dog extends Animal {
    private int barkingLoudness;

    public Dog(String nickname, int barkingLoudness) {
        super(nickname);
        this.barkingLoudness = barkingLoudness;
    }

    @Override
    public void voice() {
        System.out.println(getNickname() + " says: Woof with loudness " + barkingLoudness);
    }
}