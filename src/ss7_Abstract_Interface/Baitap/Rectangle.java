package ss7_Abstract_Interface.Baitap;

public class Rectangle extends Shape implements Resizeable{
    private double width = 2.0;
    private double height = 5.0;

    public Rectangle() {}
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        this.width = width + width*percent/100;
        this.height = height + height*percent/100;
    }

    @Override
    public String display() {
        return "A Rectangle with width = " + width + " and height = " + height;
    }
    public double getArea() {
        return width*height;
    }
}
