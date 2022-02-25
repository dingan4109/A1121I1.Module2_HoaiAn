package ss4_OOP.ss4_OOP_Thuchanh;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
    }

    public Rectangle(double with, double height) {
        this.width = with;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return  (this.width + this.height)*2;
    }

    public String display() {
        return "Rectangle( width: " + this.width + " , height: " + this.height;
    }
}
