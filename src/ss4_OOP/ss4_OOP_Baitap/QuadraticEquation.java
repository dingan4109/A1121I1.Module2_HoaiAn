package ss4_OOP.ss4_OOP_Baitap;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = this.b*this.b-4*this.a*this.c;
        return delta;
    }

    public double getRoot() {
        return -this.b/2*this.a;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        double root1 = (-this.b + Math.sqrt(delta))/(2*this.a);
        return root1;
    }
    public double getRoot2() {
        double delta = getDiscriminant();
        double root2 = (-this.b - Math.sqrt(delta))/(2*this.a);
        return root2;
    }
}
