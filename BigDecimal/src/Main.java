import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal(50);
        BigDecimal number2 = new BigDecimal(2);
        bigDecimalCalculator(Operations.ADDITION, number1, number2);
        bigDecimalCalculator(Operations.SUBTRACTION, number1, number2);
        bigDecimalCalculator(Operations.MULTIPLICATION, number1, number2);
        bigDecimalCalculator(Operations.DIVIDE, number1, number2);
        bigDecimalCalculator(Operations.MAX, number1, number2);
        bigDecimalCalculator(Operations.MIN, number1, number2);
    }

    public static void bigDecimalCalculator(Operations operations, BigDecimal a, BigDecimal b) {
        BigDecimal result;
        switch (operations) {
            case ADDITION -> {
                result = a.add(b);
                System.out.println("Result of addition is  " + result);
            }
            case SUBTRACTION -> {
                result = a.subtract(b);
                System.out.println("Result of subtraction is  " + result);
            }
            case MULTIPLICATION -> {
                result = a.multiply(b);
                System.out.println("Result of multiplication is  " + result);
            }
            case DIVIDE -> {
                result = a.divide(b, RoundingMode.CEILING);
                System.out.println("Result of division is  " + result);
            }
            case MAX -> {
                result = a.max(b);
                System.out.println("The max number between A and B is  " + result);
            }
            case MIN -> {
                result = a.min(b);
                System.out.println("The min number between A and B is  " + result);
            }
            default -> System.out.println("Wrong input");
        }
    }
}