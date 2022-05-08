package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Поттер", 97),
                new Hogwarts("Гермиона Грейнджер", 87),
                new Hogwarts("Рон Уизли",54),
                new Hogwarts("Драко Малфой",54),
                new Hogwarts("Грэхэм Монтегю",65),
                new Hogwarts("Грегори Гойл",79),
                new Hogwarts("Захария Смит",95),
                new Hogwarts("Седрик Диггори",69),
                new Hogwarts("Джастин Финч-Флетчли",57),
                new Hogwarts("Чжоу Чанг",72),
                new Hogwarts("Падма Патил",45),
                new Hogwarts("Маркус Белби",84)
        };

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 97,33, 45, 56),
                new Gryffindor("Гермиона Грейнджер", 87,54, 67, 23),
                new Gryffindor("Рон Уизли", 54,23, 65, 23)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 95,23, 76, 34),
                new Hufflepuff("Седрик Диггори", 69,54, 75, 72),
                new Hufflepuff("Джастин Финч-Флетчли", 57,56, 82, 34)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 72,53, 57, 87, 34),
                new Ravenclaw("Падма Патил", 45,65, 86, 23, 76),
                new Ravenclaw("Маркус Белби", 84,76, 68, 96, 27)
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 54,65, 83, 89, 23, 66),
                new Slytherin("Грэхэм Монтегю", 65,74, 84, 26, 14, 68),
                new Slytherin("Грегори Гойл", 79,69, 37, 63, 79, 21)
        };

        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);
        printService.print(slytherins);
        task1();
        task2();
        task3();
        task4();
        task5();
        //Как сделать что бы task перевесть в printService?
    }

     public static void task1() {

         Gryffindor Hermione = new Gryffindor("Гермиона Грейнджер", 87, 54, 67, 23);
         Gryffindor Harry = new Gryffindor("Гарри Поттер", 97, 33, 45, 56);

      SystemHogwarts.compareGryffindorStudents(Hermione, Harry);
}

    public static void task2() {

        Hufflepuff Zechariah = new Hufflepuff("Захария Смит", 95, 23, 76, 34);
        Hufflepuff Cedric = new Hufflepuff("Седрик Диггори", 69, 54, 75, 72);

        SystemHogwarts.compareHufflepuffStudents(Zechariah, Cedric);
    }

    public static void task3() {

        Ravenclaw Zhou = new Ravenclaw("Чжоу Чанг", 72, 53, 57, 87, 34);
        Ravenclaw Padma = new Ravenclaw("Падма Патил", 45, 65, 86, 23, 76);

        SystemHogwarts.compareRavenclawStudents(Zhou, Padma);
    }

    public static void task4() {

        Slytherin Draco = new Slytherin("Драко Малфой", 54, 65, 83, 89, 23, 66);
        Slytherin Gregory = new Slytherin("Грегори Гойл", 79, 69, 37, 63, 79, 21);

        SystemHogwarts.compareSlytherinStudents(Draco, Gregory);
    }

    public static void task5() {

        Hogwarts Justin = new Hogwarts("Джастин Финч-Флетчли", 57);
        Hogwarts Graham = new Hogwarts("Грэхэм Монтегю", 65);

        SystemHogwarts.compareHogwartsStudent(Justin, Graham);
    }
}