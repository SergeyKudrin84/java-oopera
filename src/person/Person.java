package person;

public class Person {
    protected String name;
    protected String surname;
    //поля выше не сделал final, т.к. в современном мире возможно сменить
    protected final Gender gender;//в России запрещено)

    public Person(String name, String surname, Gender gender) {
        this.gender = gender;
        this.surname = surname;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }
}
