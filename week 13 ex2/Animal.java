import java.util.Objects;

abstract public class Animal {

    private String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public abstract void voice();


     @Override
     public int hashCode() {
         return Objects.hash(nickname);
     }
}
