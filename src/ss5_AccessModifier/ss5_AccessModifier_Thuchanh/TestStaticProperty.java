package ss5_AccessModifier.ss5_AccessModifier_Thuchanh;


public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactib 3");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
