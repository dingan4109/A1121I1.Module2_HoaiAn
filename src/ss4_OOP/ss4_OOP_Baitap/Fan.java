package ss4_OOP.ss4_OOP_Baitap;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;

    private int speed = this.SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Fan() {

    }

    public String toString() {
        if(on) return "Fan is on\n Speed: " + getSpeed() + "\n Color: " + getColor() + "\n " +
                "Radius: " + getRadius();
        else return "Fan is off\n Color: " + getColor() + "\n Radius: " + getRadius();
    }

}
