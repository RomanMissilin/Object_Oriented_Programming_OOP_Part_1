package ru.skypro;

public class SystemHogwarts {

    public static void statisticsGryffindor(Gryffindor[] gryffindors) {
            int result = 0;
            for (int i = 0; i < gryffindors.length; i++) {
                result = gryffindors[i].getNobility() + gryffindors[i].getHonour() + gryffindors[i].getBravery();
            }
            System.out.println(result);
        }
}
