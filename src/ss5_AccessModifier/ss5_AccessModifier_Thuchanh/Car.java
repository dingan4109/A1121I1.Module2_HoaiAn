package ss5_AccessModifier.ss5_AccessModifier_Thuchanh;

public class Car {
    //static variable with defaul value: 0
    public static int numberOfCars;

    private String name;
    private String engine;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;

        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
