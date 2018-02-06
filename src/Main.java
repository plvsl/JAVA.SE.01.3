import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b, h;

        do {
            System.out.println("Enter initial number of the segment:");
            a = sc.nextDouble();

            System.out.println("Enter final number of the segment:");
            b = sc.nextDouble();

            System.out.println("Enter step value:");
            h = sc.nextDouble();

            if (checkParameters(a, b, h)) {
                System.out.println("Incorrect! Enter parameters again!");
                System.out.println("--------------------------------------");
            }

        } while (checkParameters(a, b, h));


        System.out.println("Argument  |  Function");
        System.out.println("--------------------");

        for (double i = a; i <= b; i += h) {
            double f = functionCounter(i);
            System.out.println(String.format("%-8f  |  %f", i, f));
        }
    }

    private static double functionCounter(double i) {
        return (Math.tan(2 * i)) - 3;
    }

    private static boolean checkParameters(double a, double b, double h) {
        return ((a > b) || ((b - a) < h) || (a == 0 && b == 0 && h == 0) || (h < 0));
    }
}
