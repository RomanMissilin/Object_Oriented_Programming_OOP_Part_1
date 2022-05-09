package ru.skypro;

public class PrintService {

    public void print(Gryffindor[] gryffindors) {

        System.out.println("Список студентов = " + gryffindors.length);
        for (Gryffindor gryffindor : gryffindors) {
            System.out.println("Имя - " + gryffindor.getStudent()
                    + "; Благородство - " + gryffindor.getNobility()
                    + "; Честь - " + gryffindor.getHonour()
                    + "; Храбрость - " + gryffindor.getBravery());
        }
        System.out.println();
    }

    public void print(Hufflepuff[] hufflepuffs) {

        System.out.println("Список студентов = " + hufflepuffs.length);
        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println("Имя - " + hufflepuff.getStudent()
                    + "; Трудолюбие - " + hufflepuff.getIndustrious()
                    + "; Верность - " + hufflepuff.getTrues()
                    + "; Честность - " + hufflepuff.getHonest());
        }
        System.out.println();
    }

    public void print(Ravenclaw[] ravenclaws) {

        System.out.println("Список студентов = " + ravenclaws.length);
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println("Имя - " + ravenclaw.getStudent()
                    + "; Ум - " + ravenclaw.getSmart()
                    + "; Мудрость - " + ravenclaw.getWise()
                    + "; Остроумность - " + ravenclaw.getWitty()
                    + "; Полны творчества - " + ravenclaw.getFullOfCreativity());
        }
        System.out.println();
    }

    public void print(Slytherin[] slytherins) {

        System.out.println("Список студентов = " + slytherins.length);
        for (Slytherin slytherin : slytherins) {
            System.out.println("Имя - " + slytherin.getStudent()
                    + "; Хитрость - " + slytherin.getInherentCunning()
                    + "; Решительность - " + slytherin.getDetermination()
                    + "; Амбициозность - " + slytherin.getAmbition()
                    + "; Находчивость - " + slytherin.getResourcefulness()
                    + "; Жажда власти - " + slytherin.getLustForPower());
        }
        System.out.println();
    }
}