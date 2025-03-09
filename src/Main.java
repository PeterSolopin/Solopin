//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 ");

        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " 18, то  он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2");
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км можно ехать спокойно");
        }
        System.out.println("Задача 4 ");
        int years = 21;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в детский сад");
        } else if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в школу");
        } else if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + " то его место в университете");
        } else if (years > 24) {
            System.out.println("Если возраст человека равен " + years + " то ему пора ходить на работу");
        }

        System.out.println("Задача 5");
        int theChild = 9;
        boolean isAdultPresent = true;
        if (theChild < 5) {
            System.out.println("Если возраст ребенка равен то ему " + theChild + " нельзя кататься на аттракционе");
        } else if (theChild >= 5 && theChild < 14) {
            if (isAdultPresent) {
            System.out.println("Если возраст ребенка равен, то ему " + theChild + " можно кататься на аттракционе в сопровождении взрослого");
        } else {
                System.out.println("Если возраст ребенка равен, то ему " + theChild + " нельзя кататься на аттракционе");
            }
        } else if (theChild >= 14) {
            System.out.println("Если возраст ребенка равен, то ему " + theChild + " Можно каться без сопровождения взрослого");
        }
        System.out.println("Задача 6");
        int totalSeats = 60;
        int totalStanding = 42;
        int totalCapacity = totalSeats + totalStanding;
        int passengers = 95;
        if (passengers < totalSeats) {
            System.out.println("В вагоне есть сидячие места");
        } else if (passengers < totalCapacity) {
            System.out.println("В вагоне есть только стоячие места");
        }else {
            System.out.println("Вагон полнстью забит");
        }
        System.out.println("Задача 7");
        int one = 10;
        int two = 25;
        int three = 15;
        if (one > two && one > three) {
            System.out.println("Число " + one);
        } else if ( two > one && two > three) {
            System.out.println("Число " + two);
        } else  if ( three > two && three < one) {
            System.out.println("Число " + three);
        } else {
            System.out.println("Все числа равны или есть одинаковые наибольшие числа");
        }
    }
}