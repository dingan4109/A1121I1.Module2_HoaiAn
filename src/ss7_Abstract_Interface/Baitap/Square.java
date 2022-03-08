package ss7_Abstract_Interface.Baitap;

public class Square extends Shape implements Resizeable, Colorable{
    private double size = 5;

    public Square() {}

    @Override
    public double getArea() {
        return size*size;
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void resize(double percent) {
        this.size = size + size*percent/100;
    }

    @Override
    public String display() {
        return "A Square with size = " + size;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

}
