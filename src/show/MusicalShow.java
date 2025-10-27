package show;

import person.Director;
import person.Person;

public class MusicalShow extends Show {
    private final Person musicAuthor; //другой композитор - другое шоу
    private String librettoText; //может меняться: опечатки, корректировки

    public MusicalShow(String title, Director director, int duration, Person musicAuthor,
                       String librettoText) {
        super(title, director, duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibretto(){
        System.out.println("Либретто:");
        System.out.println(librettoText);
    }
}
