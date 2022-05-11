package ru.skypro;

public class SystemHogwarts {

    public static void compareGryffindorStudents(Gryffindor first, Gryffindor second) {

        int firstSum = first.getNobility() + first.getHonour() + first.getBravery();
        int secondSum = second.getNobility() + second.getHonour() + second.getBravery();
        if (firstSum > secondSum) {
            System.out.println(first.getStudent() + " лучший Гриффиндорец, чем " + second.getStudent());
        } else if (secondSum > firstSum) {
            System.out.println(second.getStudent() + " лучший Гриффиндорец, чем " + first.getStudent());
        } else {
            System.out.println(first.getStudent() + " и " + second.getStudent() + " равны как гриффиндорцы");
        }
        System.out.println();
    }

    public static void compareHufflepuffStudents(Hufflepuff first, Hufflepuff second) {

        int firstSum = first.getIndustrious() + first.getTrues() + first.getHonest();
        int secondSum = second.getIndustrious() + second.getTrues() + second.getHonest();
        if (firstSum > secondSum) {
            System.out.println(first.getStudent() + " лучший Пуффендуец, чем " + second.getStudent());
        } else if (secondSum > firstSum) {
            System.out.println(second.getStudent() + " лучший Пуффендуец, чем " + first.getStudent());
        } else {
            System.out.println(first.getStudent() + " и " + second.getStudent() + " равны как Пуффендуйцы");
        }
        System.out.println();
    }

    public static void compareRavenclawStudents(Ravenclaw first, Ravenclaw second) {

        int firstSum = first.getSmart() + first.getWise() + first.getWitty() + first.getFullOfCreativity();
        int secondSum = second.getSmart() + second.getWise() + second.getWitty() + second.getFullOfCreativity();
        if (firstSum > secondSum) {
            System.out.println(first.getStudent() + " лучший Коктевранец, чем " + second.getStudent());
        } else if (secondSum > firstSum) {
            System.out.println(second.getStudent() + " лучший Коктевранец, чем " + first.getStudent());
        } else {
            System.out.println(first.getStudent() + " и " + second.getStudent() + " равны как Коктевранцы");
        }
        System.out.println();
    }

    public static void compareSlytherinStudents(Slytherin first, Slytherin second) {

        int firstSum = first.getInherentCunning() + first.getDetermination() + first.getAmbition() + first.getResourcefulness() + first.getLustForPower();
        int secondSum = second.getInherentCunning() + second.getDetermination() + second.getAmbition() + second.getResourcefulness() + second.getLustForPower();
        if (firstSum > secondSum) {
            System.out.println(first.getStudent() + " лучший Слизореновец, чем " + second.getStudent());
        } else if (secondSum > firstSum) {
            System.out.println(second.getStudent() + " лучший Слизореновец, чем " + first.getStudent());
        } else {
            System.out.println(first.getStudent() + " и " + second.getStudent() + " равны как Слизореновцы");
        }
        System.out.println();
    }

    public static void compareHogwartsStudent(Gryffindor first, Hufflepuff second) {

        int firstSum = first.getForce();
        int secondSum = second.getForce();
        if (firstSum > secondSum) {
            System.out.println(first.getStudent() + " обладает большей мощностью магии, чем " + second.getStudent());
        } else if (secondSum > firstSum) {
            System.out.println(second.getStudent() + " обладает большей мощностью магии, чем " + first.getStudent());
        } else {
            System.out.println(first.getStudent() + " и " + second.getStudent() + " Обладают равной силой");
        }
    }
    public void printSquare(int num) {
        System.out.println(num * num);
    }
}