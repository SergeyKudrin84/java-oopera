package show;

import person.Director;
import person.Person;

public class Opera extends MusicalShow{
    private int choirSize; //думаю что может измениться

    public Opera(String title, Director director, int duration, Person musicAuthor,
                 String librettoText, int choirSize) {
        super(title, director, duration, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }
}
