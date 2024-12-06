import java.util.*;

class Owner {
    private String name;
    private String surname;
    private int age;

    public Owner(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (Age: " + age + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Owner owner = (Owner) obj;
        return age == owner.age && name.equals(owner.name) && surname.equals(owner.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}