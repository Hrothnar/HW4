public class Main {
    public static void main(String[] args) {

        //task1
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("До наступления совершеннолетия тебе нужно ещё немного подождать");
        }


        //task2
        int personAge = 6;
        if (personAge >= 7 && personAge < 18) {
            System.out.println("Тебе пора в школу");
        } else if (personAge >= 18 && personAge < 24) {
            System.out.println("Тебе пора поступать в ВУЗ");
        } if (personAge >= 24) {
            System.out.println("Пора устраиваться на работу");
        }


        //task3
        int wagonCapacity = 102;
        int people = 100;
        if (people < 60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (people >= 60 && people < wagonCapacity ) {
            System.out.println("В вагоне есть стоячие места");
        } else  {
            System.out.println("Нет ни стоячих, ни сидячих мест");
        }


        //task4
        int age1 = 17;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в садик");
        } if (age1 >= 7 && age1 <= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } if (age1 > 18 && age1 < 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        } if (age1 >= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        }


        //task5
        int age2 = 4;
        if (age2 < 5) {
            System.out.println("Если ребёнку " + age2 + ", то он не может кататься на аттракционе");
        } else if (age2 >= 5 && age2 < 14) {
            System.out.println("Если ребёнку " + age2 + ", то он может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Если ребёнку " + age2 + ", то он может кататься на аттракционе без взрослых");
        }


        //task6
        int one = -54;
        int two = -46;
        int three = -11;
        if (one > two && two > three) {
            System.out.println(one);
        } else if (one < two && two < three) {
            System.out.println(three);
        } else {
            System.out.println(two);
        }

    }
}