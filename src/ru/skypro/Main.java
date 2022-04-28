package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Поттер"),
                new Hogwarts("Гермиона Грейнджер"),
                new Hogwarts("Рон Уизли"),
                new Hogwarts("Драко Малфой"),
                new Hogwarts("Грэхэм Монтегю"),
                new Hogwarts("Грегори Гойл"),
                new Hogwarts("Захария Смит"),
                new Hogwarts("Седрик Диггори"),
                new Hogwarts("Джастин Финч-Флетчли"),
                new Hogwarts("Чжоу Чанг"),
                new Hogwarts("Падма Патил"),
                new Hogwarts("Маркус Белби")
        };

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 33, 45, 56),
                new Gryffindor("Гермиона Грейнджер", 54, 67, 23),
                new Gryffindor("Рон Уизли", 23, 65, 23)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 23, 76, 34),
                new Hufflepuff("Седрик Диггори", 54, 75, 72),
                new Hufflepuff("Джастин Финч-Флетчли", 56, 82, 34)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 53, 57, 87, 34),
                new Ravenclaw("Падма Патил", 65, 86, 23, 76),
                new Ravenclaw("Маркус Белби", 76, 68, 96, 27)
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 65, 83, 89, 23, 66),
                new Slytherin("Грэхэм Монтегю", 74, 84, 26, 14, 68),
                new Slytherin("Грегори Гойл", 69, 37, 63, 79, 21)
        };

        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);
        printService.print(slytherins);
        //SystemHogwarts.statisticsGryffindor(gryffindors[1]);

    }

    public static void task1() {
        Gryffindor Hermione = new Gryffindor("Гермиона Грейнджер", 54, 67, 23);
        Gryffindor Harry = new Gryffindor("Гарри Поттер", 33, 45, 56);
    }


}