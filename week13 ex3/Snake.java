class Snake extends Animal {
    private int venomDanger;

    public Snake(int id, String nickname, Owner owner, int venomDanger) {
        super(id, nickname, owner);
        this.venomDanger = venomDanger;
    }

    @Override
    public String toString() {
        return super.toString() + ", Venom Danger: " + venomDanger;
    }
}