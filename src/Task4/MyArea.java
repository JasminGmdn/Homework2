package Task4;

import java.util.Scanner;

public class MyArea {
    static double PI = 3.14;


    public static double areaOfCircle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        double r = in.nextInt();


        double result = 0;
        result = (r * PI);
        return result;
    }
}
