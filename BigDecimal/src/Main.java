import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal(50);
        BigDecimal number2 = new BigDecimal(2);
bigDecimalCalculator(Operations.ADDITION,number1,number2);
        bigDecimalCalculator(Operations.SUBTRACTION,number1,number2);
        bigDecimalCalculator(Operations.MULTIPLICATION,number1,number2);
        bigDecimalCalculator(Operations.DIVIDE,number1,number2);
        bigDecimalCalculator(Operations.MAX,number1,number2);
        bigDecimalCalculator(Operations.MIN,number1,number2);
    }

    public static BigDecimal bigDecimalCalculator (Operations operations, BigDecimal a, BigDecimal b){
        BigDecimal result = null;
        switch (operations){
            case ADDITION :
                result = a.add(b);
                System.out.println(result);

            break;
            case SUBTRACTION :
                result = a.subtract(b);
                System.out.println(result);
            break;
            case MULTIPLICATION :
                result = a.multiply(b);
                System.out.println(result);
            break;
            case DIVIDE :
                result = a.divide(b);
                System.out.println(result);
            break;
            case MAX :
                result = a.max(b);
                System.out.println(result);
            break;
            case MIN :
                result = a.min(b);
                System.out.println(result);
                break;
            default:
                System.out.println("Wrong input");
        }
        return result;
    }
}