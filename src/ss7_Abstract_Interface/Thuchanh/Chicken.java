package ss7_Abstract_Interface.Thuchanh;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Cluck"; //or bok bok bitch =)))))
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
