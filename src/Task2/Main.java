package Task2;

public class Main {
    public static void main(String[] args) {
        Car carWithFourParameter = new Car(2018, 100, 1750, "Green");
        Car carWithThreeParameter = new Car(100,2108, "White" );
        Car carWithTwoParameter = new Car(2033, "Red");
        Car carWithOneParameter = new Car("Grey");
        Car carDefault = new Car();

        System.out.println("Year: " + carWithFourParameter.getYear() + "; Speed: " + carWithFourParameter.getSpeed()
        + "; Weight: " + carWithFourParameter.getWeight() + "; Color: " + carWithFourParameter.getColor());
        System.out.println("Year: " + carWithThreeParameter.getYear() + "; Speed: " + carWithThreeParameter.getSpeed()
        + "; Weight: " + carWithThreeParameter.getWeight() + "; Color: " + carWithThreeParameter.getColor());
        System.out.println("Year: " + carWithTwoParameter.getYear() + "; Speed: " + carWithTwoParameter.getSpeed()
        + "; Weight: " + carWithTwoParameter.getWeight() + "; Color: " + carWithTwoParameter.getColor());
        System.out.println("Year: " + carWithOneParameter.getYear() + "; Speed: " + carWithOneParameter.getSpeed()
        + "; Weight: " + carWithOneParameter.getWeight() + "; Color: " + carWithOneParameter.getColor());
        System.out.println("Year: " + carDefault.getYear() + "; Speed: " + carDefault.getSpeed() +
                "; Weight: " + carDefault.getWeight() + "; Color: " + carDefault.getColor());
    }
}
