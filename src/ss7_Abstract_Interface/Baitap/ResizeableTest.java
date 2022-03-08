package ss7_Abstract_Interface.Baitap;

public class ResizeableTest {
    public static void main(String[] args) {
        //TEST Circle
        Circle circle1 = new Circle();
        circle1.resize(20);
        System.out.println(circle1.display());
        Circle circle2 = new Circle(3);
        circle2.resize(100);
        System.out.println(circle2.display());

        //TEST Rectangle
        Rectangle rectangle1 = new Rectangle();
        rectangle1.resize(30);
        System.out.println(rectangle1.display());
        Rectangle rectangle2 = new Rectangle(3,5);
        rectangle2.resize(100);
        System.out.println(rectangle2.display());

        //TEST Square
        Square square1 = new Square();
        square1.resize(15);
        System.out.println(square1.display());
        Square square2 = new Square(6);
        square2.resize(5);
        System.out.println(square2.display());

    }
}
