package Task1;

public class Main {
    public static void main(String[] args) {
        Car carWithTwoParameter = new Car(2020,"Grey");
        Car carWithOneParameter = new Car(2010);
        Car carDefault = new Car();

        System.out.println("Year: " + carWithTwoParameter.getYear() + "; Color: " + carWithTwoParameter.getColor() );
        System.out.println("Year: " + carWithOneParameter.getYear() + "; Color: " + carWithOneParameter.getColor());
        System.out.println("Year: " + carDefault.getYear() + "; Color: " + carDefault.getColor());
     }
}
