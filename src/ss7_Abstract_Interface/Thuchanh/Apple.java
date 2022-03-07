package ss7_Abstract_Interface.Thuchanh;

public class Apple extends Fruit {
    public Apple() {}
    public Apple(String type, String color) {
        super(type,color);
    }

    @Override
    public String howToEat() {
        return "Apple could be sliced";
    }
}
