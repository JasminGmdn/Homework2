package Task2;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;

    }

    public Car(double speed, int weight, String color){
        this.year = 2015;
        this.speed = speed;
        this.weight = weight;
        this.color = color;

    }

    public Car(int weight, String color){
        this.year = 2020;
        this.speed = 110;
        this.weight = weight;
        this.color = color;

    }

    public Car(String color){
        this.year = 2020;
        this.speed = 110;
        this.weight = 1775;
        this.color = color;

    }

    public Car(){
        this.year = 2021;
        this.speed = 110;
        this.weight = 2180;
        this.color = "Black";
    }

    public int getYear() { return year; }
    public void setYear(int year){ this.year = year; }

    public double getSpeed(){ return speed; }
    public void setSpeed(double speed) { this.speed = speed; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public String getColor() { return color; }
    public void setColor(String color){ this.color = color; }

}
