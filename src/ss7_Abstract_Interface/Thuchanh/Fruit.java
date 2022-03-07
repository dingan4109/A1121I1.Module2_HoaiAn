package ss7_Abstract_Interface.Thuchanh;

public abstract class Fruit implements Edible{
    private String type;
    private String color;

    public Fruit() {
    }

    public Fruit(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
