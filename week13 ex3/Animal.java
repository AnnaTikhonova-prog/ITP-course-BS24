abstract class Animal {
    private int id;
    private String nickname;
    private Owner owner;

    public Animal(int id, String nickname, Owner owner) {
        this.id = id;
        this.nickname = nickname;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nickname: " + nickname + ", Owner: " + owner;
    }
}