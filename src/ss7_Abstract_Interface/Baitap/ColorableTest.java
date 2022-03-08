package ss7_Abstract_Interface.Baitap;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] arrayShape = new Shape[3];
        arrayShape[0] = new Circle();
        arrayShape[1] = new Rectangle();
        arrayShape[2] = new Square();

        for (Shape i : arrayShape) {
            if(i instanceof Square) {
                ((Square) i).howToColor();
            }else System.out.println(i.getArea());
        }
    }
}
