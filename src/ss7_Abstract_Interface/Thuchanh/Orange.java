package ss7_Abstract_Interface.Thuchanh;

public class Orange extends Fruit{
    public Orange() {}
    public Orange(String type, String color) {
        super(type,color);
    }

    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}
