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
        task1();
        task2();
        task3();
        task4();
        task5();
        //Как сделать что бы task перевесть в printService?
    }

    public static void task1() {
        Gryffindor Hermione = new Gryffindor("Гермиона Грейнджер", 54, 67, 23);
        Gryffindor Harry = new Gryffindor("Гарри Поттер", 33, 45, 56);

        System.out.print("Гермиона - ");
        SystemHogwarts.statisticsGryffindor(new Gryffindor[]{Harry});
        System.out.print("Гарри - ");
        SystemHogwarts.statisticsGryffindor(new Gryffindor[] {Hermione});
        System.out.println("Гарри лучший Гриффиндорец, чем Гермиона");
        System.out.println();
    }

    public static void task2() {

        Hufflepuff Zechariah = new Hufflepuff("Захария Смит", 23, 76, 34);
        Hufflepuff Cedric = new Hufflepuff("Седрик Диггори", 54, 75, 72);

        System.out.print("Захария - ");
        SystemHogwarts.statisticsHufflepuff(new Hufflepuff[] {Zechariah});
        System.out.print("Седрик - ");
        SystemHogwarts.statisticsHufflepuff(new Hufflepuff[] {Cedric});
        System.out.println("Седрик лучший Пуфендуец, чем Захария");
        System.out.println();
    }

    public static void task3() {

        Ravenclaw Zhou = new Ravenclaw("Чжоу Чанг", 53, 57, 87, 34);
        Ravenclaw Padma = new Ravenclaw("Падма Патил", 65, 86, 23, 76);

        System.out.print("Чжоу - ");
        SystemHogwarts.statisticsRavenclaw(new Ravenclaw[] {Zhou});
        System.out.print("Падма - ");
        SystemHogwarts.statisticsRavenclaw(new Ravenclaw[] {Padma});
        System.out.println("Падма лучший Коктевранец, чем Чжоу");
        System.out.println();
    }

    public static void task4() {

        Slytherin Draco = new Slytherin("Драко Малфой", 65, 83, 89, 23, 66);
        Slytherin Gregory = new Slytherin("Грегори Гойл", 69, 37, 63, 79, 21);

        System.out.print("Драко - ");
        SystemHogwarts.statisticsSlytherin(new Slytherin[] {Draco});
        System.out.print("Грегори - ");
        SystemHogwarts.statisticsSlytherin(new Slytherin[] {Gregory});
        System.out.println("Драко лучший Слизареновец, чем Грегори");
        System.out.println();
    }

    public static void task5() {
    }
}