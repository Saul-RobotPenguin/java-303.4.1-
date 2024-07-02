import java.util.ArrayList;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        multiplicationLoops();
        greatestCommonDivisor();
        predictFutureTuition();
    }

    static void multiplicationLoops() {
        for (int i = 1; i <= 12; i++) {
            for (int n = 1; n <= 12; n++) {
                System.out.println(i * n);
            }
        }
    }

    static void greatestCommonDivisor() {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> divisors = new ArrayList<Integer>();

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                divisors.add(i);
            }
        }
        System.out.println(divisors.get(divisors.size() - 1));

    }

    static void predictFutureTuition() {
        double startingTuition = 10000;
        double tuitionDoubled = 20000;
        int years;

        for (years = 0; startingTuition < tuitionDoubled; years++) {
            startingTuition = startingTuition + ((double) (startingTuition) * 0.07);
        }
        System.out.printf("It would be approximately %d years for the tuition to double which would be around %.2f",
                years, startingTuition);

    }
}
