import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger m = new BigInteger(scanner.next());

        BigInteger number = BigInteger.ZERO;
        BigInteger factorial = BigInteger.ONE;


        while (true) {
            if (m.compareTo(factorial) <= 0) {
                System.out.println(number);
                break;
            } else {
                number = number.add(BigInteger.ONE);
                factorial = factorial.multiply(number);
            }
        }
    }
}