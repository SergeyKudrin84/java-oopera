public class Theatre {

    public static void main(String[] args) {

        System.out.println("Поехали!");

        //1. Создать трёх актеров и двух режиссёров. Также создайте одного автора музыки и одного хореографа
        Director directorOfBallet = new Director("Алла", "Сигалова", Gender.FEMALE, 3);
        Director directorOfOpera = new Director("Александр", "Титель", Gender.MALE, 8);

        Actor actorSkvortsova = new Actor("Мария", "Скворцова", Gender.FEMALE, 165);
        Actor actorRumyntsev = new Actor("Вениамин", "Румянцев", Gender.MALE, 181);
        Actor actorKotov = new Actor("Дмитрий", "Котов", Gender.MALE, 173);

        Person musicAuthor = new Person( "Людвиг", "Бетховен", Gender.MALE);
        Person choreographer = new Person( "Рудольф", "Нуреев", Gender.MALE);

        //2. Создать три спектакля: обычный, оперный и балет
        String librettoText = "Либретто баллета \"Щелкунчик\"";
        Ballet ballet = new Ballet("Щелкунчик", directorOfBallet, 120, musicAuthor, librettoText,
                choreographer);
        librettoText = "Либретто оперы \"Тихий Дон\"";
        Opera opera = new Opera("Тихий Дон",directorOfOpera, 180, musicAuthor, librettoText, 20);
        MusicalShow musicalShow = new MusicalShow("Без названия", directorOfBallet, 75, musicAuthor,
                "описание отсутсвует");

        //3. Распределить актёров по спектаклям. Используйте для этого метод добавления нового актёра в спектакль.
        // Один актёр может участвовать в нескольких спектаклях.
        ballet.addNewActor(actorKotov);
        ballet.addNewActor(actorSkvortsova);

        opera.addNewActor(actorRumyntsev);

        musicalShow.addNewActor(actorKotov);
        musicalShow.addNewActor(actorRumyntsev);
        musicalShow.addNewActor(actorSkvortsova);
        System.out.println();

        //4. Для каждого спектакля выведите на экран список актёров.
        System.out.println("Баллет \"Щелкунчик\"");
        ballet.printListOfActors();
        System.out.println();
        System.out.println("Опера \"Тихий Дон\"");
        opera.printListOfActors();
        System.out.println();
        System.out.println("Шоу \"Без названия\"");
        musicalShow.printListOfActors();
        System.out.println();

        //5. Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров.
        ballet.replaceActor("Котов", actorRumyntsev);
        //6. Попробуйте заменить в другом спектакле несуществующего актёра
        opera.replaceActor("Токарев", actorKotov);
        System.out.println();

        //7. Для оперного и балетного спектакля выведите на экран текст либретто.
        ballet.printLibretto();
        opera.printLibretto();

//        Тестировал в процессе разработки
//        /*//System.out.println(director);
//        ArrayList<Actor> actorArrayList = new ArrayList<>();
//        actorArrayList.add(new Actor("Иванов", "Иван", Gender.MALE, 185));
//        actorArrayList.add(new Actor("Скворцова", "Мария", Gender.FEMALE, 165));
//        actorArrayList.add(new Actor("Сидоров", "Иван", Gender.MALE, 178));
//        Person musicalAutor = new Person( "Людвиг", "Бетховен", Gender.MALE);
//        String librettoText = "какой-то текст";
//        Ballet ballet = new Ballet("ballet1", directorOfOpera, 300, actorArrayList, musicalAutor, librettoText,
//                musicalAutor);
//        ballet.printDirector();
//        ballet.printLibretto();
//        ballet.printListOfActors();
//
//        ballet.addNewActor(new Actor("Скворцова", "Мария", Gender.FEMALE, 165));
//        ballet.addNewActor(new Actor("Иванов", "Иван", Gender.MALE, 186));
//        ballet.printListOfActors();
//        System.out.println();
//
//        *//*//*/проверка на не участвует
//        ballet.replaceActor(new Actor("Иванов", "Иван", Gender.MALE, 187),
//                new Actor("Иванов", "Иван", Gender.MALE, 200));
//        //проверка на успешную замену
//        ballet.replaceActor(new Actor("Иванов", "Иван", Gender.MALE, 186),
//                new Actor("Иванов", "Иван", Gender.MALE, 200));
//        //проверка на уже участвует
//        ballet.replaceActor(new Actor("Иванов", "Иван", Gender.MALE, 185),
//                new Actor("Иванов", "Иван", Gender.MALE, 200));*//*
//        //проверка на не участвует
//        ballet.replaceActor("Журавлев", new Actor("Иванов", "Иван", Gender.MALE, 200));
//        //проверка на успешную замену
//        ballet.replaceActor("Сидоров", new Actor("Иванов", "Иван", Gender.MALE, 200));
//        //проверка на уже участвует
//        ballet.replaceActor("Иванов", new Actor("Иванов", "Иван", Gender.MALE, 200));
//        ballet.printListOfActors();*/

    }
}
