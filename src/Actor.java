import java.util.Objects;

public class Actor extends Person {
    private final int height; //хотя операции по изменению роста тоже делают


    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return getName() +
                " " + getSurname() +
                " (рост " + height + " см.)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname()) &&
                Objects.equals(height, actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }
}
