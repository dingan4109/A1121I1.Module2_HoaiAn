package ss5_AccessModifier.ss5_AccessModifier_Baitap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(5);

        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());

    }
}
