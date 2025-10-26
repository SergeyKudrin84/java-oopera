import java.util.ArrayList;

public class Show {
    private final String title;
    private final Director director; //другой режиcсер - другое шоу
    private int duration; //длительность в минутах теоретически со временем может измениться, не стал делать final
    private ArrayList<Actor> listOfActors = new ArrayList<>(); //актеры могут меняться

    public Show(String title, Director director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void printDirector(){
        System.out.println("Режиссер: " + director);
    }

    public void printListOfActors(){
        System.out.println("Список актеров:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addNewActor(Actor newActor){
        if (listOfActors.contains(newActor)){
            System.out.println("Действие отменено! Актер " + newActor + " уже участвует в этом представлении.");
        }else {
            listOfActors.add(newActor);
            System.out.println("Актер " +newActor+ "добавлен в представление \"" +title+ "\".");
            // \"" +title+ "\"." добавил для наглядности. Если сообщение для интерфейса пользователя будет, то можно без этого уточнения
        }
    }

    public void replaceActor(String replacementActorSurname, Actor newActor){

        //Считаю такую реализации правильной, т.к. могут быть однофамильцы
        /*public void replaceActor(Actor replacementActor, Actor newActor){
        if (listOfActors.contains(newActor)){
            System.out.println("Действие отменено! Актер " + newActor + " уже участвует в этом представлении.");
        }else if (!listOfActors.contains(replacementActor)) {
            System.out.println("Действие отменено! Актер " + replacementActor + " не участвует в представлении.");
        }else {
            listOfActors.remove(replacementActor);
            listOfActors.add(newActor);
            System.out.println("Актер " + replacementActor + "заменен на " +newActor);
        }*/
        //Т.к в ТЗ сказано искать по фамилии, то переберем список и заменим первого с подходящей фамилией
        if (listOfActors.contains(newActor)){
            System.out.println("Действие отменено! Актер " + newActor + " уже участвует в этом представлении.");
            return;
        }
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(replacementActorSurname)){
                listOfActors.set(i,newActor);
                System.out.println("Актер " + actor + " заменен на " + newActor);
                return;
            }
        }
        System.out.println("Действие отменено! Актер с фамилией " + replacementActorSurname + " не участвует в " +
                "представлении.");
    }
}
