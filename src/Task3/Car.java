package Task3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;


    public Car(){
        this.year = 2021;
        this.speed = 110;
        this.weight = 1770;
        this.color = "Blue";
    }


    public Car(String color){
        this.year = 2020;
        this.speed = 100;
        this.weight = 1245;
        this.color = color;
    }

    public Car(int weight, String color){
        this(color);
        this.year = 2021;
        this.speed = 110;
        this.weight = weight;
    }


    public Car(double speed, int weight, String color){
       this(weight, color);
       this.year = 2019;
       this.speed = speed;
    }

    public Car(int year, double speed, int weight, String color){
        this(speed, weight, color);
        this.year = year;
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
