package Task1;

public class Car {
    private int year;
    private String color;

    public Car(int year, String color){
        this.year = year;
        this.color = color;
    }

    public Car(int year){
        this.year = year;
        this.color = "Black";
    }

    public Car() {
        this.year = 2019;
        this.color = "White";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }


}
