package ru.skypro;

public class SystemHogwarts {

    public static void statisticsGryffindor(Gryffindor[] gryffindors) {
            int result = 0;
        for (Gryffindor gryffindor : gryffindors) {
            result = gryffindor.getNobility()
                    + gryffindor.getHonour()
                    + gryffindor.getBravery();
        }
            System.out.println(result);
        }

    public static void statisticsHufflepuff(Hufflepuff[] hufflepuffs) {
        int result = 0;
        for (Hufflepuff hufflepuff : hufflepuffs) {
            result = hufflepuff.getIndustrious()
                    + hufflepuff.getTrues()
                    + hufflepuff.getHonest();
        }
        System.out.println(result);
    }

    public static void statisticsRavenclaw(Ravenclaw[] ravenclaws) {
        int result = 0;
        for (Ravenclaw ravenclaw : ravenclaws) {
            result = ravenclaw.getSmart()
                    + ravenclaw.getWise()
                    + ravenclaw.getWitty()
                    + ravenclaw.getFullOfCreativity();
        }
        System.out.println(result);
    }

    public static void statisticsSlytherin(Slytherin[] slytherins) {
        int result = 0;
        for (Slytherin slytherin : slytherins) {
            result = slytherin.getInherentCunning()
                    + slytherin.getDetermination()
                    + slytherin.getAmbition()
                    + slytherin.getResourcefulness()
                    + slytherin.getLustForPower();
        }
        System.out.println(result);
    }
}
