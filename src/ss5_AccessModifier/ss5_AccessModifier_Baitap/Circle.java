package ss5_AccessModifier.ss5_AccessModifier_Baitap;

public class Circle {
    private double radius = 1;
    private String color = "red";

    Circle(){

    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}
