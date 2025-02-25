//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 ");

        int age = 18;
        if (age >=18) {
            System.out.println("Если возраст человека равен 18, то  он совершеннолетний " );
        }
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен 18, то  он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен 17, то он  еще  не достиг совершеннолетия" + " но нужно немного подождать");
        }
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("Пора надеть шапку");
        }
        int temperature1 = 10;
        if (temperature1 > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км придется заплатить штраф");
        }
        int speed2 =50;
        if (speed2 < 60) {
            System.out.println("Если скорость " + speed2 + " км можно ездить спокойно");
        }
        System.out.println("Задача 4 ");
        int years = 2;
        if (years >= 2 && years < 6) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в детский сад");
        }
        int years2 = 7;
        if (years2 >= 7 && years2 < 17) {
            System.out.println("Если возраст человека равен " + years2 + " то ему нужно ходить в школу");
        }
        int years3 = 18;
        if (years3 >= 18 && years3 < 24) {
            System.out.println("Если возраст человека равен " + years3 + " то его место в университете");
        }
        int years4 = 24;
        if (years4 >= 24 ) {
            System.out.println("Если возраст человека равен " + years4 + " то ему пора ходить на работу");
        }
        System.out.println("Задача 5");

        int theChildIsYounger = 3;
        if (theChildIsYounger <= 5) {
            System.out.println("Если возраст ребенка равен то ему " + theChildIsYounger + " нельзя кататься на аттракционе ");
        }
        int theChildIsOlder = 10;
        if (theChildIsOlder >= 5 && theChildIsOlder < 14) {
            System.out.println("Если возраст ребенка равен, то ему " + theChildIsOlder + " можно кататься на аттракционе в сопровождении");
        }
        int theChildIsOlder2 = 14;
        if (theChildIsOlder2 >= 14 ) {
            System.out.println("Если возраст ребенка равен, то ему " + theChildIsOlder2 + " Можно каться без сопровождения взрослого");
        }
        System.out.println("Задача 6");
        int seatingCapacity = 0;
        if (seatingCapacity >= 60) {
            System.out.println("Если мест " + seatingCapacity + " то место стоячее");
        } else {
            System.out.println("Если мест " + seatingCapacity + " то вогон полный");
        }
        System.out.println("Задача 7");
        int one = 5;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one);
        } else if ( two > one && two > three) {
            System.out.println("Число " + two);
        } else  if ( three > two && three < one) {
            System.out.println("Число " + three);
        }

    }
}