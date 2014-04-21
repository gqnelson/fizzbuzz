/**
 * Created by wnelson on 4/21/14.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Welcome to FizzBuzz!");
        printNumbers();
    }

    private static void printNumbers() {
        for (int i = 1; i < 101; i++) {
            System.out.println(formatNumber(i));
        }
    }

    private static String formatNumber(int i) {
        StringBuilder number = new StringBuilder();
        if (i % 3 == 0) number.append("Fizz");
        if (i % 5 == 0) number.append("Buzz");
        if (number.length() == 0) number.append(i);
        return number.toString();
    }
}
