class Cat extends Animal {
    private int purLoudness;

    public Cat(String nickname, int purLoudness) {
        super(nickname);
        this.purLoudness = purLoudness;
    }

    @Override
    public void voice() {
        System.out.println(getNickname() + " says: Meow with loudness " + purLoudness);
    }
}
