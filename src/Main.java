public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 28;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " ,нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 65;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ",то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 28;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в университет");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 8;
        boolean adultIsHere = true;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " ,то ему нельзя кататься на аттракционе");
        }
        if (age > 5 && age < 14 && adultIsHere) {
            System.out.println("Если возраст ребенка равен " + age + " ,то он может кататься только со взрослыми." +
                    " Без взрослых нельзя кататься");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " ,то ему можно кататься без сопровождения взрослых");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int carriageCapacity = 102;
        int seatsBusy = 40;
        if (seatsBusy >= 60) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }
        if (seatsBusy >= 102) {
            System.out.println("В вагоне мест нет");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 54;
        int two = 4;
        int three = 14;
        boolean oneIsMax = one > two && one > three;
        boolean twoIsMax = two > one && two > three;
        boolean threeIsMax = three > one && three > two;
        if (oneIsMax) {
            System.out.println(one);
        } else if (twoIsMax) {
            System.out.println(two);
        } else if (threeIsMax) {
            System.out.println(three);
        }

    }
}