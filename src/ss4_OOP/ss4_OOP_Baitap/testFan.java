package ss4_OOP.ss4_OOP_Baitap;

public class testFan {
    public static void main(String[] args) {
        Fan obj1 = new Fan();
        Fan obj2 = new Fan();

        obj1.setSpeed(obj1.FAST);
        obj1.setRadius(10);
        obj1.setColor("Yellow");
        obj1.setOn(true);
        System.out.println(obj1.toString());

        obj2.getSpeed();
        obj2.getRadius();
        obj2.getColor();
        obj2.isOn();
        System.out.println(obj2.toString());

    }
}
