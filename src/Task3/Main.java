package Task3;

import Task2.Car;

public class Main {
    public static void main(String[] args) {
        Task2.Car carDefault = new Car();
        Task2.Car carWithOneParameter = new Task2.Car("Grey");
        Task2.Car carWithTwoParameter = new Task2.Car(2223, "Green");
        Task2.Car carWithThreeParameter = new Task2.Car(100,1238, "White" );
        Task2.Car carWithFourParameter = new Task2.Car(2017, 100, 1990, "Blue");


    System.out.println("Year: " + carDefault.getYear() + "; Speed: " + carDefault.getSpeed()
            + "; Weight: " + carDefault.getWeight() + "; Color: " + carDefault.getColor());
    System.out.println("Year: " + carWithOneParameter.getYear() + "; Speed: " + carWithOneParameter.getSpeed()
            + "; Weight: " + carWithOneParameter.getWeight() + "; Color: " + carWithOneParameter.getColor());
    System.out.println("Year: " + carWithTwoParameter.getYear() + "; Speed: " + carWithTwoParameter.getSpeed()
            + "; Weight: " + carWithTwoParameter.getWeight() + "; Color: " + carWithTwoParameter.getColor());
    System.out.println("Year: " + carWithThreeParameter.getYear() + "; Speed: " + carWithThreeParameter.getSpeed()
            + "; Weight: " + carWithThreeParameter.getWeight() + "; Color: " + carWithThreeParameter.getColor());
    System.out.println("Year: " + carWithFourParameter.getYear() + "; Speed: " + carWithFourParameter.getSpeed()
            + "; Weight: " + carWithFourParameter.getWeight() + "; Color: " + carWithFourParameter.getColor());

    }
}
