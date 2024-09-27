import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age1 = 18;
        System.out.println("Задача 1");
        System.out.println("-----------------------");

        System.out.print("Введите свой возраст для определения совершеннолетия: ");
        int age = console.nextInt();
        if (age >= age1) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }else if (age < age1){
            System.out.println("Если возраст человека меньше " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("-----------------------" + "\n");

        System.out.print("Введите текущую температуру на улице: ");
        int temperature = console.nextInt();
        System.out.println("Задача 2");
        System.out.println("-----------------------");
        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("-----------------------");


        System.out.println("Задача 3");
        System.out.println("-----------------------");
        System.out.print("Введите скорость вашего автомобиля: ");
        int speed = console.nextInt();
        System.out.print("Если скорость " + speed);
        if (speed <= 60) {
            System.out.println(" то можно ездить спокойно");
        } else if (speed > 60) {
            System.out.println(" то придется заплатить штраф");
        }
        System.out.println("-----------------------");

        System.out.println("Задача 4");
        System.out.println("-----------------------");
        System.out.print("Введите ваш возраст для определения, куда вам нужно ходить: ");
        int ageEduInput = console.nextInt();
        System.out.print("Если возраст человека равен " + ageEduInput);
        if (ageEduInput >= 2 && ageEduInput <= 6) {
            System.out.println(" то ему нужно ходить в детский сад.");
        } else if (ageEduInput >= 7 && ageEduInput < 17) {
            System.out.println(" то ему нужно ходить в школу.");
        } else if (ageEduInput >= 18 && ageEduInput <= 24) {
            System.out.println(" то его место в университете");
        } else if (ageEduInput > 24){
            System.out.println(" то ему нужно ходить на работу");
        }
        System.out.println("-----------------------");

        System.out.println("Задача 5");
        System.out.println("-----------------------");
        System.out.print("Введите ваш возраст для определения возможности кататься на аттракционе: ");
        int ageToDrive = console.nextInt();
        System.out.print("Если возраст ребенка равен " + ageToDrive);
        if (ageToDrive <= 5) {
            System.out.println(" то ему нельзя кататься на аттракционе");
        } else if (ageToDrive > 5 && ageToDrive <= 14) {
            System.out.println(" то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if ( ageToDrive > 14 ) {
            System.out.println(" то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("-----------------------");

        System.out.println("Задача 6");
        System.out.println("-----------------------");
        System.out.print("Введите кол-во пассажиров поезда ");
        int maxPass = 102;
        int sit = 60;
        int stand = 62;
        int passengers = console.nextInt();
        System.out.print("Если в поезде " + passengers + " пассажиров");
        if (passengers > 102) {
            System.out.println(", вагон уже полностью забит");
        } else if (passengers < 60) {
            System.out.println(", в позде осталось " + (sit - passengers) + " сидячих мест(а/о)");
        } else if (passengers < maxPass && passengers > 60) {
            System.out.println(", в позде осталось " + (stand - passengers) + " стоячих мест(а/о)");
        }

        System.out.println("Задача 7");
        System.out.println("-----------------------");
        System.out.print("Введите число x: ");
        int one = console.nextInt();
        System.out.print("Введите число y: ");
        int two = console.nextInt();
        System.out.print("Введите число z: ");
        int three = console.nextInt();
        if (one > two && one > three) {
            System.out.println("Самое большое число из введенных: " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число из введенных: " + two);
        } else if (three > one && three > two) {
            System.out.println("Самое большое число из введенных: " + three);
        }
        System.out.println("-----------------------");
    }


}