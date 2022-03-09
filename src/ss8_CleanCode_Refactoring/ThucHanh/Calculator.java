package ss8_CleanCode_Refactoring.ThucHanh;

public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOpreand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOpreand + secondOperand;
            case SUBTRACTION:
                return firstOpreand - secondOperand;
            case MULTIPLICATION:
                return firstOpreand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOpreand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
