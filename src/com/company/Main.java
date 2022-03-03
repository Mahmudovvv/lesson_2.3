package com.company;

public class Main {

    public static void test() {
        // метод невозвращаемый и без входящих параметров
        int a = 9;
        System.out.println(a / 3);
    }

    public static void main(String[] args) {
        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();

        test();
        addition(2, 9, "Java");
        addition(45, 11, "Ayana");

        calculatePerimeter("Room 1", 4.0, 6.5);
        calculatePerimeter("Corridor", 1.0, 7.3);
        System.out.println("Room 1 area: " + calculateArea(4.0, 6.5));
        System.out.println("Corridor area: " + calculateArea(1.0, 7.3));
        System.out.println("Total area: " +
                (calculateArea(4.0, 6.5) +
                        calculateArea(1.0, 7.3)));
        System.out.println(concat('#', 4.5f, true));
        System.out.println(concat('#', 4.5F, false));
        System.out.println(concat('?', 2.6F, true));
    }

    public static String concat(char sign, float digit, boolean isSignInEnd) {
        String str = "Result of concatination: ";
        if (isSignInEnd) {
            str = str + " " + digit + " " + sign;
        } else {
            str = str + " " + sign + " " + digit;
        }
        return str;
    }

    public static double calculateArea(double width, double length) {
        // метод возвращаемый и с входящими параметрами
        return width * length;
    }

    public static void calculatePerimeter(String roomName,
                                          double width, double length) {
        // метод невозвращаемый и с входящими параметрами
        System.out.println("Perimeter of " + roomName + ": "
                + (width + length) * 2);
    }

    public static void addition(int num1, int num2, String text) {
        // метод невозвращаемый и с входящими параметрами
        System.out.println(num1 + num2);
        System.out.println(text);
    }

    public static void makeTea() {
        // метод невозвращаемый и без входящих параметров
        System.out.println("Вскипятить воду");
        System.out.println("Насыпать заварку и залить кипятком");
        System.out.println("Дать настояться");
        System.out.println("Налить в чашку");
        System.out.println("Добавить молоко, сахар по вкусу");
        test();
    }

    //test(); за телами методов выхывать нельзя
}
