import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private final Person choreographer;

    public Ballet(String title, Director director, int duration,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(title, director, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }
}
