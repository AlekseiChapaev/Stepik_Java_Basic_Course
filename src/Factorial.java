import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int value) {
        value = Math.abs(value);
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
